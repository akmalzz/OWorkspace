package com.psl.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<Employee> list = new HashSet<Employee>();

		
		Employee e1 = new Employee(104, "Akash", 10000);
		Employee e2 = new Employee(102, "Ajinkya", 20000);
		Employee e3 = new Employee(101, "Harshada", 30000);
		Employee e4 = new Employee(102, "Ajinkya", 20000);

		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println(list.size());
	
		System.out.println("List Before Sort : " + list);
		
		
		//Collections.sort(list);
	}

}
