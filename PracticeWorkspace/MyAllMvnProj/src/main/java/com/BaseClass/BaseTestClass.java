package com.BaseClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.utils.TestUtils;
public class BaseTestClass {
	public static WebDriver driver;
 public static void intiailaztion()
 {
	 System.setProperty("webdriver.chrome.driver","E:\\PracticeWorkspace\\MyAllMvnProj\\Drivers\\chromedriver.exe");
	 driver =new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	 //driver.manage().deleteAllCookies();
	 driver.get("http://www.google.com/");
}}
