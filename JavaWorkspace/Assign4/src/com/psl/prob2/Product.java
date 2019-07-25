package com.psl.prob2;

public abstract class Product 
{
	int productId;
	String productName;
	long serialNumber;
	
	public Product(int productId, String productName, long serialNumber) 
	{
		// TODO Auto-generated constructor stub
		this.productId = productId;
		this.productName = productName;
		this.serialNumber = serialNumber;
	}
	
	public void display()
	{
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Serial Number : "+serialNumber);
	}
}
