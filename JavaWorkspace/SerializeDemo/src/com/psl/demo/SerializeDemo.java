package com.psl.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializeDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e = new Employee(111, "James Bond", 50000);
		//System.out.println(e);
//		List<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee(111, "James Bond", 50000));
//		list.add(new Employee(112, "James Bond 2 ", 50000));
//		list.add(new Employee(113, "James Bond 3 ", 50000));
//		list.add(new Employee(114, "James Bond 4 ", 50000));
		
		try
		{
			FileOutputStream fos = new FileOutputStream("test.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			

			oos.writeObject(new Employee(111, "James Bond", 50000));
			oos.writeObject(new Employee(112, "James Bond", 50000));
			oos.writeObject(new Employee(113, "James Bond", 50000));
			oos.writeObject(new Employee(114, "James Bond", 50000));
			
			oos.close();
			fos.close();
			
			System.out.println("Writing Done....!!!");
		}
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
		catch(IOException e2)
		{
			e2.printStackTrace();
		}
	}

}
