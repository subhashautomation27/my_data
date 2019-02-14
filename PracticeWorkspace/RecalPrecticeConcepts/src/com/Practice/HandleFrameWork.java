package com.Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class HandleFrameWork {
	@Test()
	public void handleFrame() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   String url="https://www.freecrm.com/index.html";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("naveenk");
		   driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("test@123");
		   driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-small']")).click();
		   System.out.println("login success");
		   Thread.sleep(3000);
		   //here switch to frame from main page
		   driver.switchTo().frame("mainpanel");
		   System.out.println("frame switched");
		   Thread.sleep(2000);
		   //here after switching select element[companies] from the list
		   driver.findElement(By.xpath("//a[contains(text(),'Companies')]")).sendKeys("Full Search From");
		   System.out.println("companies selected");
		   Thread.sleep(2000);
		   System.out.println("done");}}
		  
