package With_pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class withPOM {

	
WebDriver driver;
	
	public withPOM(WebDriver driver){
		this.driver= driver;   // this : it referees current class variables  	
	}
	
	@FindBy(xpath = "//*[contains(@id,'identifierId')]") // it is used to locate and declare the web elements 
	 WebElement username ;
	
	@FindBy(xpath= "//*[contains(@id,'Next')]")
	WebElement next;
	
	public void enter_username(String uname){
		username.sendKeys(uname);
	}
}
