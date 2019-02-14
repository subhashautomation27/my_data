package com.Practice;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DynamicGoogleSearchHandel {
	@Test()
	public void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   String url="https://www.google.com";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("testing");
		   List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendent::div[@class='sbl1']"));
		   System.out.println(list.size());
		   
		   for (int i = 0; i <=list.size(); i++) {
			   System.out.println(list.get(i).getText());
			   
			   if(list.get(i).getText().contains("testing"))
			   {
				   list.get(i).click();
				   break;
			   }}}}
