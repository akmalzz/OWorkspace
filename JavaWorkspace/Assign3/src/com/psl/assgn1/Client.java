package com.psl.assgn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EOperations e = new EOperations();
		String filename = "Employee.txt";
		Scanner sc = new Scanner(System.in);
		List<Employee> eList = null;
		List<Employee> sList = null;
		
		char skillContinue = 'y';
		boolean getOut = false;
		int choice;
		int empid;
		String skill;
		
		while(getOut != true)
		{
			System.out.println("1.Display Employees\n2.Search Employees\n3.Add Skill to an employee\n4.Add new Employee\n5.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1:
				 eList = e.readEmployeeDetails(filename);
				 for(Employee emp : eList)
				 {
					 System.out.println(emp);
				 }
				 break;
				 
			 case 2:
				 System.out.println("Enter Skill to search Employee with matching Skill");
				 skill = sc.next();
				
				 try
				 {
				 	sList = e.searchEmployees(skill);
				 }
				 catch(EmployeeNotFoundException ex)
				 {
					 ex.printStackTrace();
				 }
				 if(sList!=null)
				 {
					 Collections.sort(sList,  new Comparator<Employee>() {
						@Override
						public int compare(Employee o1, Employee o2) {
							// TODO Auto-generated method stub
						return o1.empName.compareTo(o2.empName);
						}
					 });
					 Collections.sort(sList,  new Comparator<Employee>() {
							@Override
							public int compare(Employee o1, Employee o2) {
								// TODO Auto-generated method stub
							return Integer.valueOf(o1.empid).compareTo(Integer.valueOf(o2.empid));
							}
						 });
					 for(Employee emp : sList)
					 {
						 System.out.println(emp);
					 }
				 }
				 break;
				 
			 case 3:
				 System.out.println("Enter employee id to which you want to skill");
				 empid = sc.nextInt();
				 System.out.println("Enter Skill to add to the above employee");
				 skill = sc.next();
				 
				 e.addSkill(empid,skill,eList);
				 break;
				 
			 case 4:
				 if(eList==null)
					 eList = new ArrayList<Employee>();
				 
				 Employee em = new Employee();
				 System.out.println("Enter employee id");
				 em.empid = sc.nextInt();
				 
				 System.out.println("Enter employee name");
				 em.empName = sc.next();
				 
				 System.out.println("Enter birth date of employee in this format YYYY-MM-DD");
				 String bdate = sc.next();
				 try
				 {
					 em.birthdate = new SimpleDateFormat("yyyy-MM-dd").parse(bdate);
				 }
				 catch(ParseException ex)
				 {
					 ex.printStackTrace();
				 }
				 System.out.println("Do you want to add Skills y/n");
				 skillContinue = sc.next().charAt(0);
				 em.skills = new ArrayList<String>();
				 
				 while(skillContinue=='y')
		         {
		            	 System.out.println("Enter Skill");
		            	 em.skills.add(sc.next());
		            	 
						 System.out.println("Do you want to add more Skills y/n");
						 skillContinue = sc.next().charAt(0);
		         }
	             
	             
				 System.out.println("Enter Project For Employee");
				 em.project = sc.next();
				 e.addNewEmployee(em,eList);
				 break;			 
			 
			 case 5:
				 System.out.println("Bye !!! See You Soon");
				 getOut = true;
				 break;
				 
			 default:
				 System.out.println("Try Something else");
				 break;
			}
		}
				
		sc.close();
	}

}
