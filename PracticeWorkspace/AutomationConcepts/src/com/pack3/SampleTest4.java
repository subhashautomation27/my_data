package com.pack3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest4 {
	@Test()
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\AutomationConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\AutomationConcepts\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		String url= "http://www.google.com";
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.close();
	}

}
