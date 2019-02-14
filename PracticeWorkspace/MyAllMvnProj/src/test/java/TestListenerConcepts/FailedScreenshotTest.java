package TestListenerConcepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseClass.BaseTestClass;
@Listeners(CustomListener.class)
public class FailedScreenshotTest  extends BaseTestClass{
	
	
	@BeforeMethod
	public static  void setup()
	{
		intiailaztion();
	}
	
	@Test(invocationCount=5, groups="failed")
	public void loginPage()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=1, groups="failed")
	public void homePage()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=2, groups="failed")
	public void SearchPage()
	{
		Assert.assertEquals(false, true);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
