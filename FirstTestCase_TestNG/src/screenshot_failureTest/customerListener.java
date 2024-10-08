package screenshot_failureTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class customerListener extends Base implements ITestListener {
	
	public void onTestStart(ITestResult result) {}
	public void onTestSucess(ITestResult result) {}
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Failed Test");
        
		failed();    // fn+f3 : it open the method  or right click on method -->open delcaration 
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {}
}
