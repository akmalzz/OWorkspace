package com.psl.prob1;

import java.util.ArrayList;
import java.util.List;

public class Prob1 
{
	List<String> fruits = new ArrayList<String>();

	Prob1()
	{
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Grapes");
		fruits.add("Custurd Apple");
	}
	boolean isAvailable(List<String> fruits, String fruit)
	{
		boolean isAvailabe = false;
		
		for(String inFruit : fruits)
		{
			if(fruit.toLowerCase().equals(inFruit.toLowerCase()))
				isAvailabe = true;
		}
		
		return isAvailabe;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Prob1 p = new Prob1();
		String searchFruit = "watermelon";
		if(p.isAvailable(p.fruits, searchFruit))
			System.out.println("Yes fruit is available");
		else
			System.out.println("Sorry fruit is not there");
	}

}
