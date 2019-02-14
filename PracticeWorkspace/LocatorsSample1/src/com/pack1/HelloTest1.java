package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HelloTest1 {

	
	@Test()
	public void facebooklaunch()
	{
		System.setProperty("webdriver.chrome.driver","E:\\PracticeWorkspace\\LocatorsSample1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.name("firstname")).sendKeys("Nag");
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		driver.findElement(By.id("u_0_p")).sendKeys("8074473461");
		
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByValue("14");
		
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Feb");
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByValue("1986");
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		
	}

}
