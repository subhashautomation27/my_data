package com.pack2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
	@Test()
	public void launchbrowser()
	{   
		// driver path set. 
		// here should give all slash should be forward or backword only.
		System.setProperty("webdriver.chrome.driver","E:\\PracticeWorkspace\\MyTestPro\\drivers\\chromedriver.exe");
		//browser launched
		WebDriver driver=new ChromeDriver();
		//enter url
		String url="http://www.google.com";
		driver.get(url);
		//maximize window screen
		driver.manage().window().maximize();
		// get title
	    String title=driver.getTitle();
	    System.out.println(title);
		//compare get value
		if(title.equals("Google"))
		{
			System.out.println("corrct title");
		}
		else
		{
			System.out.println("in correct tile");
		}
		//get current url
		String gcu=driver.getCurrentUrl();
		System.out.println(gcu);
		//get page source
		//String gps=driver.getPageSource();
		 //System.out.println(gps);
		//close winow 
		  driver.close();
		}}
