package com.psl.prob4;

public class Emp 
{
	int empId;
	String empName;       
	String designation;	           
	double basic;               
	final double hra;

	public Emp(int empId, String empName, String designation, double basic)
	{
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		try 
		{
			if (basic<500.0)
				throw new LowSalException();
		} 
		catch (LowSalException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.basic = basic;
		this.hra = calculateHRA();
	}

	void printDET()
	{
		System.out.println(empId+" - "+empName+" - "+designation+" - "+basic+" - "+hra);
	}
	double calculateHRA()
	{
		double hra;
		
		if(designation.equals("Manager"))
			hra = 0.10 * basic;
		else if(designation.equals("Officer"))
			hra = 0.12 * basic;
		else if(designation.equals("CLERK"))
			hra = 0.05 * basic;
		else
			hra = 0.0;
		return hra;
	}


}
