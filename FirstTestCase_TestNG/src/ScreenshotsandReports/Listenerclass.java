package ScreenshotsandReports;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Listenerclass implements ITestListener {
	

	protected static WebDriver driver;
	protected static ExtentHtmlReporter reports1;
	protected static ExtentReports reports;
	protected static ExtentTest test;
	public static URL url;

	
	
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + " test is started");
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

	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
		test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test sucess within percentage");
	}

	
	public void onStart(ITestContext context) {
		System.out.println("on start");
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver 98\\chromedriver.exe"); 
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.google.com/");
		reports = new ExtentReports("./test-output/src.html"); // . operator it directly refers project workspace
	}
	
	
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
//		driver.close();
		reports.endTest(test);
		reports.flush();
	}
	
	public String capture() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("./FailedTest/" + System.currentTimeMillis() + "failedTest.png");
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
