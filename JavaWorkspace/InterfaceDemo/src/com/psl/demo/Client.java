package com.psl.demo;

import com.psl.employee.Employee;
import com.psl.vehicle.Vehicle;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Printable p = new Employee();
		p.print();
		
		p = new Vehicle();
		p.print();
	}

}
