package com.psl.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.psl.beans.Address;
import com.psl.beans.Student;
import com.psl.exceptions.InsufficientDataException;

//Override all the methods of the DataManager Interface
public class StudentDataManager implements DataManager {

	@Override
	public List<Student> populateData(String fileName) 
	{
		// TODO Auto-generated method stub
		List<Student> sList = new ArrayList<Student>();
		
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		Student s = null;
		Address a = null;
		int count = 1;
		try 
		{
			inputStream = new FileInputStream(fileName);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			String line;
			String[] data = new String[6];
			
			while( (line = bufferedReader.readLine()) != null )
			{
				data = line.split(",");
				if(data.length!=6);
				else
				{
					System.out.println(count++);
					s = new Student();
					if(!data[0].isEmpty())
						s.setRollno( Integer.valueOf(data[0]) );
					else
						s.setRollno(0);
					
					if(!data[1].isEmpty())
						s.setStudentName(data[1]);
					else
						s.setStudentName(null);

					if(!data[2].isEmpty())
						s.setAge(Integer.valueOf(data[2]));
					else
						s.setAge(0);
					
					a = new Address();
					if(!data[3].isEmpty())
						a.setStreetName(data[3]);
					else
						a.setStreetName(null);
					
					if(!data[4].isEmpty())
						a.setCity(data[4]);
					else
						a.setCity(null);
					
					//System.out.println("The value is:"+data[5]+":");
					if(data[5].equals(" "))
						a.setZipCode(null);
					else if(!data[5].isEmpty())
						a.setZipCode(data[5]);
					else
						a.setZipCode(null);

					s.setAddress(a);
					sList.add(s);
				}
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				bufferedReader.close();
				inputStream.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return sList;
	}

	@Override
	public void validateData(List<Student> studentList)
			throws InsufficientDataException {
		// TODO Auto-generated method stub
		boolean invalidFlag = false;
		List<Student> deleteList = new ArrayList<Student>();
		for(Student s : studentList)
		{
			if(s.getRollno()==0 || s.getStudentName()==null || s.getAge()==0 || s.getAddress().getStreetName()==null || s.getAddress().getCity()==null || s.getAddress().getZipCode()==null)
			{	
				deleteList.add(s);
				invalidFlag=true;
			}
		}
		for(Student s : deleteList)
		{
			studentList.remove(s);
		}
		deleteList.clear();
		
		if(invalidFlag)
			throw new InsufficientDataException();
	}

	@Override
	public void sortData(List<Student> studentList) {
		// TODO Auto-generated method stub
		
//		Collections.sort(studentList, new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student s1, Student s2) 
//			{
//				// TODO Auto-generated method stub
//				int sName = s1.getStudentName().compareTo(s2.getStudentName());
//				
//				if(sName==0)
//				{
//					if(s1.getAge() > s2.getAge())
//						return 1;
//					else if(s1.getAge() < s2.getAge())
//						return -1;
//					else
//					{
//						if(s1.getRollno() > s2.getRollno())
//							return 1;
//						else if(s1.getRollno() < s2.getRollno())
//							return -1;
//						else
//							return 0;
//					}
//				}
//					
//				
//				
//				return sName;
//			}
//			
//		});

		Collections.sort(studentList);
		
	}

	
}
