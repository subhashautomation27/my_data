package com.rediffmail;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class ReadDataFromConfg {
	@Test
	public void readData() throws IOException, InterruptedException
	{
		Properties pro=new Properties();
		FileInputStream fil=new FileInputStream("E:\\PracticeWorkspace\\RediffmailTest\\DATA\\config.properties");
		pro.load(fil);
		
		String str=pro.getProperty("url");
		System.out.println(str);
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RediffmailTest\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(str);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000) ;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 WebDriverWait wait =new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='email']"))));
		
		
		driver.findElement(By.xpath(pro.getProperty("email_xpath"))).sendKeys(pro.getProperty("loginnumber"));
		driver.findElement(By.xpath(pro.getProperty("password_xpath"))).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath(pro.getProperty("login_btn_xpath"))).click();}}
