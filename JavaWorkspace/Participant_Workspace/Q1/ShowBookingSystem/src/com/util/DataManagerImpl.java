package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;

//Override and implement all the methods of DataManger Interface in this class
public class DataManagerImpl implements DataManager 
{

	public List<Show> populateDataFromFile(String fileName) 
	{
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		List<Show> list = null;
		
		try 
		{
			fileInputStream = new FileInputStream(fileName);
			objectInputStream = new ObjectInputStream(fileInputStream);
		
			list = (List<Show>) objectInputStream.readObject();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}

	public void bookShow(List<Show> showList, String showName,
			String show_time, int noOfSeats) throws SeatsNotAvailableException,
			UnknownShowException, InvalidSeatNumberException {
		// TODO Auto-generated method stub
	
		if(noOfSeats<=0)
			throw new InvalidSeatNumberException();
		if(!showList.contains(showName))
			throw new UnknownShowException();
		else
		{
			for(Show s : showList)
			{
				if(s.getShowName().equalsIgnoreCase(showName) && s.getShowTime().equalsIgnoreCase(show_time))
				{
					if(s.getSeatsAvailable()<noOfSeats)
						throw new SeatsNotAvailableException();
					else
					{
						s.setSeatsAvailable(s.getSeatsAvailable() - noOfSeats);
					}
				}
			}
		}
		
	}
	
}
