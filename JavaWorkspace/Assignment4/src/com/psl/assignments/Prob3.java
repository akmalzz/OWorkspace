package com.psl.assignments;

public class Prob3 
{

	static int check(String sentence, String word)
	{
		int count = 0;
		
		String[] splittedSentence = sentence.split(" ");
		
		for( String split : splittedSentence )
		{
			if( split.equals(word) )
				count++;
		}
		
		return count;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String senetenceInput = "hello i am akmal hello how are you hello conatins 5 alphabets hello";
		String wordSearch = "hello";
		
		System.out.println("Count of word "+ wordSearch +" is: " + check(senetenceInput, wordSearch));
	}

}
