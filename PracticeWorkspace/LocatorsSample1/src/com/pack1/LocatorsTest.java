package com.pack1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsTest {
	@Test()
	public void locators()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\PracticeWorkspace\\LocatorsSample1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String  url="file:///C:/Users/BOSE/Desktop/Automation%20Document/HTML%20&%20CSS/sample5.html";
		String url="file:///C:/Users/BOSE/Desktop/Automation%20Document/HTML%20&%20CSS/sample4.html";
		//driver.get(url);
		
		//1.id --> 
		//driver.findElement(By.id("u100")).sendKeys("subhash");
		//driver.findElement(By.id("p100")).sendKeys("chandra");
		
		
		//2.name-->
		//driver.findElement(By.name("subhash")).sendKeys("subhash");
		//driver.findElement(By.name("chandra")).sendKeys("chandra");
		
		//3.xpath--> 1.absolute not use only relative -->bcoz hierarchy like(city/town/village) --> 
		//    "//tagname[@atrributename='attribute value']"--->//*[@id="u100"]
		//driver.findElement(By.xpath("//input[@id='u100']")).sendKeys("subhash");
		//driver.findElement(By.xpath("//input[@name='chandra']")).sendKeys("chandra");
		
		
		//4.css selector-->here for id-->[#idvalue], for class-->[.classvalue]
		//driver.findElement(By.cssSelector("#u100")).sendKeys("subhash");
		//driver.findElement(By.cssSelector("#p100")).sendKeys("chandra");
		//driver.findElement(By.cssSelector("input[name='chandra']")).sendKeys("subhash");
		
		//5.linktest---takes complete string
		//driver.findElement(By.linkText("open fb")).click();
		
		//6.partial link-- takes partial string or substring
		//driver.findElement(By.partialLinkText("open ")).click();
		
		//7.tag name
		  //driver.findElement(By.tagName("button")).click();
		
		//@using navigators :
		driver.navigate().to(url);
		//driver.findElement(By.id("u100")).sendKeys("subhash");
		//driver.findElement(By.xpath("//*[@id='p100']")).sendKeys("chandra");
		//driver.findElement(By.tagName("button")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		}}
