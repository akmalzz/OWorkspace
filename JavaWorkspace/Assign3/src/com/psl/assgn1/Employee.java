package com.psl.assgn1;

import java.util.Date;
import java.util.List;

public class Employee
{
    int empid;
    String empName;
    Date birthdate;
    List<String> skills;
    String project;
    
    @Override
    public String toString() 
    {
    	// TODO Auto-generated method stub
    	return "Employee: "+ empid + empName + birthdate + skills + project;
    }
}
