package com.retryanalizer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizer  implements IRetryAnalyzer{
	int count=0;
	int retrycount=2;
	public boolean retry(ITestResult result) {
		 
		if(count<retrycount)
		{  
			
			count++;
			return true;
		}
		return false;
		
	}

}
