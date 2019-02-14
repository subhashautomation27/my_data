package com.pack1;
import org.testng.annotations.Test;
public class FirstTest {
	@Test
	public void launchbrowser()
	{
		System.out.println("browser launched");
	}
	
	@Test
	public void enterusername()
	{
		System.out.println("user name success");
	}
	
	@Test
	public void entervalidpassword()
	{
		System.out.println("password correct");
	}
	
	@Test
	public void clickonlogin()
	{
		System.out.println("login successfully");
	}

}
