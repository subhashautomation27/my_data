package com.Practice;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentWindowHandle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class HandleWindoes {
	 public  WebDriver driver ;
	/*@Test(groups={"smokeTest" , "FunctionalTest"})
	public void loginTest()
	{
		System.out.println("logged in successfully");
	}*/
   @Test()
   public void windowsHAndle() throws InterruptedException, IOException
   {
	   System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\geckodriver.exe");
	   driver=new FirefoxDriver();
	   driver.get("https://www.hdfcbank.com/");
	   
	  takescreen("browser launched successfully");
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  // driver.findElement(By.xpath("//div[contains(@class,'recaptcha-checkbox-checkmark')]")).click();
	  String parentwin= driver.getWindowHandle();
	  System.out.println("parentwindowid" + parentwin );
	  System.out.println(driver.getTitle());
	  // WebDriverWait wait=new WebDriverWait(driver, 50);
	   //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//a[@id='loginsubmit']"))));
	   driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
	   
	   Set<String> set= driver.getWindowHandles();
	   
	   
	   
	  
	   Iterator<String> it=set.iterator();
	    String prntw= it.next();
	    System.out.println(prntw);
	    
	    
	    // here taking the child element
	    String chiw=it.next();
	    System.out.println(chiw);
	    Thread.sleep(2000);
	     System.out.println(driver.getCurrentUrl());
	    // driver.close();
	     
	     driver.switchTo().window(prntw);
	  
	     if(prntw.equals(chiw))
	     {
	    	 System.out.println("this is child window" + chiw);
		}else
		{
			System.out.println("this is parent window" + prntw);// here parent window display boz prntw and chiw are not equals.
		}
	     driver.switchTo().window(chiw);
	     if(!prntw.equals(chiw))
	     {
	    	 //here parent window display boz prntw and chiw are not equals.
			 System.out.println("1.this is child window:" + chiw);
		}else
		{
			System.out.println("2.this is parent window:" + prntw);
		}
	  // driver.close();
	   
   takescreen("success");}
   
   public void takescreen(String filename) throws IOException {
File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file,new File("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Screenshot" + filename + ".jpg"));
   }

}
