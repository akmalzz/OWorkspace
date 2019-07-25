package com.psl.prob7;

public class Prob7 
{
	static float calculateProfit( int numAttendees)
	{
		float income = 0.0f;
		income = ( 5.0f * (float)numAttendees ) - (20.0f+ (0.5f * (float)numAttendees));
		return income;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("income of theater for 10 number of aatendees" + calculateProfit(10));
		System.out.println("income of theater for 50 number of aatendees" + calculateProfit(50));
		System.out.println("income of theater for 98 number of aatendees" + calculateProfit(98));
		System.out.println("income of theater for 18 number of aatendees" + calculateProfit(18));
		System.out.println("income of theater for 37 number of aatendees" + calculateProfit(37));
	}

}
