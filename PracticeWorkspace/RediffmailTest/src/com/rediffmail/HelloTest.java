package com.rediffmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HelloTest {

	@Test()
	public void ddExm() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RediffmailTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "file:///C:/Users/BOSE/Desktop/Automation%20Document/HTML%20&%20CSS/sample4.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Hello");
		Thread.sleep(5000);//this is java wait and it will wait untill the time
		//but explicit wait won't wait untill time-->it will wait untill the element visible inside the webpage
		System.out.println("Hi");
		
		// drop down handling
		WebElement cityDD = driver.findElement(By.tagName("select"));
		Select selectCity = new Select(cityDD);
		// selectCity.selectByVisibleText("chenai");
		// selectCity.selectByValue("xx");
		selectCity.selectByIndex(2);

	}

}
