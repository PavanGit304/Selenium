package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandClass {
public static void main(String[] args) {
		
	String driverExecutablePath = "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverExecutablePath);

	WebDriver driver = new ChromeDriver();
	String url = "https://www.lightinthebox.com/index.php?main_page=index";
	driver.get(url);
	String title = driver.getTitle();//it fetches the Title of the current page
	int titleLength = driver.getTitle().length();
	
	// Printing Title & Title length in the Console window
	System.out.println("Title of the page is : " + title);
	System.out.println("Length of the title is : " + titleLength);

	String actualUrl = driver.getCurrentUrl();//it fetches the Current URL which is opened in the browser. 

	if (actualUrl.equals(url)) {
		System.out.println("Verification Successful - The correct Url is opened.");
	} else {
		System.out.println("Verification Failed - An incorrect Url is opened.");

// In case of Fail, you like to print the actual and expected URL for the record purpose
		System.out.println("Actual URL is : " + actualUrl);
		System.out.println("Expected URL is : " + url);
	}

	// Storing Page Source in String variable
	String pageSource = driver.getPageSource();//it returns the Source Code of the page

	// Storing Page Source length in Int variable
	int pageSourceLength = pageSource.length();
	System.out.println("Total length of the Pgae Source is : " + pageSourceLength);
	driver.close();
}

}
