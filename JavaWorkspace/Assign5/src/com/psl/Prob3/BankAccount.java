package com.psl.Prob3;
enum Account
{
	Savings, Current
}
public class BankAccount 
{
	int accNo;
	String custName;
	Account accType;
	float balance;
	
	public BankAccount(int accNo, String custName, Account accType, float balance) 
	{
		// TODO Auto-generated constructor stub
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	
	void deposit(float amt)
	{
		balance += amt; 
	}
	void withdraw(float amt)
	{
		balance -= amt;
	}
	float getBalance()
	{
		return balance;
	}
	

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}

}