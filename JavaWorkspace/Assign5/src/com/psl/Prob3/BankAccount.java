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
		try 
		{
			if(amt<0)
				throw new NegativeAmount();
			balance += amt;
		} 
		catch (NegativeAmount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	void withdraw(float amt)
	{
		try 
		{
			if(amt<0)
				throw new NegativeAmount();

			if( ((balance-amt) < 1000 && accType == Account.Savings) || ( (balance-amt) < 5000 && accType == Account.Current) )
				throw new InsufficientFunds();
		
			balance -= amt;

		} 
		catch (NegativeAmount e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InsufficientFunds e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	float getBalance()
	{
		try 
		{
			if( ((balance) < 1000 && accType == Account.Savings) || ( (balance) < 5000 && accType == Account.Current) )
				throw new LowBalanceException();
		} 
		catch (LowBalanceException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return balance;
		
	}	
	

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}

}
