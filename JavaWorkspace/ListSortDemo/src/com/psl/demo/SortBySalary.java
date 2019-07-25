package com.psl.demo;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int i = 0;
		
		if( e1.salary > e2.salary )
			i=1;
		else if( e1.salary == e2.salary )
			i=0;
		else
			i=-1;
		
		return i;
	}

}
