package com.psl.prob2;

public class Prob2 
{
	static boolean checkAlpha(char alph)
	{
		alph = Character.toLowerCase(alph);
		if( alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u')
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("a is vowel " + checkAlpha('a'));
		System.out.println("A is vowel " + checkAlpha('A'));
		System.out.println("b is vowel " + checkAlpha('b'));
		System.out.println("O is vowel " + checkAlpha('O'));
		System.out.println("f is vowel " + checkAlpha('f'));

	}

}
