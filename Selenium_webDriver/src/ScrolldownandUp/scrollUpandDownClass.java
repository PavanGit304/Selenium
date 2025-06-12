package ScrolldownandUp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrollUpandDown {
	
	public static  WebDriver driver;
	

	public static void Main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver 98\\chromedriver.exe");
		 
		 	driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");//To open URL "http://softwaretestingmaterial.com"
		Thread.sleep(2000);
		

		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
	}

}
