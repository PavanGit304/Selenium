package screenshot_failureTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver100\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	public void ScreenshotCapture() throws IOException{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("E:\\Selenium\\eclipse\\selenium_Workspace\\FirstTestCase_TestNG\\Screenshots"));	
	}

	public void onTestSucess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
