package com.psl.demo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class DeSerializeDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		try
		{
			FileInputStream fis = new FileInputStream("test.ser");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
		

//			List<Employee> eList = (List<Employee>) ois.readObject();
//			
//			for(Employee e : eList)
//			{
//				System.out.println(e);
//			}
			
			 
			Employee e = (Employee)ois.readObject();
			System.out.println(e);
			
			while(e!=null)//*
			{	try
				{
					e = (Employee)ois.readObject();
				}
				catch(EOFException e2)
				{
					break;
				}
				System.out.println(e);
			}
			ois.close();
			fis.close();
			
			
		}
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
		catch(IOException e2)
		{
			e2.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
