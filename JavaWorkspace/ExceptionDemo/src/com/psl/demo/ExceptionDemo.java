package com.psl.demo;

import java.io.FileOutputStream;

public class ExceptionDemo 
{
	
	private void display() {
		// TODO Auto-generated method stub
		System.out.println("Display..!!");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		try {
//			FileOutputStream fos = new FileOutputStream("file");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	ExceptionDemo obj = null;
	int result, a=10, b = 0;
	
	try {
		
		obj.display();
		
		result = a / b;
		System.out.println(result);
	}
	catch(NullPointerException e)
	{
		obj = new ExceptionDemo();
		obj.display();
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		//e.printStackTrace();
		System.out.println("Sorry bro you cant divide by zero");
		b=2;
		result = a/b;
		System.out.println("Result " + result);
	}
	catch( Exception e )
	{
		//e.printStackTrace();
		System.out.println("Try Again!!");
	}
	finally{
		System.out.println("I will execute everytime");
	}

//	result = a / 0;
//	System.out.println(result);
//runtime error
	
	System.out.println("All is Well");
	
	}

}
