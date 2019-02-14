package com.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {
	WebDriver driver ;
	
	@BeforeMethod
	public void setup(String browser)
	{
		 if (browser.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\chromedriver.exe");
			  driver =new ChromeDriver();
		  }else if (browser.equals("FireFox")){
			  System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\geckodriver.exe");
			   driver =new FirefoxDriver();
			   
			   driver.manage().window().maximize();
			   driver.manage().deleteAllCookies();
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.get("https://amazon.force.com/Register?setlang=en_US");
		  }
	}
	
	@DataProvider
	public void getdataExcel()
	{
		
	}
    @Test
	public void ReadData(String FirstName,String LastName,String emailid,
			String confiremailid,String password, String confpassword)
	{
    	driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:First-Name']")).clear();
    	
    	driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:First-Name']"))
    	.sendKeys(FirstName);
    	
        driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:LastName']")).clear();
    	
    	driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:LastName']"))
    	.sendKeys(LastName);
    	
        driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:emailaddress']")).clear();
    	
    	driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:emailaddress']"))
    	.sendKeys(emailid);
    	
        driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:confirmemailaddress']")).clear();
    	
    	driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:confirmemailaddress']"))
    	.sendKeys(confiremailid);
    	
        driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:j_id92:password']")).clear();
    	
    	driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:j_id92:password']"))
    	.sendKeys(password);
    	
        driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:j_id92:confirmPassword']")).clear();
    	
    	driver.findElement(By.xpath("//*[@id='communitiesSelfRegPage:portId:RegisterForm:j_id92:confirmPassword']"))
    	.sendKeys(confpassword);
	}
    
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }


 


}
