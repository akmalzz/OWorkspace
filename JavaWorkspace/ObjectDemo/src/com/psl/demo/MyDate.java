package com.psl.demo;

public class MyDate 
{
	int date, month, year;
	public MyDate(int date, int month, int year)
	{
		this.date = date;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Today's Date is :"+date+"/"+month+"/"+year;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub
		MyDate m = (MyDate) obj;
		if(this.date == m.date && this.month == m.month && this.year == m.year)
			return true;
		else 
			return false;
		//return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return date+month+year;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyDate obj1 = new MyDate(15, 17, 2019);
		System.out.println(obj1);
		
		MyDate obj2 = new MyDate(15, 17, 2019);
		System.out.println(obj2);
		
		System.out.println(obj1 == obj2);//checking address ///reference values // address
		
		
		System.out.println(obj1.toString() == obj2.toString());
		System.out.println(obj1.toString().equals(obj2.toString()));
		System.out.println(obj1.equals(obj2));
	}

}
