 package com.rediffmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	//@Test()
	public void browser()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RediffmailTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximaize window
		             driver.manage().window().maximize();
		//delete ciikies
		              driver.manage().deleteAllCookies();
		              
		              Actions actions=new Actions(driver);
		             // actions.moveToElement("");
		            
	}

}
