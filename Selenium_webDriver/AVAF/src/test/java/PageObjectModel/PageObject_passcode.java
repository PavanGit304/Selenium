package PageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import Report_Listener.MyListener;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObject_passcode extends MyListener {

	public WebDriverWait wait;
	public AppiumDriver<MobileElement> driver;

	public PageObject_passcode(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		wait = new WebDriverWait(driver, 70);
	}
	

	// passcode
	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/button6_text_view")  
	private AndroidElement number6;

	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/button1_text_view")
	private AndroidElement number1;

	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/button9_text_view")
	private AndroidElement number9;

	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/button3_text_view")
	private AndroidElement number3;
	

	
	// passcode
		@Test
		public void number6() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(number6)).click();
	        Assert.assertEquals(number6.getText(), "6", "Enter the valid passcode" + "<br>"); 
			test.log(LogStatus.PASS, "6"); 
		}
		
		public void number1() throws InterruptedException {
			Assert.assertEquals(number1.getText(), "1", "Enter the valid passcode" + "<br>"); 
			wait.until(ExpectedConditions.visibilityOf(number1)).click();
			test.log(LogStatus.PASS, "1");
		}

		public void number9() throws InterruptedException {
			Assert.assertEquals(number9.getText(), "9", "Enter the valid passcode" + "<br>");
			wait.until(ExpectedConditions.visibilityOf(number9)).click();
			test.log(LogStatus.PASS, "9");
		}

		public void number3() throws InterruptedException {
			Assert.assertEquals(number3.getText(), "3", "Enter the valid passcode" + "<br>");    
			wait.until(ExpectedConditions.visibilityOf(number3)).click();
	        test.log(LogStatus.PASS, "3");
		}

}
