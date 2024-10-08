package ExtentReport_Highlevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class POM extends ExtentReport_Highlevel_Lsitener {
	
WebDriver driver;


public POM(WebDriver driver) 
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
 
}


// xpath : //*[contains(@id,'identifierId')]

    @FindBy(xpath ="//*[contains(@name,'firstname')]")
	//@FindBy(name="firstname")
	WebElement fname;
	
	 @FindBy(xpath="//*[contains(@name,'lastname')]")
	//@FindBy(name="lastname")
	WebElement Lname;
	
	
	public void Enter_FirstName() {	
	fname.sendKeys("Pavan");
	//Assert.assertEquals(fname.getText(),"firstname" );
	test.log(LogStatus.PASS, "FirstName"); 
	}
	
	public void Enter_LastName() {
		Lname.sendKeys("Reddy");
		test.log(LogStatus.PASS, "LastName");
	}
}
