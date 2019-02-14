package com.rediffmail;
//package com.rediffmail;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	public class HandleMultipleWindow {
		@Test()
		public void handlingWins(){
			String appUrl="https://www.hdfcbank.com/";
			System.setProperty("webdriver.chrome.driver", "E:\\TrainingWorkspace\\Demo\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(appUrl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String pwin=driver.getWindowHandle();// find the parent window id
			System.out.println(pwin);
			driver.findElement(By.id("loginsubmit")).click();	
			
			Set<String> allwins=driver.getWindowHandles();
			
			for(String all:allwins){
				System.out.println(all);
				//logic
				if(!pwin.equals(all)){
					driver.switchTo().window(all); // display parent and child id 
					driver.manage().window().maximize();
				
					//driver.close();
					driver.quit();}}}}



