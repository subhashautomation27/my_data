package tests;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	@Test
	public void openMyBlog()
	{
		driver.get("http://www.softwaretestingmaterial.com/");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\MavenProjectstm\\Drivers\\chromedriver.exe");	
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}

}