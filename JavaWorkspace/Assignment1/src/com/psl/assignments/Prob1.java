package com.psl.assignments;
import java.util.Scanner;

public class Prob1 {

	static String[] initProductNames()
	{
		String[] productNames = {"Icard", "piano", "compuTER","SHIRT"};
		return productNames;
	}
	
	static boolean isPresent(String[] productNames, String keyword)
	{
		for(String product : productNames)
		{
			if (product.toLowerCase().equals(keyword.toLowerCase()))
				return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Keyword to Search");
		String search = sc.next();
		
		boolean check = isPresent(initProductNames(), search);
		if(check)
			System.out.println("Product present");
		else
			System.out.println("Sorry Not Present");
		sc.close();
	}

}
