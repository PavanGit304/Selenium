package ButtonList;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Report_Listener.MyListener;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObject.Pay_pageObject;

public class Buttons extends MyListener {

	public WebDriverWait wait;
	public WebElement paylogo;
	public WebElement Next;
	public WebElement Accept;
	public WebElement Done;

	public Buttons() {
		wait = new WebDriverWait(driver, 100);
	}
	
	

	// navigate
	public WebElement navigateBack() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton")));
	}

	
	// logos
	public WebElement pay_logo() throws InterruptedException, IOException {
		paylogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Pay')]")));
		Assert.assertEquals(paylogo.getText(), "Pay","check Pay button in Buttons Class" + "<br>");
		test.log(LogStatus.PASS, "Pay");
		return paylogo ;
	}
		
		
		

	//List of Buttons
	public WebElement next() {
		Next = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Next')]")));
		Assert.assertEquals(Next.getText(), "Next",   "check Next button in Buttons Class" + "<br>"); 
		test.log(LogStatus.PASS, "Next");
		return Next; 
	}
	
	public WebElement Pay() {
		Assert.assertEquals(driver.findElement(By.xpath("//*[contains(@text,'Pay')]")).getText(), "Confirm Payment",   "check Pay button in Buttons Class" + "<br>"); 
		test.log(LogStatus.PASS, "Pay");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Pay\"]")));// xpath : //android.widget.Button[@content-desc=\"Pay\"]
	}
	
	public WebElement accept() {
		Accept =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Accept')]")));
		Assert.assertEquals(Accept.getText(), "Accept",   "check Accept button in Buttons Class" + "<br>");
		test.log(LogStatus.PASS, "Accept");
		return Accept; 
	}
	
	public WebElement Done() {
		Done =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Done')]")));
		Assert.assertEquals(Done.getText(), "Done",   "check Done button in Buttons Class" + "<br>");
		test.log(LogStatus.PASS, "Done");
		return Done; 
	}

}
