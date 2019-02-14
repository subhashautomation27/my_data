package com.rediffmail;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FindElemetsTest {
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
		List<WebElement> list=driver.findElements(By.tagName("a"));
		    int str=list.size();
		    System.out.println("Total links:" + str);
		    for (int i = 0; i < list.size(); i++) {
		    	 String ss=list.get(i).getText();}
		    
		    for (WebElement webElement : list) {
		    	webElement.getText();
		    	System.out.println("Total links names " + webElement);}}}