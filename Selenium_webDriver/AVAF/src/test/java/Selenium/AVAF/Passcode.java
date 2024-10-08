package Selenium.AVAF;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjectModel.PageObject_passcode;
import Report_Listener.MyListener;



public class Passcode extends MyListener{
	
	PageObject_passcode obj;
	@Test(groups = { "passcode" })
	
	public void passCode() throws IOException {
		obj = new PageObject_passcode(driver);
		try {
			                                                                                                                                                                                // or new Pay_pageObject(driver).number6();
			obj.number6();
			obj.number1();
			obj.number9();
			obj.number9();
			obj.number3();

		} catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile,new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/password.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
			test.log(LogStatus.FAIL, ex);
		}

	}

}
