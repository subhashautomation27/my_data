package com.pack1;

import org.testng.annotations.Test;

public class SampleTest1 {
	 
	@Test()
	public void launchbrowser()
	{
		System.out.println("launch browser");
	}
	
	@Test()
	public void login()
	{
		System.out.println("enter into login");
	}
	
	@Test()
	public void password()
	{
		System.out.println("password");
	}
	
	@Test()
	public void closebrowser()
	{
		System.out.println("close browser");
	}

}
