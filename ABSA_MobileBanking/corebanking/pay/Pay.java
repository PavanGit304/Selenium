package pay;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ButtonList.Buttons;
import Report_Listener.MyListener;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObject.Pay_pageObject;

public class Pay extends MyListener {

	Pay_pageObject pay_obj;

	public void allScenarios() throws IOException, InterruptedException {
		paynewbeneficiary();
		payAnExistingBeneficiary();
		pay_FutureDatedForAnExistingBeneficiary();
		PayAbsaListedBeneficiaryOnceOff();
		PayAbsaListedBeneficiaryNew();
		PayAbsaListedBeneficiaryFutureDated();
		pay_IIPForAnExistingBeneficiary();
		PayonceOffpayment();
	}

	
	

	
	// pay new beneficiary
	@Test(priority = 0, groups = { "pay_new_beneficiary" })
	public void paynewbeneficiary() throws IOException, InterruptedException {
		try {
			pay_obj = new Pay_pageObject(driver);	
			new Buttons().pay_logo().click();
			pay_obj.paynewbeneficiary();
//		    Pay_SomeOne();
//		    payment_Details();
		
		} catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile,new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/payment_Details.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
			}
	}



	@Test(priority = 2, groups = { "payment_Details" })
	public void payment_Details() throws IOException {

		try {

			pay_obj.enterAmount();
			driver.navigate().back(); 
			
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))").click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Notification\").instance(0))");
			new Buttons().Pay().click();
			new Buttons().accept().click();
			new Buttons().Done().click();
			
			test.log(LogStatus.INFO, "Payment Details is Executed Successfully");

		} catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile,new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/payment_Details.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}

	}
	
	
	
	@Test(priority = 1, groups = { "Pay_SomeOne" })
	public void Pay_SomeOne() throws IOException {
		try {

			pay_obj.beneficiaryname();
			driver.navigate().back();
			pay_obj.bank();
			pay_obj.selectbank();
			pay_obj.AccType();
			pay_obj.selectAcc_Type();
			pay_obj.AccNO();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter reference for my statement\").instance(0))");
			Thread.sleep(2000);
			pay_obj.Theirreference();
			pay_obj.Myreference();
			new Buttons().next().click();
			test.log(LogStatus.INFO, "Pay Some One is Executed Successfully");

		} catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile,
					new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/Customer_Details.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
	}
	
	
	
	
	@Test(priority = 3, groups = { "pay_An_Existing_Beneficiary" })
	public void payAnExistingBeneficiary() throws IOException {
		pay_obj = new Pay_pageObject(driver);
		try {

			new Buttons().pay_logo().click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ELSA\").instance(0))").click();
			pay_obj.enterAmount(); 
			driver.navigate().back();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))")
					.click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Notification\").instance(0))").click();

			new Buttons().Pay().click();
			new Buttons().accept().click();
			new Buttons().Done().click();
			test.log(LogStatus.INFO, "pay An Existing Beneficiary is Executed Successfully");
	
		} catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/payAnExistingBeneficiary.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();

		}
	}
	
	
	
	
	@Test(priority = 4, groups = { "pay_Future_Dated_For_An_ExistingBeneficiary" })
	public void pay_FutureDatedForAnExistingBeneficiary() throws InterruptedException, IOException {
		pay_obj = new Pay_pageObject(driver);
		try {

			new Buttons().pay_logo().click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ELSA\").instance(0))").click();
			Thread.sleep(3000);
			FutureDates();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Payment date\").instance(0))");
			Thread.sleep(2000);
			new Buttons().Pay().click();
			new Buttons().accept().click();
			new Buttons().Done().click();

		} catch (Exception ex) {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile,
					new File("E:/Selenium/eclipse/selenium_Workspace/Maven_Selenium/screenshot/FutureDates.jpg"));
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
	}

	//------------------------------------------------------------Pay_AbsaListed_Beneficiary--------------------------------------------------------------------------
	
	@Test (priority = 5, groups = {"Pay_AbsaListedBeneficiary_OnceOff"})
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
	
	@Test (priority = 6,groups = {"Pay_AbsaListed_BeneficiaryNew"})
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
	
	
	@Test (priority = 7,groups = {"Pay_AbsaListedBeneficiary_FutureDated"})
	public void PayAbsaListedBeneficiaryFutureDated() throws IOException {
		pay_obj = new Pay_pageObject(driver);
		try {
			new Buttons().pay_logo().click();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"AAOF SA\").instance(0))").click();
			
			FutureDates();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Payment date\").instance(0))");
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
	
	@Test (priority = 8,groups = {"pay_IIPForAn_ExistingBeneficiary"})
	public void pay_IIPForAnExistingBeneficiary() throws IOException {
		pay_obj = new Pay_pageObject(driver);
		try {
			new Buttons().pay_logo().click();
			
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"FIRSTRAND | 62001859935\").instance(0))").click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "FIRSTRAND");
			pay_obj.enterAmount();
			
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Immediate Interbank Payment\").instance(0))").click();
			test.log(LogStatus.PASS, "Immediate Interbank Payment");
			
			driver.navigate().back();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))");
			new Buttons().next().click();
			new Buttons().next().click();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Notification\").instance(0))");
	
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
	   
	
	public void PayonceOffpayment() {
		
		
	}
	
	//-------------------------------------------------------------Reuse Methods--------------------------------------------------------------------------------
	
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
	
	@Test(groups = { "Future_Dates" })
	public void FutureDates() throws InterruptedException {
		
		pay_obj.enterAmount();
		driver.navigate().back();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))");
		Thread.sleep(2000);
		pay_obj.FutureDatedPayment();
		pay_obj.selectnextmonth();
		pay_obj.selectdate();
		pay_obj.oK();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))").click();
		Thread.sleep(2000);
	}
	
	
	
}
