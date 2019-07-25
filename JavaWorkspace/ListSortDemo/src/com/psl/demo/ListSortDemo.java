package com.psl.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSortDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("Harshada");
//		list.add("Akash");
//		list.add("Aniket");
//		list.add("Amogh");
//		list.add("Rucha");
//		list.add("Kajal");
//		
//		System.out.println("List Before Sort : " + list);
//	
//		Collections.sort(list);
//		System.out.println("List After Sort : " + list);
	
	
		List<Employee> list = new ArrayList<Employee>();
		
		Set<Employee> set = new TreeSet<Employee>();
		
		list.add(new Employee(105, "ZAjinkya", 20000));
		list.add(new Employee(104, "Akash", 10000));
		list.add(new Employee(102, "Ajinkya", 20000));
		list.add(new Employee(101, "Harshada", 30000));
		
	
		System.out.println("List Before Sort : " + list);
		
		
//		Collections.sort(list);
		
		System.out.println("List After Sort : " + list);
	
		Collections.sort(list, new SortBySalary());
		
		System.out.println("Soted by salary : -" + list);
		
		
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});//anonymous inner classes
	
		
		
	}

}
