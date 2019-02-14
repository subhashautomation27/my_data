package com.Practice;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FindElementsHandel {
	@ Test()
	public void findElements()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   String url="https://www.amazon.in/";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  List<WebElement> list= driver.findElements(By.tagName("a"));
		  System.out.println(list.size());
		  
		  for (WebElement webElement : list) {
			  
			System.out.println(  webElement.getText());
			
		}
		  for (int i = 1; i <=518; i++) {
			  String ttl= list.get(i).getText();
			  System.out.println(ttl);
			 }
		  System.out.println("done");}}
