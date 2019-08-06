package com.util;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;

//Override and implement all the methods of DataManger Interface in this class
public class DataManagerImpl implements DataManager 
{

	@SuppressWarnings("unchecked")
	public List<Show> populateDataFromFile(String fileName) 
	{
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		List<Show> list = new ArrayList<Show>();
		boolean s = true;
		Show sh = null;
		try 
		{
			fileInputStream = new FileInputStream(fileName);
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			try 
			{
				while(s)
				{
					sh = (Show)objectInputStream.readObject();
					list.add(sh);
				}
			} 
			catch (EOFException e) 
			{
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			catch (ClassNotFoundException e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			
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

		finally
		{
			try 
			{
				objectInputStream.close();
				fileInputStream.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public void bookShow(List<Show> showList, String showName,
			String show_time, int noOfSeats) throws SeatsNotAvailableException,
			UnknownShowException, InvalidSeatNumberException {
		// TODO Auto-generated method stub
		boolean showIsThere = false;
		if(noOfSeats<=0)
			throw new InvalidSeatNumberException();
		
		for(Show s: showList)
		{
			if(s.getShowName().equals(showName))
				 showIsThere = true;
		}
		
		if(!showIsThere)
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
