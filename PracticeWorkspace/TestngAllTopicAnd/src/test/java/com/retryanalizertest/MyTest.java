package com.retryanalizertest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTest {
	
	
	@BeforeMethod
	public void init()
	{     // SoftAssert  asserta= new SoftAssert();
		System.out.println("browser launched");
		System.out.println("loggined url");
		
		System.out.println("enter in login page");
		System.out.println("enter uswr name and password");
		//asserta.assertEquals(true, true); 
		System.out.println("enter search page");
		System.out.println("logout page");
		//asserta.assertAll();
		
	}
	
	//@Test(retryAnalyzer=com.retryanalizer.RetryAnalizer.class)
	@Test(priority=1,groups="test")
	public void loginTest()
	{   
		Assert.assertEquals(true, true);
		
		/* SoftAssert  asserta1= new SoftAssert();
	  System.out.println(1);
	     asserta1.assertEquals(true, true); 
		System.out.println(2);
		asserta1.assertAll();*/
	}
	
	@Test(priority=2)
	public void homwPage()
	{ 
		Assert.assertEquals(true, true);
		/*SoftAssert  asserta2= new SoftAssert();
	  System.out.println(3);
	     asserta2.assertEquals(true, true); 
		System.out.println(4);
		asserta2.assertAll();*/
	}
	
	
	@Test(priority=3,groups="test1")
	public void logoutTest()
	{
		
		Assert.assertEquals(true, true);
		/* SoftAssert  asserta3= new SoftAssert();
		  System.out.println(5);
		     asserta3.assertEquals(true, true); 
			System.out.println(6);
			asserta3.assertAll();*/
	}
	
	
	@AfterMethod
	public void tearDown() throws CloneNotSupportedException
	{
		clone();
	}

}
