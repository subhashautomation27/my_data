package com.log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.TestUtils;

public class LoginTest {
	Logger log= Logger.getLogger(LoginTest.class);
	public static WebDriver driver ;
	
	@BeforeMethod
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver","E:\\PracticeWorkspace\\MyAllMvnProj\\Drivers\\chromedriver.exe");
		 driver =new ChromeDriver();
		 log.info("lanching browser");
		 driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		 //driver.manage().deleteAllCookies();
		 driver.get("http://www.freecrm.com/");
		 log.info("open freecrm site");
	}
	
	@Test(priority=1)
	public  void freecrmTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		 log.info("open freecrm site title");
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	@Test(priority=2)
	public  void freecrmlogo()
	{
		boolean flag=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).isDisplayed();
		Assert.assertTrue(flag);
		 log.info("open freecrm logo collected ");
	}	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		 log.info("open freecrm site closed");
		 log.warn("hey page not displayed ");
		 log.debug("here is errror ");
	}
}
