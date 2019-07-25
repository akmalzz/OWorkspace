package com.psl.javabasic;

public class ArrayDemo {
	public static void main(String[] args) {
		int intArr[] = new int[5];//declaration & initialization of array
		
		//initialize array elements
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 10;
		intArr[3] = 20;
		intArr[4] = 10;
		
		//iterate over array using for loop
		for(int i = 0; i < intArr.length; i++){
			System.out.println("Array element: " + intArr[i]);
		}
		
		//iterate over array using for each loop
		for (int val : intArr) {
			System.out.println(val);
		}
	}
}
