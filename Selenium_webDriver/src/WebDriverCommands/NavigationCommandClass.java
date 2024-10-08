package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommandClass {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
			WebDriver driver= new ChromeDriver();

		// Open ToolsQA web site
		String appUrl = "https://www.lightinthebox.com/index.php?main_page=index";
		driver.navigate().to(appUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='cartText']")).click();
		Thread.sleep(2000);
		// Go back to Home Page
		driver.navigate().back();

		Thread.sleep(2000);
		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to(appUrl);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();
	}

}
