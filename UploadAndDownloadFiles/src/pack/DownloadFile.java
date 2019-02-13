package pack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFile {

	
	public static void main(String[] args) throws IOException {
		/*System.setProperty("webdriver.chrome.driver", "E:\\JenkinsWorkSpace2\\UploadAndDownloadFiles\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\JenkinsWorkSpace2\\UploadAndDownloadFiles\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://only-testing-blog.blogspot.com/2014/05/login.html");
		
		driver.findElement(By.xpath("//*[@id='post-body-4024384759750876807']/div[1]/div/a[1]")).click();
		
		//auto it code
		Runtime.getRuntime().exec("E:\\JenkinsWorkSpace2\\UploadAndDownloadFiles\\AutoIT\\downloadfile.exe");
		
	}
}
