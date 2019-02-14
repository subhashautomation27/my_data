package com.rediffmail;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class HandleMultipleWindow1 {
	@Test()
	public void handlingWins() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\TrainingWorkspace\\Demo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String appUrl="https://www.hdfcbank.com/";
		driver.get(appUrl);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String > set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		
			    String parent = (String) it.next();
                System.out.println("parent window" + parent);
				String child = (String) it.next();
		        System.out.println("child window" + child);
		Thread.sleep(3000);
		driver.switchTo().window(child);
		System.out.println("childwindowtitle" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);}}