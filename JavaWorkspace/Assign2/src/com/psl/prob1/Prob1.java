package com.psl.prob1;

public class Prob1 
{
	static int calMax(int x,int y,int z)
	{
		if(x > y && x > z)
			return x;
		else if(y > z)
			return y;
		else
			return z;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Max of (1,2,3) : " + calMax(1,2,3));
	}

}
