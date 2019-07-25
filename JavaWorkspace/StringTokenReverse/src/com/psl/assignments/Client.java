package com.psl.assignments;

public class Client 
{

	public String[] getTokens(String data) 
	{
		//Write a code here to tokenize the words in the given String and return an array of words
		String[] tokens = data.split(" ");
		
		return tokens;
	}

	public String reverseAndAppend(String[] data) 
	{
		//Write a code here to reverse and append the words in the passed array
		
		int i = 0;
		
		StringBuilder sb = new StringBuilder();
		int j,k;
		char temp;
		
		while(i < data.length)
		{
			char[] tempArray = data[i].toCharArray();
			
			j=0;
			k=tempArray.length - 1;
			
			while(j<k)
			{
				temp = tempArray[j];
				tempArray[j] = tempArray[k];
				tempArray[k] = temp;
				
				j++;
				k--;
			}
			
			sb.append( String.valueOf(tempArray) ).append(" ");
			
			i++;
		}
		
		return sb.toString();
	}

	public static void main(String[] args) 
	{
		//Check your code by calling methods from here
		Client client=new Client();
		String[] tokens=client.getTokens("Hello World");
		String reversed = client.reverseAndAppend(tokens);
		System.out.println(reversed);
		
	}

}
