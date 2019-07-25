package com.psl.employee;

public class Employee 
{
	static int employeeIdStatic;
	int employeeId;
	int employeeSalary;
	String employeeName;
	
	public Employee(int employeeSalary, String employeeName) 
	{
		System.out.println("Constructor");
		// TODO Auto-generated constructor stub
		this.employeeIdStatic++;
		this.employeeId = this.employeeIdStatic;
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
	
	}
	{
		System.out.println("Instance Block");
	}
	
	static
	{
		System.out.println("Static Block 1");
	}

	static
	{
		System.out.println("Static Block 2");
	}

	private void displayEmployee() 
	{
		// TODO Auto-generated method stub
		System.out.println("Employee is: "+employeeId + employeeName + employeeSalary);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1 = new Employee(10000, "BatMan");
		e1.displayEmployee();
		
		Employee e2 = new Employee(20000, "IronMan");
		e2.displayEmployee();
		
		Employee e3 = new Employee(80000, "SuperMan");
		e3.displayEmployee();
	
		e1.displayEmployee();
	}

}
