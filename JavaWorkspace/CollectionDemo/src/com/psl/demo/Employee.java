package com.psl.demo;

public class Employee implements Comparable<Employee>
{
	
	int id=10, salary= 100000;
	String name="Bond";
	
	public Employee(int id, String name, int salary) 
	{
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Id" + id + "  Emplyee Name" + name +"  Emplyee Salary" + salary;
	}
	
	@Override
	public int compareTo(Employee e) 
	{
		// TODO Auto-generated method stub
		int i = 0;
		
		if( this.id > e.id )
			i=1;
		else if( this.id == e.id )
			i=0;
		else
			i=-1;
		
		return i;
	}

}
