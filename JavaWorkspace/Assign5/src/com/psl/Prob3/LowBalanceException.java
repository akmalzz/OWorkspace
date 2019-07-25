package com.psl.Prob3;

public class LowBalanceException extends Exception
{
	public LowBalanceException() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Your Balance is Low as per the required balance 1000 for Savings and 5000 for Current");
	}
}
