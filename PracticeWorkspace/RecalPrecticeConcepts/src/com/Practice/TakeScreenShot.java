package com.Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TakeScreenShot {
	public  static WebDriver driver;
	public  static  WebElement element;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver","E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="https://en-gb.facebook.com/login/" ;
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("homw_page_tite--->"+ title);}
	
	@Test(priority=1,groups="facebook")
	public void homePage() throws IOException{
		
		//1. screen shot
		takeScreenShot("facebook-home_page");
		//  here taking ss for home page
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		WebElement emailname=driver.findElement(By.id("email"));
		sendKeys(driver, emailname, 2, "subhashchandrabose3@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		sendKeys(driver, password, 2, "8123232838");
		
	    /*WebElement loginbtn=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		clickon(driver, loginbtn, 2);*/
        
		//here am using java scrift for button 
		WebElement btnlogin= driver.findElement(By.xpath("//button[@id='loginbutton']"));
		JavascriptExecutor js= (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].click();",btnlogin );
		
		String loginpage= driver.getCurrentUrl();
		System.out.println("login_page_ tilte --->" +loginpage );
		//2.taking scrren shot 
		takeScreenShot("face_login_page"); // here taking ss for login page and store to scrrenshot folder
		/*WebDriverWait wait= new webdriver (driver,10);
		wait.until(ExpectedConditions.visibilityOf(element))*/
		}
	//
	@Test(priority=2,groups="facebook")
	public static void singupPage() throws IOException, InterruptedException
	{
		WebElement Signup=driver.findElement(By.linkText("Sign up for Facebook"));
		clickon(driver, Signup, 3);
		WebElement firstname=driver.findElement(By.name("firstname"));
		sendKeys(driver, firstname, 2, "sarru");
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		sendKeys(driver, lastname, 2, "sarru");
		
		WebElement mobile=driver.findElement(By.name("reg_email__"));
		sendKeys(driver, mobile, 2, "9876543230");
		
		//send1(driver, element, "subhaschandrabose");
		
		//WebElement password=
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("subhash123");
		//sendKeys(driver, password, 5, "subhash123");
		
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("19");
		
		Select select1=new Select(driver.findElement(By.id("month")));
		select1.selectByValue("7");
		
		Select select2=new Select(driver.findElement(By.id("year")));
		select2.selectByIndex(34);
		
		WebElement radiobtn=driver.findElement(By.xpath("//input[@type='radio' and @id='u_0_b']"));
		clickon(driver, radiobtn, 2);
		
		WebElement singupbtn =driver.findElement(By.xpath("//button[@type='submit' and @id='u_0_12']"));
		clickon(driver, singupbtn, 2);
		Thread.sleep(2000);
		
		takeScreenShot("facebook-new-loginpage");
		
	}
	
	// for taking screen shot .
	// here i should pass one string varibale and copy and paste file path from project folder file(screenshot)
	
	public  static void takeScreenShot(String filename) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Screenshot"+filename+".jpg"));
				}
	
	
	// this method for passing some paramets through method .
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	/*public static void send1(WebDriver driver,WebElement element,String value)
	{
		element=driver.findElement(By.name("reg_email__"));

		element.sendKeys(value);
		
	}*/
	
	// this method using for clicking buttons
	//but in this progaram am nt used . 
	// for button clicking am used javascrift executer
	public static void clickon(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}}
