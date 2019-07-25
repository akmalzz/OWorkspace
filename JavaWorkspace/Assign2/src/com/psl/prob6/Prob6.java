package com.psl.prob6;

public class Prob6 
{
	static int isPrime(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
				return -1;
		}
		return num;
	}
	
	static void printPrime(int maxVal)
	{
		System.out.print("2 ");
		for(int i=3; i<=maxVal; i++)
		{
			if(isPrime(i)>0)
				System.out.print(i + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Primes upto 9 is : " );
		printPrime(9);

		System.out.println("Primes upto 23 is : " );
		printPrime(23);
		
		System.out.println("Primes upto 87 is : " );
		printPrime(87);


	}

}
