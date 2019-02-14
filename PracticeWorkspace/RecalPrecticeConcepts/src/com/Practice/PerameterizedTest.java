package com.Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PerameterizedTest {
	@Test
	@Parameters("browser")
	public void parameterTest(String browser)
	{
		if(browser.equals("firefox"))
		{
			System.out.println("open firefox driver");
		}else if(browser.equals("chrome"))
		{
			System.out.println("open chrome driver");
		}
	}
	

}
