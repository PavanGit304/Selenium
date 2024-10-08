package MyConfig;

import org.openqa.selenium.WebDriver;

public class Baseclass {
	public static WebDriver driver;
	public  Baseclass(WebDriver driver){
		Baseclass.driver = driver;
	}
}
