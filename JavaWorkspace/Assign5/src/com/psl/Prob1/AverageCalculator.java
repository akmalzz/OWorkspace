package com.psl.Prob1;

import java.awt.Color;
import java.util.Scanner;

public class AverageCalculator 
{
	public double avgFirstN(int n)
	{
		int sum = 0;
		
		for (int i = 1; i <= n; i++) 
		{
			sum+=i;
		}
		return (double)sum/n; 
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get average of 1 to that number :");
		double d = sc.nextDouble();
		AverageCalculator avc = new AverageCalculator();
		try
		{
			//Color col = new Color(0,200,300);// Throws IllegalArgumentException
			if(d!=(int)d)
				throw new IllegalArgumentException();
			double avg = avc.avgFirstN((int)d);
			System.out.println("Avgerage : " + avg);
				
		}
		catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
