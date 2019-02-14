package failureandpassandskippscreenshots;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class FailAndPassAndSkipp extends BaseTest{
	
	
	// here we are giving manually for take screenshots (pass,fail,skipped)
/*	@BeforeMethod
	public static  void setup()
	{
		init("chrome");
	}
	@Test
	public static void failed() throws IOException
	{    fail1("fail1");
		System.out.println("failed");
	Assert.assertEquals(false, true);
	}
	
	@Test
	public static void passed() throws IOException 
	{   pass1("pass");
		System.out.println("passed");
	Assert.assertEquals(true, true);
	}
	@Test
	public static void skipped() throws IOException
	{  skipp1("skipp");
		System.out.println("skipped");
	Assert.assertEquals(false, true);
	}
	
	@Test
	public static void failed1() throws IOException
	{    fail1("fail2");
		System.out.println("failed1");
	Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}}*/
	
	@BeforeMethod
	public static  void setup()
	{
		init("chrome");
	}
	@Test()
	public static void regpage() throws IOException
	{    //fail1("fail1");
		System.out.println("regpage");
	Assert.assertEquals(true, true);
	}
	
	@Test
	public static void homepage() throws IOException 
	{   //pass1("pass");
		System.out.println("homepage");
	Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods={"regpage"})
	public static void loginpage() throws IOException
	{  //skipp1("skipp");
		System.out.println("loginpage");
	Assert.assertEquals(true, true);
	}
	
	@Test
	public static void logout() throws IOException
	{   // fail1("fail2");
		System.out.println("logout");
	Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}}