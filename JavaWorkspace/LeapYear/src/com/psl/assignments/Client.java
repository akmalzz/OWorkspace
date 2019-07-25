package com.psl.assignments;

public class Client {

	public boolean isLeapYear(int year) 
	{
		boolean isLeap = false;
		
		if(year<=0)
			return isLeap;
		
		// Write your code here to test if the year passed as a parameter is a Leap Year or not.
		if ( (year%4)!=0 ) isLeap = false;
		else if ( (year%100)!=0 ) isLeap = true;
		else if (  (year%400)!=0 ) isLeap = false;
		else isLeap = true;
		
		return isLeap;
	}

	public static void main(String[] args) 
	{
		Client c = new Client();
		int year = 2020;
		if( c.isLeapYear(year) )
			System.out.println("It is a leap year");
		else
			System.out.println("Not a leap year");
	}

}
