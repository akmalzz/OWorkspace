package com.psl.prob9;

public class Prob9 
{

	static float calLoan(int amt)
	{
		float payBackAmt = 0.0f;
		
		if(amt > 0 && amt <= 500 )
		{
			payBackAmt = (float)amt * 0.0025f;
		}
		else if(amt > 0 && amt <= 1500)
		{
			payBackAmt = (float)amt * 0.0050f;
		}
		else if(amt > 0 && amt <= 2500)
		{
			payBackAmt = (float)amt * 0.0075f;
		}
		else if(amt > 0 && amt > 2500)
		{
			payBackAmt = (float)amt * 0.01f;
		}

		
		
		return payBackAmt;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
