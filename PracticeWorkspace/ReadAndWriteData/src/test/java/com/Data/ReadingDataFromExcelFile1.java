package com.Data;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingDataFromExcelFile1 {
	
	
    @Test
	public void init() throws IOException
	{
		 //String data123="E:\\PracticeWorkspace\\ReadAndWriteData\\ExcelData\\Test.xlsx";
		 File file=new File("E:\\PracticeWorkspace\\ReadAndWriteData\\ExcelData\\BigData.xlsx");
		 FileInputStream fin=new FileInputStream(file);
		 XSSFWorkbook book=new XSSFWorkbook(fin);
		 XSSFSheet sheet=book.getSheetAt(0);
		 XSSFRow row=null ;
		 XSSFCell cell=null;
		 
		 // this code for username from testdata file line number 250 and cell number 4
		 String userna=sheet.getRow(250).getCell(4).getStringCellValue();
		 System.out.println(userna);
		 
		 // this code for password from testdata file line number 250 and cell number 6
		 String passwd=sheet.getRow(250).getCell(6).getStringCellValue();
		 System.out.println(passwd);
		 
		 System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\ReadAndWriteData\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userna);
		System.out.println("username entered succesfully");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(passwd);
		System.out.println("password entered successfully");
		
		driver.close();
	}
	
	

}

