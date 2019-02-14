package com.Practice;

import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextAttributeEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderDatePicker {
	@Test()
	public void calender()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   String url="https://www.spicejet.com/";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  WebElement element= driver.findElement(By.xpath("//input[contains(@class,'custom_date_pic required picker-first home-date-pick')]"));
		  System.out.println(element);
		  String date="12-12-2018";
		  selectDatebyjs(element, date, driver);
	}
	
	public static void selectDatebyjs(WebElement element,String date,WebDriver driver)
	{
		  JavascriptExecutor js=(JavascriptExecutor) driver  ;
				  {
					  js.executeScript("arguments[0].ServletContextAttributeEvent('value' '"+ date + "')",element);
			      }
		}
	}


