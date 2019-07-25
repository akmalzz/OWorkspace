package com.psl.demo;

public class Employee
{
	
	int id, salary;
	String name;
	
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
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		
		if( this.id==e.id && this.salary==e.salary )
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
	
		return this.id*31;
	}


}
