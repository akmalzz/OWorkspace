package com.psl.assignment;

public class Client 
{

	public String convertToTitle(String string)
	{
	
		//Write the code here to Convert the String to title case
        char[] charArray = string.toCharArray();
        
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 1; i < charArray.length; i++) 
        {
        	if( charArray[i] == ' ')
        	{
        		i++;
        		charArray[i] = Character.toUpperCase(charArray[i]);
        		i++;
        	}
        	charArray[i] = Character.toLowerCase(charArray[i]);
        	
        }
        
		return String.valueOf( charArray );
	}
	public static void main(String[] args) 
	{
			// Test your code by calling convertToTitle method from here			
		Client c = new Client();
		String inputString = "hello my nAMe is akmal what's your?";
		System.out.println(c.convertToTitle(inputString));
		
	}
}
