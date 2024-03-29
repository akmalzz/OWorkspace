package com.psl.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String str = sdf.format(d);
		System.out.println(str);
		
		String str1 = "08-09-1997";
		sdf.setLenient(false);//default true
		Date d1 = null;
		try
		{
			d1 = sdf.parse(str1);
		}
		catch(ParseException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(d1);//.getTime() will give millisecond w.r.t. 1/1/1970
	
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		
		int dayOM = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(dayOM);

		c.set(Calendar.DAY_OF_MONTH, 21);
		
		System.out.println(c.getTime());
	
		c.add(Calendar.DAY_OF_MONTH, 15);
		
		System.out.println(c.getTime());

		System.out.println(c.get(Calendar.DAY_OF_MONTH) + "  " +c.get(Calendar.MONTH)  + "  "+ c.get(Calendar.YEAR));
		//In Calendar class month starts with zero so October will be 9 instead of 10
		
		java.sql.Date d2 = new java.sql.Date(d1.getTime());
		
		System.out.println(d2);
		
		Date d3 = new Date(d2.getTime());
		
		System.out.println(d3);
	
	}

}
