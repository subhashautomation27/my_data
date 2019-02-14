package com.HashMap.exam;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseTestClass;
import com.utils.TestUtils;
public class FreeCrmTest extends BaseTestClass {
	public  Data data ;
	public String credentials;
	public String credentialsinfo[];
	public TestUtils util;
	public  BaseTestClass basetest;
	
	@BeforeMethod
	public void setup() throws IOException
	{   basetest=new BaseTestClass();
	basetest.intiailaztion();
	 driver.get("https://www.freecrm.com/index.html?e=1");
		String title= driver.getTitle();
		System.out.println("freecrm title---->" + title);
	util.takeScreenShot("freecrm_loginpage");
	}
	
	@Test(priority=1)
	public void freecrmLoginWithTest() throws IOException
	{   data=new Data();
	    util=new TestUtils();
	 credentials=data.getuserfreecrmlogininfo().get("magagingdirector");
	 credentialsinfo=credentials.split("_");
	 
	 WebElement usename=driver.findElement(By.name("username"));
	 util.sendkeys(driver, usename, 2, credentialsinfo[0]);
	 
	 WebElement password=driver.findElement(By.name("password"));
	 util.sendkeys(driver, password, 2, credentialsinfo[1]);
	 
	 WebElement loginbtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginbtn);
	String currenttit= driver.getCurrentUrl();
	System.out.println("current title-->" +currenttit );
	System.out.println(1);
	// util.clickon(driver, loginbtn, 2);
	/*Assert.assertEquals("https://www.freecrm.com/index.cfm?"
			+ "CFID=2049100&CFTOKEN=94133572&jsessionid=3e30ae5a72cd490dabcd2c1230571e596260", currenttit);*/
	    // getting error at this point 
		//driver.switchTo().frame("processFrame");
	System.out.println(2);
	
	WebElement event=driver.findElement(By.xpath("//*[@id='homebox_THISWEEK']/div[1]/div[2]/input[1]"));
	JavascriptExecutor js1= (JavascriptExecutor)driver;
	 js1.executeScript("arguments[0].click();", event);
	 System.out.println(3);
	
	 util.takeScreenShot("freecrm_login_succesfully");
	 System.out.println(4);
	}
	/*@Test(priority=2)
	public void freecrmevent()
	{
		WebElement event=driver.findElement(By.xpath("//*[@id='homebox_THISWEEK']/div[1]/div[2]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", event);
		
	}*/
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();}}
