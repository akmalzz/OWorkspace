package com.psl.assignments;

public class Prob2 {

	static int findPosition(int num, int[] nos)
	{
		for (int i = 0; i < nos.length; i++) {
			if(num==nos[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int search = 20;//keyword to be searched in the array
		int[] nos = {10,20,30,40,50};// total elemnts in array on which searchn will be carried out
		
		int result = findPosition(search, nos);
		
		if(result>=0)
			System.out.println("Yes it is present at: "+ result);
		else
			System.out.println("Not Present");
	}

}
