package com.psl.demo;

public class AgeInvalidException extends Exception 
{
	public AgeInvalidException(String str)
	{
		System.out.println(str);
	}
	
	public void invalidAge() {
		// TODO Auto-generated method stub
		System.out.println("Age must be grater than 18");
	}
}
