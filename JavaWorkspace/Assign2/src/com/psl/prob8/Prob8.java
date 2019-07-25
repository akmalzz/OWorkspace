package com.psl.prob8;

public class Prob8 
{
	static double calculateBill(int units, String type)
	{
		double bill = 0.0;
		switch(type.toLowerCase())
		{
			case "commercial":
				
				if(units<=100)
				{
					bill = units * 4.25;
					if(bill<350)
						bill = 350;
				}
				else if(units <= 300)
					bill = units * 4.75;
				else if(units <= 500)
					bill = units * 5.0;
				else if(units > 500)
					bill = units * 5.25;
				
				break;
				
			case "domestic":
				
				if(units<=100)
				{
					bill = units * 4;
					if(bill<250)
						bill = 250;
				}
				else if(units <= 300)
					bill = units * 4.5;
				else if(units <= 500)
					bill = units * 4.75;
				else if(units > 500)
					bill = units * 5;
				
				break;
		}
		return bill;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Bill for Domestic and units consumed 385 is: " + calculateBill(385, "Domestic"));
		System.out.println("Bill for Commercial and units consumed 385 is: " + calculateBill(385, "Commercial"));
	}

}
