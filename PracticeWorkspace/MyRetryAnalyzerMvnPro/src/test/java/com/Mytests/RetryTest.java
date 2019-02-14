package com.Mytests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.RetryAnalyzer.RetryAnalyzercls;

public class RetryTest {
	
	
	@Test(retryAnalyzer=com.RetryAnalyzer.RetryAnalyzercls.class)
	public void test1()
	{
		Assert.assertEquals(false, true);//false
	}
	@Test(retryAnalyzer=com.RetryAnalyzer.RetryAnalyzercls.class)
	public void test2()
	{
		Assert.assertEquals(false, true);//false 
	}

}
