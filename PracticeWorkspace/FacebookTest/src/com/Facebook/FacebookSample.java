package com.Facebook;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class FacebookSample {
	@Test()
	public void facebooklaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\FacebookTest\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	                driver.findElement(By.name("firstname")).sendKeys("subhash");
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("subahsh");
		//driver.findElement(By.cssSelector("#u_0_n")).sendKeys("subhash");
		//driver.findElement(By.cssSelector(".inputtext _58mg _5dba _2ph-")).sendKeys("subhash");
		//driver.findElement(By.id("u_0_n")).sendKeys("subhashchnadrabose3@gmail.com");
		//driver.findElement(By.id("u_0_n")).sendKeys("subhash");
		//driver.findElement(By.id("u_0_n")).sendKeys("subahsh");
	                      driver.findElement(By.name("lastname")).sendKeys("chandra");
	                      driver.findElement(By.name("reg_email__")).sendKeys("subhashchandrabose3@gmail.com");
	                      driver.findElement(By.id("u_0_r")).sendKeys("subhashchandrabose3@gmail.com");
	                      driver.findElement(By.xpath("//*[@id='u_0_v']")).sendKeys("1234567");
	Select select =new Select(driver.findElement(By.name("birthday_day")));
	select.selectByValue("19");
	Select select1 =new Select(driver.findElement(By.name("birthday_month")));
	select1.selectByVisibleText("Jul");
	Select select2 =new Select(driver.findElement(By.name("birthday_year")));
	select2.selectByVisibleText("1986");
	driver.findElement(By.className("_58mt")).click();
	driver.findElement(By.tagName("button")).click();
	//driver.close();//*[@id="u_0_v"]
	}}
