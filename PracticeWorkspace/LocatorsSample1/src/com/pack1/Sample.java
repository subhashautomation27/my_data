package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	/*@Test()
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\TrainingWorkspace\\AutomationConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait code
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// enter url
		String url = "file:///C:/Users/BOSE/Desktop/Automation%20Document/HTML%20&%20CSS/sample1.html"*/;
		//driver.get(url);
/*		// for id
		// driver.findElement(By.id("x")).sendKeys("vijay");//for text box have
		// to use sendkeys
		// for name
		// driver.findElement(By.name("z")).sendKeys("vijay");
		// for class
		driver.findElement(By.className("y")).sendKeys("vijay");
		// driver.findElement(By.cssSelector(".yy")).sendKeys("vijay");//for
		// class .
		// driver.findElement(By.cssSelector("#xx")).sendKeys("vijay");//for id
		// #s
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("vijay");// for
																						// normal
																						// css
																						// selector
																						// -->tagname[attribute='attribute
																						// value']
		//for xpath-->//tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hello");
		driver.findElement(By.tagName("button")).click();// for buttons

	}*/

	/*@Test()
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\TrainingWorkspace\\AutomationConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait code
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// enter url
		String url = "file:///C:/Users/BOSE/Desktop/Automation%20Document/HTML%20&%20CSS/sample1.html";
		driver.get(url);
		
		//for link text
		//driver.findElement(By.linkText("my fb link")).click();
		//for partial link text
		driver.findElement(By.partialLinkText("my")).click();

	}*/
	@Test()
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\TrainingWorkspace\\AutomationConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait code
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// enter url
		String url = "file:///C:/Users/BOSE/Desktop/Automation%20Document/HTML%20&%20CSS/sample1.html";
		//driver.get(url);
		
		driver.navigate().to(url);
		driver.findElement(By.className("y")).sendKeys("vijay");
		driver.findElement(By.cssSelector(".yy")).sendKeys("vijay");
		driver.findElement(By.tagName("button")).click();
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

}
