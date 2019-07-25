package com.psl.demo;

import java.util.Comparator;

interface MyInterface
{
	void myInterfaceMethod();
}
class Parent
{
	void myMethod()
	{
		System.out.println("My method of Parrents");
	}
}

public class OuterClass 
{
	private static int a = 10;
	static class InnerClass
	{
		//int a = 20;
		void display()
		{
			System.out.println("Display Inner Class  " + a);
		}
	}
	private void displayOuter() 
	{
		// TODO Auto-generated method stub
		System.out.println("Display Outer");
		
		class InnerClass2
		{
			void display()
			{
				System.out.println("Method Class");
			}
		}
		InnerClass2 i2 =  new InnerClass2();
		i2.display();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		OuterClass o = new OuterClass();
		
		//OuterClass.InnerClass i = o.new InnerClass();
		
		OuterClass.InnerClass i = new OuterClass.InnerClass();
		o.displayOuter();
		i.display();
		
		o.displayOuter();
		//System.out.println(i.a);//	 Not Allowed
	
		Parent p = new Parent(){
			@Override
			void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("New MyMethod");;
			}
			
//			void newMthod()
//			{
//				System.out.println("New Method");
//			}
		};
		
		p.myMethod();
		//p.newMethod;//Not Allowed
		
		MyInterface myi = new MyInterface() {
			@Override
			public void myInterfaceMethod() {
				// TODO Auto-generated method stub
				System.out.println("My Method Interface");
			}
		};
		
		myi.myInterfaceMethod();
		
		
		Comparator<String> com = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
