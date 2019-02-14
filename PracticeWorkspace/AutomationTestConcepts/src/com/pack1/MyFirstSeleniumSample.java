package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstSeleniumSample {
	@Test
	public void launchbrowser()
	{
		//set browser path 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BOSE\\Desktop\\browserdriversjarfiles\\browsers\\chromedriver.exe");
		//"E:\\PracticeWorkspace\\AutomationTestConcepts\\drivers\\chromedriver.exe");
	    // launch browser
		WebDriver driver=new ChromeDriver();
		//enter url
		String url="http://www.google.com";
		driver.get(url);
		driver.manage().window().maximize();
		//enter value on textbox
		//driver.findElement(By.id("")).sendKeys("seleniumhq");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	

}
