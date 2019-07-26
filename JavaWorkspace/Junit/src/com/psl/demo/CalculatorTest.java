package com.psl.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest 
{
	static Calculator cal = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Before Class");
		
		cal = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("After Class");
	}

	@Before//like constructor for testcase //method level
	public void setUp() throws Exception 
	{
		System.out.println("Before Method");
	}

	@After//like destructor for testcase 
	public void tearDown() throws Exception 
	{
		System.out.println("After Method");
	}

	@Test
	public void testAddMethod() 
	{
	//	fail("Not yet implemented");
		
		int result = cal.add(10, 10);
		
		Assert.assertEquals(20, result);
	}

}
