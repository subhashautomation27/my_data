package com.rediffmail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class RediffiSample {
	@Test()
	public void Handlepopup()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\RediffmailTest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximaize window
		             driver.manage().window().maximize();
		//delete ciikies
		              driver.manage().deleteAllCookies();
		
		
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(url);
		//driver.navigate().to(url);
		//page load time 
				     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// default wait 10 seconds for all the elements in web page
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				      
				driver.findElement(By.name("proceed")).click();
				Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				String text=alert.getText();
				if (text.equals("Please enter a valid user name"))
				{
					System.out.println("content qre equals");
				}
				else
				{
					System.out.println("content is not equals");
				}
		        alert.accept();
		        driver.quit();
	}

}
