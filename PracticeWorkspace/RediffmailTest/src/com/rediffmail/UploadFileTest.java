package com.rediffmail;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class UploadFileTest {
	@Test()
	public void frame() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RediffmailTest\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="https://html.com/input-type-file/";
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("om-lightbox-postal-optin-email")).sendKeys("sssmnnn@gmail.com");//eneterting mail id
		driver.findElement(By.id("om-lightbox-postal-optin-submit")).click();// after entered mail id click n ok btn.
		//here locate that browse btn then send file path
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\BOSE\\Desktop\\ALL FILES\\pbi.docx");}}
