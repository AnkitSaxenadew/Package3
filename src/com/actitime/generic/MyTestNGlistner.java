package com.actitime.generic;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyTestNGlistner implements ITestListener {

	public static int toatalTestExecured, successcount, failcount, skipcount=0;
	
	@Override
	public void onTestStart(ITestResult result) {
		toatalTestExecured++;
	Reporter.log(s, level);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		successcount++;
		Reporter
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		failcount++;
		Reporter.log(result"Test skiped");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test suite execution start"+new Date(),true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test suite execution end"+new Date());
		Reporter.log("Total test executed"+totalTestExecuted,true);
		Reporter.log("Total test passed"+successcount);
		Reporter.log("Total test failed"+failcount,true);
		Reporter.log("Total test skkiped"+skipcount,true);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
