package ScrolldownandUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollclass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");// To open URL																							// "http://softwaretestingmaterial.com"
		Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);

		scrollclass obj = new scrollclass();

//		obj.scrolldown();
//	    obj.scrolltoElement();
      obj.scrollTillEnd();

	}
	

	public void scrolldown() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); // This will scroll down the page by 1000 pixel vertical4
		Thread.sleep(8000);
		driver.close(); 
	}

	public void scrolltoElement() throws InterruptedException {
		WebElement ele = driver.findElement(By.name("uploadfile"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
		Thread.sleep(8000);
		driver.close();
	}

	public void scrollTillEnd() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");// This will scroll the web page till end.
		Thread.sleep(8000);
		driver.close();
	}
}
