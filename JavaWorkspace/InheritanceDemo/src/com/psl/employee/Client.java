package com.psl.employee;

public class Client 
{
	private static void display(Employee obj) {
		// TODO Auto-generated method stub
		Developer d1 = (Developer)obj;
		d1.myMethodDeveloper();
	}

	private static void add(int... a) {//var args ... elipse operator
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum is :" + sum);
	}
	private static void add(int a , int b) {
		// TODO Auto-generated method stub
		int sum = a+b;
		System.out.println(sum);
	}


	private static void add(float a , int b) {
		// TODO Auto-generated method stub
		float sum = a+b;
		System.out.println(sum);
	}

	private static void add(int a , int b, int c) {
		// TODO Auto-generated method stub
		int sum = a+b+c;
		System.out.println(sum);
	}

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e = new Employee(10,"Bond",10000);
//		e.displayEmployee();
		
		Employee d =  (Developer)new Developer(10,"Bond",10000,10000,2000,30000);//DMD - Dynamic Method Dispatch
		d.display();
		d.myMethodEmployee();
		
		//Object o;
		//o = 10;
	
		//d.myMethodDeveloper();
		//d.displayDeveloper();
		add(10);
		add(10,20);
		add(10,20,30,40,50);
	}

}
