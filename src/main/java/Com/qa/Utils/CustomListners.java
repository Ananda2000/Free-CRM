package Com.qa.Utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestBase.testBase;

public class CustomListners  extends testBase implements ITestListener{

	public CustomListners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("In cusomterlister onTestFailure");
		failedScreenshots(result.getMethod().getMethodName());
		
	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
