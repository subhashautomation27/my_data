package failureandpassandskippscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
@Listeners(TestListeners.class)
public class BaseTest {
	
	public static WebDriver driver;
	
	public static void init(String browser)
	{
		if (browser.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\chromedriver.exe");
			  driver =new ChromeDriver();
		  }else if (browser.equals("FireFox")){
			  System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\TestngAllTopicAnd\\Drivers\\geckodriver.exe");
			   driver =new FirefoxDriver();
			   
			   driver.manage().window().maximize();
			   driver.manage().deleteAllCookies();
			   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	}
	
	/*public static void pass1(String methodname) throws IOException
	{   
		File filesrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filesrc, new File("E:\\PracticeWorkspace\\TestngAllTopicAnd\\screenshots\\"+methodname+".jpg"));
	}*/
	
	public static void fail1(String methodname) throws IOException
	{    
		
		File filesrc1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filesrc1, new File("E:\\PracticeWorkspace\\TestngAllTopicAnd\\screenshots\\"+methodname +".jpg"));
	}
	
	/*public static void skipp1(String methodname) throws IOException
	{   
		File filesrc2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filesrc2, new File("E:\\PracticeWorkspace\\TestngAllTopicAnd\\screenshots\\"+methodname+".jpg"));
	}
	*/
	}


