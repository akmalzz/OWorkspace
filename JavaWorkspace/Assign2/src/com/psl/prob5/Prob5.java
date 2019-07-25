package com.psl.prob5;

public class Prob5 
{
	static boolean isPrimeNumber( int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(" 3 is prime " + isPrimeNumber(3));
		System.out.println(" 23 is prime " + isPrimeNumber(23));
		System.out.println(" 5 is prime " + isPrimeNumber(5));
		System.out.println(" 86 is prime " + isPrimeNumber(86));
		System.out.println(" 27 is prime " + isPrimeNumber(27));
		
	}

}
