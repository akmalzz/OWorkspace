package com.psl;

import java.util.List;

import com.psl.beans.Student;
import com.psl.exceptions.InsufficientDataException;
import com.psl.util.StudentDataManager;

public class Client {
	
	public static void main(String[] args) {
		
		//Create instance of StudentDataManager Class here and  test your functionality from here
		StudentDataManager sdm = new StudentDataManager();
		
		List<Student> sList = sdm.populateData("StudentDetails.txt");

		for(Student s : sList)
		{
			System.out.println(s);
		}
		
		try 
		{
			sdm.validateData(sList);
		} 
		catch (InsufficientDataException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Yes\n\n");
		}
		for(Student s : sList)
		{
			System.out.println(s);
		}
		sdm.sortData(sList);

		
	
	}
}
