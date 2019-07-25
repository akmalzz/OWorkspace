package com.psl.assignments;

public class Prob3 {

	static int isPrime(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
				return -1;
		}
		return num;
	}
	static void printAllPrime(int startRange, int endrange)
	{
		while(startRange<=2)
		{
			if(startRange==2)
			 System.out.print((startRange)+ "  ");
			startRange++;
		}
		for(int i=startRange; i<=endrange; i++)
		{
			if(isPrime(i)>0)
				System.out.print(i + "  ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int startRange = -5;
		int endrange = 45;
		
		 printAllPrime(startRange, endrange);
		 
		 
		 
	}

}
