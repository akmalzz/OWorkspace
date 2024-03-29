package com.psl.demo;

public class ThreadDemo implements Runnable
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) 
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(Thread.currentThread().getName().equals("one"))
				System.out.println("Thread One");
			else
				System.out.println("Thread Two");
		}		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadDemo obj = new ThreadDemo();
		
		System.out.println("Start Main");
		
		Thread t1 = new Thread(obj,"one");
		Thread t2 = new Thread(obj,"two");
		
		t1.start();
		t1.setPriority(1);//Illegal Argument Exception
		t2.start();
		t2.setPriority(10);
		System.out.println("End Main");
	}

}
