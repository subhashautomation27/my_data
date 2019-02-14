package com.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

//5.LoginPageTest
public class LoginPageTest extends BasePage {
	
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initilazation();
		 loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void checkinpageTilte()
	{
		String title=loginpage.validateloginpageTitle();
		//Assert.assertEquals(title, "https://mail.rediff.com/cgi-bin/login.cgi", "not a rediffmail page");
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	
	@Test(priority=2)
	public void checklogoimage()
	{
		boolean flag=loginpage.validatefacebookimage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		homepage=loginpage.login(porp.getProperty("email"),porp.getProperty("password"));
	}
	
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}
	

}
