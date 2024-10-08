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

public class PageObject_AVAF extends MyListener {
	
	public WebDriverWait wait;
	public AppiumDriver<MobileElement> driver;

	public PageObject_AVAF(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		wait = new WebDriverWait(driver, 70);
	}
	
	@AndroidFindBy(xpath = "//*[contains(@text,'7468 4616')]")  
	private AndroidElement avafHub;
	@AndroidFindBy(xpath = "//*[contains(@text,'Transactions')]")  
	private AndroidElement transaction;
	
	@AndroidFindBy(id = "com.barclays.absa.banking.uat:id/calenderImageView")  
	private AndroidElement calender;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Month-to-date')]")  
	private AndroidElement selectDate;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Done')]")  
	private AndroidElement Done;
	
	
	
	@Test 
	public void avafHub() 
	{
		wait.until(ExpectedConditions.visibilityOf(avafHub)).click();
//        Assert.assertEquals(number6.getText(), "6", "Enter the valid passcode" + "<br>"); 
		test.log(LogStatus.PASS, "avafHub");
	}
	
	@Test
	public void transaction()
	{
		wait.until(ExpectedConditions.visibilityOf(transaction)).click();
		test.log(LogStatus.PASS, "transaction");
	}
	
	@Test 
	public void calender() 
	{
		wait.until(ExpectedConditions.visibilityOf(calender)).click();
		test.log(LogStatus.PASS, "calender");
	}
	
	@Test
	public void selectDate()
	{
		wait.until(ExpectedConditions.visibilityOf(selectDate)).click(); 
		test.log(LogStatus.PASS, "selectDate");
	}
	
	@Test 
	public void Done()
	{
		wait.until(ExpectedConditions.visibilityOf(Done)).click();
		test.log(LogStatus.PASS, "Done");
	}
	
	

}
