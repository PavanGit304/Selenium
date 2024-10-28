package pageObject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePOMpage {

	
	public AppiumDriver<MobileElement> driver;
	   
    public BasePOMpage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
        
	
}
}

// for any perticual field conditions are devided into equal parts and we input random values and check wheather you getting desired out  
 