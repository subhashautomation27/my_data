package com.Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliYoutubeTest {
	public static WebDriver  driver; 
	
	public  static void takeScreenShot(String filename) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Screenshot",filename+".jpg"));
				}
	@Test
	public static void youtubeTest() throws FindFailed, IOException, InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RecalPrecticeConcepts\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
	         driver.manage().deleteAllCookies();
	driver.get("https://www.youtube.com/watch?v=5xSBfcw4ZVg");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Screen s = new Screen();
	
	//1. onw way to perform operations 
	/*//Pattern pauseImg = new Pattern("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\YT_Pause.png");
	Pattern pauseImg = new Pattern("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\Capture.jpg");
	s.wait(pauseImg,2000);
	s.click();
	
	takeScreenShot("scrren_youtube_pause");
	
	Pattern playImg = new Pattern("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\YT_Play.png");
	//Pattern playImg = new Pattern("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\play.jpg");
	s.wait(playImg,2000);
	s.click();
	s.click();
	takeScreenShot("scrren_youtube_play");
	
	Pattern maximizeImg = new Pattern("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\YT_Maximize.png");
	//Pattern maximizeImg = new Pattern("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\Capture.jpg");
	s.wait(maximizeImg,2000);
	s.click();
	
	takeScreenShot("scrren_youtube_maximize");
	*/
	
	//2. 2nd way to perform operations by using the screen class methods 
	/*s.find("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\YT_Pause.png");
	s.wait(2000);
	s.click();*/
	s.find("E:\\PracticeWorkspace\\RecalPrecticeConcepts\\images\\YT_Maximize.png");
	s.click();
	takeScreenShot("youtube");
	driver.close();}}
	
	








