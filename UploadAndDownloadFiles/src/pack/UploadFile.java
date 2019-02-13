package pack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFile {
	
	
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\JenkinsWorkSpace2\\UploadAndDownloadFiles\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("img")));
		
		driver.findElement(By.name("img")).click();
		
		
		//auto it code
		Runtime.getRuntime().exec("E:\\JenkinsWorkSpace2\\UploadAndDownloadFiles\\AutoIT\\uploadfile.exe");
	}

}
