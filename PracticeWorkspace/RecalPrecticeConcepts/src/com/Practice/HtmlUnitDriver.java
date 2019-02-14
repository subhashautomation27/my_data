package com.Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class HtmlUnitDriver {
	@Test()
	public void htmlDriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		ChromeOptions operation=new ChromeOptions();
		//operation.addArguments("window-size=1400,800");
		operation.addArguments("headless");
		WebDriver driver=new ChromeDriver(operation);
		//WebDriver driver=new HtmlUnitDriver();
		   String url="https://www.freecrm.com/index.html";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.get(url);
		  System.out.println( driver.getCurrentUrl());
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveenk");
		   System.out.println("name entered ");
		   driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("test@123");
		   System.out.println("password informed");
		   driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		   System.out.println("click login");
		   System.out.println("done");}}
