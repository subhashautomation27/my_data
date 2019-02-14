package com.Practice;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataFromConfig {
	static WebDriver driver;
	@Test()
	public void readDataConfig() throws IOException
	{
		 Properties prop=new Properties();
		FileInputStream fin=new FileInputStream("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\config.properties");
		prop.load(fin);
		
	  String url=prop.getProperty("url");
	  System.out.println(url);
	  
	  String browsername=prop.getProperty("browser");
	  System.out.println(browsername);
	  
	  if(browsername.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }else if(browsername.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
	  }
	  
	  driver.get(url);
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(prop.getProperty("userxpath"))).sendKeys(prop.getProperty("loginname"));
	  driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("loginPassword"));
	  driver.findElement(By.xpath(prop.getProperty("login_btn_xpath"))).click();}}

