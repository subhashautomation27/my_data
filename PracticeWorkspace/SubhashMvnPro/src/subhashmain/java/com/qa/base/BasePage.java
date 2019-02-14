package com.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;
// 2. BasePage
// this constructor . 
public class BasePage {
	public static Properties porp;
	public static WebDriver driver;
	public BasePage() throws IOException
	{
		 porp=new Properties();
		FileInputStream fin=new FileInputStream("E:\\PracticeWorkspace\\SubhashMvnPro\\src\\subhashmain\\java\\com\\qa\\config\\config.properties");
		porp.load(fin);
	}
	
	// here initlization the brower .
	public void initilazation()
	{
		String browsername=porp.getProperty("browser");
		if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		 driver =new ChromeDriver();}
		else if(browsername.equals("FF")){
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\geckodriver.exe");
		driver =new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   // here am trying pass page out time and imlicit time through class variables .
		   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		   driver.get(porp.getProperty("url"));}}
