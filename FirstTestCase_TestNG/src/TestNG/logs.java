package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class logs {
	   @Test
	    public void testReport() throws InterruptedException{ 
		   System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		   Reporter.log("Browser Opened" ,true);  // true :it shows console output 
		   WebDriver driver = new ChromeDriver(); 
	        
		   Reporter.log("Browser Maximized",true);
	        driver.manage().window().maximize();
	       Reporter.log("Application start",true);
	        driver.get("https://www.google.com/");
	        Thread.sleep(1000);
	       Reporter.log("Application close",true);
	        driver.close();

	    }
}
