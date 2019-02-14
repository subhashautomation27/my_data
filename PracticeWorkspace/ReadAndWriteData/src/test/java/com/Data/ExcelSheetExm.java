package com.Data;

//package com.Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelSheetExm {
	
	@Test()
	public void readDataFromExcelSheet() throws IOException {
		
		
		String exf="E:\\PracticeWorkspace\\ReadAndWriteData\\ExcelData\\BigData.xlsx";
		File f=new File(exf);
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("bgdata");
		XSSFRow row=null;
		XSSFCell cell=null;
		
		/*String uname=sh.getRow(184).getCell(4).getStringCellValue();
		System.out.println(uname);*/
		
		//String pass=sh.getRow(184).getCell(6).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "E:\\JenkinsWorkSpace2\\ReadDataFromThirdPartyAccess\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(sh.getRow(184).getCell(4).getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(sh.getRow(184).getCell(6).getStringCellValue());
	}
	

}
