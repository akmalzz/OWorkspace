package com.psl.demo;

public enum Coffee 
{
	Small(50),Medium(80),Large(180);
	int price = 10;
	
	private Coffee(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	String fun(String name)
	{
		return "Hey" + name;
	}
}
