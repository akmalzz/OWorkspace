package com.psl.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * class is to display date in mm/dd/yyyy fromat
 * @author:- Akmal Ziyad
 * 
 * 
 * 
 * **/
import java.util.*;


public class DateDemo 
{
	private	int date, month, year; //to store date month and year
	
//	private void initDate() 
//	{
//		// TODO Auto-generated method stub
//		date = 11;
//		month = 7;
//		year = 2019;
//	}

	public DateDemo()
	{
		this(7,7,2007);
		date = 7;
	}

	public DateDemo(int date, int month, int year)
	{
		this.date = date;
		//this();//deafult constructor calles // here it is as staement
		this.month = month;
		this.year = year;
	}
	
	private void displayDate() 
	{
		// TODO Auto-generated method stub
		System.out.println("Todays's Date is : -"+ month + "/" + date + "/" + year);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		DateDemo obj;// reference
		obj = new DateDemo();// object
		
		Date d = new Date();
		System.out.println(d);
		//obj.initDate();
		obj.displayDate();
		
		
		
		
		
		System.out.println("\n\nDhurrrrr rr\n");
		
		Date dw = new Date();
		
		java.sql.Date d3 = new java.sql.Date(dw.getTime());
		
		System.out.println("SQL Date : "+d3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		System.out.println("SDF : " +sdf);
		
		int year3 = Integer.valueOf(sdf.format(d3));
		
		
		
		System.out.println("Year "+ year3);
		Date du= null;
//		try {
//			du = sdf.parse(str3);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Util DAte " + du);
		
		
		
		
		
		Date d4 = new Date();
		Date d5 = new Date();
		
		try 
		{
			d5 = sdf.parse("1997-03-04");
		} 
		catch (ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(d4.after(d5))
		{
			System.out.println("Mhanje Not Born");
		}
		if(d4.before(d5))
		{
			System.out.println("Mhanje 22 years");
		}
		
		//Motha 1
		//chota -1
		//same 0
		
		//this.compareTo(obj1)
		//1
		//-1
		//0 
		
		System.out.println(d4.compareTo(d5))
		;
		
		
		
		
		
	}

}
