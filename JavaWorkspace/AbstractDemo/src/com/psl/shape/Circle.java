package com.psl.shape;

public class Circle extends Shape
{
	float area;
	int r;
	final float pi = 3.14f;
	
	public Circle(int r)
	{
		this.r = r;
	}
	
	
	@Override
	public void area()
	{
		area = pi * r * r;
		System.out.println("Area of Circle : " + area);
	}
//	public void display()
//	{
//		System.out.println("Area of Circle : " + area);
//	}
}
