package com.psl.demo;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Operations add = new Operations() {
			
			@Override
			public int operation(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		
		System.out.println(add.operation(10, 20));
	}
	//Operations ops1 = (int a, int b) -> a+b;
	//Operations ops1 = (a, b) -> a+b;
	Operations ops1 = (int a, int b) -> {return a+b;};
	
	//ops1.operation(10, 20);
	
	
}
