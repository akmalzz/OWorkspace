package com.psl.demo;

public class EnumDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(Coffee.Small);
		System.out.println(Coffee.Medium);
		
		Coffee c = Coffee.Large;
		c = Coffee.Medium;
		System.out.println(c.price);
		String str = c.toString();
		System.out.println(str);
		
		for(Coffee ca : Coffee.values())
		{
			System.out.println(ca.fun("Akmal"));
		}
				Object o = new Object();

	}

}
