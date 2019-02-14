package com.testdata;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.sf.jxls.reader.XLSReader;
public class DataRead {
	public WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\MyMvnXlDataReader\\Drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 }
		 
		 @Test()
		 public void dataTest()
		 {
		 
		//*[@id="customers"]/tbody/tr[3]/td[1]// for company column 
		//*[@id="customers"]/tbody/tr[3]/td[2]// contact column
		//*[@id="customers"]/tbody/tr[2]/td[3] // for country column
		 
		
		 // this is for company xpath . using and spliting 
		
		 String befotrexpath_company="//*[@id='customers']/tbody/tr[" ;
		 String afterxpath_compamy="]/td[1]";
		 
		// this is for contact xpath . using and spliting 
		 String befotrexpath_contact="//*[@id='customers']/tbody/tr[" ;
		 String afterxpath_contact="]/td[2]";
				 
				// this is for country xpath . using and spliting 
		String befotrexpath_country="//*[@id='customers']/tbody/tr[" ;
		String afterxpath_country="]/td[3]";
		
		 List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']//tr"));
		 System.out.println("total rows =" + rows.size());
		 int rowscount= rows.size();
	//	Xls_Reader reader=new Xls_Reader();
		
		 
		 for(int i=2; i<=rowscount ; i++)
		 {
			 String actualxpath_company = befotrexpath_company + i + afterxpath_compamy ;
			 System.out.println(actualxpath_company);
			 String company= driver.findElement(By.xpath(actualxpath_company)).getText();
			 System.out.println("company namae:::" + company);
			 
			 String actualxpath_contact = befotrexpath_contact + i + afterxpath_contact ;
			 System.out.println(actualxpath_contact);
			 String contact= driver.findElement(By.xpath(actualxpath_contact)).getText();
			 System.out.println("contact namae:::" + contact);
			 
			 String actualxpath_country = befotrexpath_country + i + afterxpath_country ;
			 System.out.println(actualxpath_country);
			 String country= driver.findElement(By.xpath(actualxpath_country)).getText();
			 System.out.println("country namae:::" + country);}}
		 
		 @AfterMethod
		 public void tearDown()
		 {
			// driver.quit();
		 }}
