package pay;

import java.io.File;
import java.io.IOException;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import ButtonList.Buttons;
import Report_Listener.MyListener;
import pageObject.Pay_pageObject;

public class Pay1 extends MyListener {
	
	Pay_pageObject pay_obj;
	public void allScenarios() throws IOException 
	{
		PayAbsaListedBeneficiaryOnceOff();
		PayAbsaListedBeneficiaryNew();
//		PayAbsaListedBeneficiaryFutureDated();	
	}
	
	
	@Test 
	public void AbsaListed() throws IOException {
		pay_obj = new Pay_pageObject(driver);
		try {
			pay_obj.payABill();
			pay_obj.institution();
			pay_obj.AAOFSA();
			pay_obj.AccountHolderName();
			pay_obj.BillAccountNumber();
			pay_obj.Myreference();
			new Buttons().next().click();
			
		}catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/PayAbsaListedBeneficiaryOnceOff.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
	}
	

	@Test (priority = 0, groups = {"Pay_AbsaListedBeneficiary_OnceOff"})
	public void PayAbsaListedBeneficiaryOnceOff() throws IOException
	{
		pay_obj = new Pay_pageObject(driver);
		try {
			new Buttons().pay_logo().click();
			pay_obj.onceOffPayment();
			
			AbsaListed();
			pay_obj.SelectAccountToPayfrom();
			pay_obj.select_CurrentAcc();
			pay_obj.amount();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))").click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Payment type\").instance(0))");
			Thread.sleep(2000);
			new Buttons().Pay().click();
			new Buttons().accept().click();
			new Buttons().Done().click();

		}
		catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/PayAbsaListedBeneficiaryOnceOff.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
	}


	
	
	@Test (priority = 1,groups = {"Pay_AbsaListed_BeneficiaryNew"})
	public void PayAbsaListedBeneficiaryNew() throws IOException {
		pay_obj = new Pay_pageObject(driver);
		try {
			new Buttons().pay_logo().click();
			pay_obj.paynewbeneficiary();
			AbsaListed();
			pay_obj.home();
		
		}catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/PayAbsaListedBeneficiaryOnceOff.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}	
	}
	

	
	public void PayAbsaListedBeneficiaryFutureDated() throws IOException {
		pay_obj = new Pay_pageObject(driver);
		try {
			new Buttons().Pay().click();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"AAOF SA\").instance(0))").click();
			
			
			
			
		}
		catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/PayAbsaListedBeneficiaryOnceOff.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
	}

}
