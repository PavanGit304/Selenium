package With_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class withPOM1  {
	public WebDriver driver;
	
	public withPOM1(WebDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);     
}
	
	@FindBy(xpath = "//*[contains(@name,'firstname')]")
	 WebElement fname ;
	
	@FindBy(xpath= "//*[contains(@name,'lastname')]")
	WebElement Lname;
	
	
	public void Enter_FirstName() {	
	fname.sendKeys("Pavan");
	System.out.println("1st name attribute :"+fname.getAttribute("name"));
	Assert.assertEquals(fname.getAttribute("name"), "firstname");
	//test.log(LogStatus.PASS, "FirstName"); 
	}
	
	public void Enter_LastName() 
	{
		Lname.sendKeys("Reddy");
		System.out.println("1st name attribute :"+Lname.getAttribute("name"));
		Assert.assertEquals(Lname.getAttribute("name"), "lastname");
		//test.log(LogStatus.PASS, "LastName");
	}

}
