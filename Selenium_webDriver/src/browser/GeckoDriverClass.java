package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*What is GeckoDriver?
 * it is a link between Selenium tests and the Firefox browser. 
 * GeckoDriver is a proxy which helps to communicate with the Gecko-based browsers (e.g. Firefox)
 
 * WHY Gecko Driver?Hence we cannot use Selenium2 with the latest versions of Firefox. So we need Selenium3.
 * Selenium3 can directly interact with the Firefox browser using a proxy,which is nothing but the GeckoDriver.
 * */

public class GeckoDriverClass {
	public static void main(String[]args) throws InterruptedException 
	{
//		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\selenium_softwares\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
//		driver.close();
	}
}
