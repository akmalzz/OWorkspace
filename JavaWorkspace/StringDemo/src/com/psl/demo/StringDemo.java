package com.psl.demo;

public class StringDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1 = "Asif";
		String str2 = "Asif";
		
		String str3 = new String("Asif");
		String str4 = new String("Asif");

		System.out.println(str1 == str2);
		
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equals(str3));
		
		
	}

}
