package com.psl.Prob5;

public class USERTRAIL 
{
	int val1, val2;
	
	public USERTRAIL(int val1, int val2) throws IllegalValueException
	{
		// TODO Auto-generated constructor stub
		if(val1<0 || val2<0)
			throw new IllegalValueException();
		this.val1 = val1;
		this.val2 = val2;
	}
	
	boolean show()
	{
		if(val1>0 && val2>0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		USERTRAIL u1=null;
		USERTRAIL u2=null;

		try 
		{
			u1 = new USERTRAIL(10, 20);
			u2 = new USERTRAIL(10, -10);
		} 
		catch (IllegalValueException e) 
		{
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println(u1.show());
		System.out.println(u2.show());
	}
	
}
