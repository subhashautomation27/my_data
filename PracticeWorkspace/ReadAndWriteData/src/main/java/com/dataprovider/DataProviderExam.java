package com.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExam {
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data={{"subhashchnadrabose@gmail.com","8123232838"},{"saraswathisubhash","9876543211"},
				{"asdwer345","uytr567453"}};
		return data;
	}
	
	@Test(dataProvider="data")
	public void loginPage(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\ReadAndWriteData\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://facebook.com/login");
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	    driver.close();
	   
	    
	}

}
