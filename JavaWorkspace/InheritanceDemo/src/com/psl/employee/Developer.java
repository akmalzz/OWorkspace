package com.psl.employee;

public class Developer extends Employee 
{
	int pf = 5000, ta= 10000 ,hra = 15000;
	public Developer(int id, String name, int salary, int pf, int ta, int hra) {
		super(id, name, salary);
		this.pf = pf;
		this.ta = ta;
		this.hra = hra;
		// TODO Auto-generated constructor stub
	}
	void myMethodDeveloper() {
		// TODO Auto-generated method stub
		System.out.println("Developer");
	}
	
	@Override
	void display() {//overridden 
		// TODO Auto-generated method stub
		//display();//coz of this 
		//super.display();
		int netSalary = salary + pf+ta+hra;
		System.out.println("developer : "+ id +" " + name + "  "+ netSalary);
	}
}
