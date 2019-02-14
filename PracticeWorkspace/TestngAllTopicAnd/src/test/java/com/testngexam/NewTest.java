package com.testngexam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	public static WebDriver driver ;
	//public  static WebElement element;

  @Test(priority=0,enabled=false)
  
  @Parameters({"browser", "url","emailid","passwrd"})
  public void FaceBookLogin(String browser, String url,String emailid,String password) {
	  
	  if (browser.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\chromedriver.exe");
		  driver =new ChromeDriver();
	  }else if (browser.equals("FireFox")){
		  System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\geckodriver.exe");
		   driver =new FirefoxDriver();
	  }
	  
	  driver.get(url);
	  System.out.println("url launched");
	  
	WebElement element =driver.findElement(By.xpath("//*[@id='email']"));
  	element.clear();
  	
  	WebElement element1 =driver.findElement(By.xpath("//*[@id='email']"));
  	element1.sendKeys(emailid);
  	
  	WebElement element2 =driver.findElement(By.xpath("//*[@id='pass']"));
  	element2.sendKeys(password);
  	 
  	WebElement element3 =driver.findElement(By.cssSelector("#loginbutton"));
  	element3.click();
  	
  	
  	

  }
  
  @Test(priority=1, enabled=true)
  @Parameters({"browser","url","firstname","surname","number","nwpasswrd"})
  public void RegPage(String browser,String url,String firstname,String surname, String number,String nwpasswrd ) {
	  
	  if (browser.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\chromedriver.exe");
		  driver =new ChromeDriver();
	  }else if (browser.equals("FireFox")){
		  System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\geckodriver.exe");
		   driver =new FirefoxDriver();
	  }
	  
	  driver.get(url);
	  System.out.println("url launched");
	  
	/*WebElement element =driver.findElement(By.xpath("//*[@id='u_0_q']"));
  	element.clear();*/
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebDriverWait wait=new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='u_0_q']"))));
  	
	 
  	WebElement element1 =driver.findElement(By.xpath("//*[@id='u_0_q']"));
  	element1.sendKeys(firstname);
  	
  	WebElement element2 =driver.findElement(By.xpath("//*[@id='u_0_s']"));
  	element2.sendKeys(surname);
  	
  	
  	WebElement element3 =driver.findElement(By.xpath("//*[@id='u_0_12']"));
  	element3.sendKeys(number);
  	
  	WebElement element4 =driver.findElement(By.xpath("//*[@id='pass']"));
  	element4.sendKeys(nwpasswrd);
  	
  	Select select=new Select(driver.findElement(By.xpath("#day")));
  	select.selectByValue("19");
  	
  	Select select1=new Select(driver.findElement(By.cssSelector("#month")));
  	select1.selectByValue("7");
  	
  	Select select3=new Select(driver.findElement(By.xpath("//*[@id='year']")));
  	select3.selectByVisibleText("1985");
  	
  	
  	WebElement element5 =driver.findElement(By.xpath("//input[@id='u_0_a']"));
  	element5.click();
 
   	WebElement element6 =driver.findElement(By.cssSelector("#u_0_18"));
  	element6.click();
  	}}
