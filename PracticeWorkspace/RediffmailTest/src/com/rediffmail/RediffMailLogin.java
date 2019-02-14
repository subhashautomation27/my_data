package com.rediffmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RediffMailLogin 
{
	
	@Test()
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RediffmailTest\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(url);
		driver.navigate().to(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
                                   driver.findElement(By.id("login1")).sendKeys("subash");
		driver.findElement(By.name("passwd")).sendKeys("chandrabose");
		Thread.sleep(20000);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot Password?")));
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.id("txtlogin")).sendKeys("subhashchandra");
		driver.findElement(By.name("next")).click();
		driver.findElement(By.id("hint_ques")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.name("txthintans")).sendKeys("banglore");
		Thread.sleep(4000);
		/*driver.findElement(By.xpath("//img[contains(text(),' ')]")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.name("txtcaptcha")).
		driver.findElement(By.name("txtcaptcha")).sendKeys("");*/
		////*[contains(@name,’abs ’)]
		//driver.findElement(By.cssSelector("//*[contains(@img,'/register/tb135/tb_getimage.php?uid=1542864760&start=')]")).sendKeys(arg0);
		//driver.findElement(By.className("rfloatL text-field")).sendKeys("/register/tb135/tb_getimage.php?uid=1542864760&start=");
		driver.findElement(By.linkText("Back")).click();
		driver.findElement(By.name("hint_ques")).sendKeys("chennai");
		driver.findElement(By.tagName("img")).sendKeys("7YMK");
		driver.findElement(By.cssSelector("input//[type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.close();
		
		
		
	    
		
	}

}
