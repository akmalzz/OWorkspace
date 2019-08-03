package com.psl.beans;

import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>{
	private int rollno;
	private String studentName;
	private int age;
	private Address address;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollno, String studentName, int age, Address address) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.age = age;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return getRollno() +"-"+getStudentName()+"-"+getAge() + "-"+getAddress();
	}

	@Override
	public int compareTo(Student s2) {
		// TODO Auto-generated method stub

		Student s1 = this;
		int sName = s1.getStudentName().compareTo(s2.getStudentName());
				
		if(sName==0)
		{
			if(s1.getAge() > s2.getAge())
				return 1;
			else if(s1.getAge() < s2.getAge())
				return -1;
			else
			{
				if(s1.getRollno() > s2.getRollno())
					return 1;
				else if(s1.getRollno() < s2.getRollno())
					return -1;
				else
					return 0;
			}
		}
					
		return sName;
					
	}

}