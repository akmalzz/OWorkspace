package com.psl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	
	public int findAge(String birthDate) throws InvalidDateFormatException {
		//Write a code here to calculate the age using the birthdate 
		String[] dateSplit = birthDate.split("-");
		if(dateSplit.length==3)
		{
			if(dateSplit[0].length()==2 && dateSplit[1].length()==2 && dateSplit[2].length()==4);
			else
				throw new InvalidDateFormatException();
		}
		else
		{
			throw new InvalidDateFormatException();
		}
		Date date = null;
		try 
		{
			date = new SimpleDateFormat("dd-MM-yyyy").parse(birthDate);
		}
		catch (ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date today = new Date();
		if( today.getTime() <= date.getTime() )
			return 0;
		//long mills = ;
		return (int)((  (today.getTime() - date.getTime())  / (3600000)) /24)/365;
	}

	public static void main(String[] args) 
	{
		// You can test your code by calling findAge() method from here
		Client c = new Client();
		
		try 
		{
			System.out.println(c.findAge("04-08-2019"));
		}
		catch (InvalidDateFormatException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
