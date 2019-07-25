package com.psl.demo;

public class UserDefException 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int age = 17;
		
		try {

			if(age < 18)
			{
				throw new AgeInvalidException("Invalid Age");
			}
			
		} catch (AgeInvalidException e) {
			// TODO: handle exception
			e.invalidAge();
		}
	}

}
