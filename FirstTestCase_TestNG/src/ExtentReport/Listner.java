package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Listner implements ITestListener{
	
	
	
	WebDriver driver;
	protected static ExtentHtmlReporter reports1;
	
    protected static ExtentReports reports;
	protected static ExtentTest test;
	public static URL url;

	
	
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + "test is started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
		test.log(LogStatus.PASS, test.addScreenCapture(capture()));
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + "  test is passed");
		
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");

		test.log(LogStatus.FAIL, test.addScreenCapture(capture()));
		test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed",
				result.getThrowable().getMessage());// it throws failed message
	}


	public void onStart(ITestContext context) {
		System.out.println("on start");
			    reports = new ExtentReports("./test-output/src.html"); // . operator it directly refers project  src:folder name 
		
	}


	public void onFinish(ITestContext context) {
		System.out.println("on finish");
//		driver.close();
		reports.endTest(test);
		reports.flush();
	}
	
	public String capture() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("./FailedTest/" + System.currentTimeMillis()+"failedTest.png");
		String errfilepath = Dest.getAbsolutePath();
		try {
			FileUtils.copyFile(scrFile, Dest);
			
		} catch (IOException e) {
			e.printStackTrace();
			}
		return errfilepath;

		//test.log(LogStatus.FAIL, ex);
	}
}
