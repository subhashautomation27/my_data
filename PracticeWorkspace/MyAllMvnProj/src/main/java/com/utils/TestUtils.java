package com.utils;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import org.apache.commons.io.FileUtils;


import com.BaseClass.BaseTestClass;
public class TestUtils  extends BaseTestClass{
	
     public static long PAGE_LOAD_TIMEOUT=50;
    // public static long IMPLICIT_TIMEOUT=20;
     
    // 1. METHOD FOR SENDKEYS  
     public static void sendkeys(WebDriver driver , WebElement elemnet, int timeout ,String value) {
	  new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(elemnet));
	  elemnet.sendKeys(value);}
     
     //2.. METHOD FOR CLICKON
   public static void clickon(WebDriver driver,WebElement elemnet,int timeout)  {
	  new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(elemnet));
	  elemnet.click(); }
   
   
   
   //3. METHOD FOR SCREENSHOT
   public static void takeScreenShot(String filename) throws IOException{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\PracticeWorkspace\\MyAllMvnProj\\screenshorts\\"+filename+"_"+".jpg"));}
   
   public static void failed(String testmethodname) throws IOException{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\PracticeWorkspace\\MyAllMvnProj\\screenshorts\\"+testmethodname+"_"+".jpg"));}}




