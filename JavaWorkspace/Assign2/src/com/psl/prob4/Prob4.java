package com.psl.prob4;

public class Prob4 
{

	static double calTax(int gp)
	{
		double taxOwed = 0.0;
		
		if(gp>0 && gp<=240)
			taxOwed = 0 * gp;
		else if(gp>0 && gp<480)
			taxOwed = 0.15 * gp;
		else if(gp > 0 && gp>=480)
			taxOwed = 0.28 * gp;
		
		return taxOwed;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Tax owed for Gross Pay 143 is : " + calTax(143));
		System.out.println("Tax owed for Gross Pay 243 is : " + calTax(243));
		System.out.println("Tax owed for Gross Pay 3043 is : " + calTax(3043));
		System.out.println("Tax owed for Gross Pay 643 is : " + calTax(643));
		System.out.println("Tax owed for Gross Pay 1453 is : " + calTax(1453));
	}

}
