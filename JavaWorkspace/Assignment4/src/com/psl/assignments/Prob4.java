package com.psl.assignments;

public class Prob4 
{
	static String wordReverse(String word)
	{
		char[] charstr = word.toCharArray();
		int i,j;
		i=0;
		j=word.length()-1;
		char temp;
		while(i < j)
		{
			temp = charstr[i];
			charstr[i] = charstr[j];
			charstr[j] = temp;
			i++;
			j--;
		}
		
		return String.valueOf(charstr);
	}
	static String makeReverse(String str)
	{
		String[] splittedStr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String word : splittedStr)
			sb.append(wordReverse(word)).append(" ");
		
		return sb.toString();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String strInput = "To be or not to be";
		String strOutput = makeReverse(strInput);
		
		System.out.println("Your Modified Output is : \n" + strOutput);
	}

}
