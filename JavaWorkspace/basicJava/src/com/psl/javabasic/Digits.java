package com.psl.javabasic;

public class Digits { 
	public static void main(String args[]) { 
		int carCost = 48_87_653;   
		float busCost = 16_47_812.2_567f; 
		
		System.out.println("Car cost Rs. " + carCost); 
		System.out.println("Bus cost Rs. " + busCost); 
		
		//following statements will cause compile time error
		//carCost = _23456;
		//carCost = 234567_;
		//carCost = 1234_.89;
		//carCost = 2345._90;
		//busCost = 2345678.90_f;
		
		String num = "123345";
		int n = Integer.parseInt(num);
		System.out.println(n);
		
		   StringBuffer buffer = new StringBuffer(" test");
		   
		   //append functionality
	       buffer.append(" String Buffer");
	       System.out.println(buffer); 
	       
	       //reverse functionality
	       buffer.reverse();
	       System.out.println(buffer);
	       
	       //delete functionality
	       buffer.delete(3,7); 
	       System.out.println(buffer);
	       
	       //insert functionality
	       buffer.insert(3,"123");
	       System.out.println(buffer);
	       
	       //replace functionality
	       buffer.replace(3, 8, "ZARA");
	       System.out.println(buffer);
		
		
	} 
} 