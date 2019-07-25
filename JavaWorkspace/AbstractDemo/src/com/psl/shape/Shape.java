package com.psl.shape;

public abstract class Shape 
{
	Shape()
	{//can create a constructor of abstract class
		
	}
	public abstract void area();//methods cannnot be static in abstract 
	void display()
	{				
		System.out.println("Display in Shape");
	}
}
