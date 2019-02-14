package com.Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseMovementHandel {
	@Test(priority=3)// based on priority it will gng to execute mathods
	public void mousehandel() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   String url="https://www.spicejet.com";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  // String soursefile="";
		   //String deStinfile="";
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"))).build().perform();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]")).sendKeys("Dubai Visa Services");
		   System.out.println("done");
	}
	@Test(priority=2)
	public void dragAndDrop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   String url="http://jqueryui.com/droppable/";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   // here need to pass elemenet location through locators 
		   // 1. way 
		  // driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		   //or --> here we need to pass the frame index 
		   // 2.way
		   driver.switchTo().frame(0);
		   //or
		   // 3. way . here need to give frame name
		   //driver.switchTo().frame("")// frame name here need to pass 
		   WebElement soursefile=driver.findElement(By.xpath("//div[contains(@id,'draggable')]")) ;
		   WebElement deStinfile= driver.findElement(By.xpath("//div[contains(@id,'droppable')]")) ; ;
		   Actions action=new Actions(driver);
		   action.dragAndDrop(soursefile, deStinfile).build().perform();
		   Thread.sleep(3000);
		   driver.switchTo().defaultContent();//  here switching frame to main page
		   driver.findElement(By.xpath("//*[@id='content']/div[1]/ul/li[2]/a")).click();// select the nxt element 
		  System.out.println("done");
		  // driver.findElement(By.linkText("")).click();*/
	}
	
	@Test(priority=1)
	public void doubleClick() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new  ChromeDriver();
		   String url="http://www.facebook.com";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   WebDriverWait explicitwait= new WebDriverWait(driver, 30);
		   explicitwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='submit' and @id='u_0_3']"))));
		   Actions actions=new Actions(driver);
		   actions.doubleClick(( driver.findElement(By.xpath("//input[@type='submit' and @id='u_0_3']"))));
		   System.out.println("done");
		  
	}

}
