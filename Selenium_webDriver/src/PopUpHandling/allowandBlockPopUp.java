package PopUpHandling;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class allowandBlockPopUp {

	public static void main(String[] args) throws InterruptedException {  
	      
		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		/*Create an instance of ChromeOptions : It helps you perform various operations like opening 
		chrome in maximized mode, disable existing extensions, disable pop-ups, etc*/
		ChromeOptions options = new ChromeOptions();

		// by using set ExperimentalOption we can handle pop up using (prefs obj) 
		options.setExperimentalOption("prefs", prefs);
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe"); 
		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options); //note:To enable pop-up remove the options & run  
     driver.navigate().to("https://www.spicejet.com/");  
}
}
