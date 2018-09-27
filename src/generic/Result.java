package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Result implements ITestListener,IAutoConstant
{
    static int passCount=0,failCount=0;
	public void onFinish(ITestContext arg0) 
	{
		Utility.writeResult(SUMMARY_PATH,"sheet1",passCount,failCount);	
	}
	public void onStart(ITestContext arg0) 
	{
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
	
	}
	public void onTestFailure(ITestResult arg0) 
	{
		failCount++;
	}
	public void onTestSkipped(ITestResult arg0) 
	{
		
	}
	public void onTestStart(ITestResult arg0) 
	{
		
	}
	public void onTestSuccess(ITestResult arg0) 
	{
		passCount++;	
	}
	
}

