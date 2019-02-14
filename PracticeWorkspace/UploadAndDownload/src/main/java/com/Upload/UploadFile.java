package com.Upload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class UploadFile {
	
	public static WebDriver driver;
	@BeforeMethod
	public static void init()
	{
		 System.setProperty("webdriver.chrome.driver","E:\\PracticeWorkspace\\UploadAndDownload\\Drivers\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 //driver.manage().deleteAllCookies();
		
	}
	
	@Test(priority=2, enabled=false)
	public void fileUpload() throws IOException
	{   
		 driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		 WebElement element= driver.findElement(By.xpath("//input[@name='img']"));
				 
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(element));
		 driver.findElement(By.name("img")).click();
		 Runtime.getRuntime().exec("E:\\PracticeWorkspace\\UploadAndDownload\\AutiIt\\Hello.exe");
		}
	@Test(priority=1)
	public void fileDownload() throws IOException
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/05/login.html");
		driver.findElement(By.cssSelector("#post-body-4024384759750876807 > div:nth-child(1) > div > a:nth-child(1)")).click();
//	Runtime.getRuntime().exec("E:\\PracticeWorkspace\\UploadAndDownload\\AutiIt\\Hellodownload.exe");
	}

}
