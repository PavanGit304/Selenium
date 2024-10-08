package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Baseclass {
	
	public WebDriver driver;
	
	Baseclass(WebDriver driver)
	{
		this.driver=driver;
		
		
		
	}
	
	
//	   public BasePOMpage(AppiumDriver<MobileElement> driver) {
//	        this.driver = driver;
//	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	

}
