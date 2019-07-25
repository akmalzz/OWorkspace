package com.psl.demo;
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
		
	}

}
