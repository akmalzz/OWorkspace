package com.psl.assignments;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c;
		
		try
		{
			a = 10;
			b = 0;
			c = a / b;
			System.out.println(c);
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Array Bound Exception");
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Arithmetic Exception");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		finally
		{
			System.out.println("Finally in Finally");
		}
	}

}
