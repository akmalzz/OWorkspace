package com.psl.Prob2;

public class Number 
{
	int a;
	int b;
	double result;
	
	public Number(int a, int b) 
	{
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	void add()
	{
		result = (double) a+b;
	}

	void sub()
	{
		result = (double) a-b;
	}
	void mul()
	{
		result = (double) a*b;
	}
	void div()
	{
		try 
		{
			if(b==0)
				throw new ArithmeticException();
			
			result = (double) a/b;
		} 
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Number n = new Number(10, 0);
		
		n.add();
		System.out.println(n.result);
		

		n.sub();
		System.out.println(n.result);

		n.mul();
		System.out.println(n.result);

		n.div();
		System.out.println(n.result);

		
	}

}
