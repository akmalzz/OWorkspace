package com.psl.demo;

import java.io.Serializable;

public class Employee implements Serializable
{
	int id=10;
	transient int salary= 100000;
	String name="Bond";
	public Employee(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void myMethodEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee");
	}
	@Override
	public
	String toString() 
	{
		// TODO Auto-generated method stub
		return "Employee Id" + id + "  Emplyee Name" + name +"  Emplyee Salary" + salary;
	}
}
