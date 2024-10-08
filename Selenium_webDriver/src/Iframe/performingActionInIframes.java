package Iframe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class performingActionInIframes {
	public static void main(String[]args){
//		WebDriver d= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver driver= new ChromeDriver();
//		driver.navigate().to("https://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebElement ifr= d.findElement(By.xpath("//*[@id=\"header-masthead\"]/div/a/img"));
		
//		ifr.click();
//		d.switchTo().frame(ifr);
//		d.findElement(By.id("name")).sendKeys("8");
		
		driver.get("https://demoqa.com/frames");

		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

}
}

//*[@id="google_ads_iframe_/21849154601,22343295815/Ad.Plus-970x250-1_0"]

