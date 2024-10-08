package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_withPageFactory {
	
	WebDriver driver;
	
	POM_withPageFactory(WebDriver driver){
		
		this.driver= driver;
	}
	
	@FindBy(xpath="//INPUT[@id='j_username']") 
	WebElement accno;
	
	@FindBy(xpath="//INPUT[@id='j_pin']") 
	WebElement pwd;
	
	
	public void accno(String accountno){
		accno.sendKeys(accountno);	}
	
	public void pwd(String password)
	{
		pwd.sendKeys(password);
	}
	

}
