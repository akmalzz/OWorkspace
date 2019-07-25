package com.psl.demo;

public class ThrowDemo 
{
	private int divide(int a, int b) throws ArithmeticException {
		// TODO Auto-generated method stub

			return a/b;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThrowDemo td = new ThrowDemo();
		try {
			int result  = td.divide(5, 5);
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		int age  =190;
		
		if(age<18)
		{
			System.out.println(" in if ");
		}
		try
		{
		assert( age < 18) :"Error Message that you want to display"  ;
		//if ka ulta
		//to work it has to be false
		}
		catch(Throwable e)
		{
			System.out.println("Hello");
		}
		System.out.println("End......");
	}

}
