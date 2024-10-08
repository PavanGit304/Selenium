
package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class parallel_test {
	WebDriver d;

	@Test
	public void chromeTest() {
		try {
			  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  
			
			d = new ChromeDriver();
			Reuse();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void firefoxTest() {
		try {
			d = new FirefoxDriver();
			Reuse();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void ieTest() throws InterruptedException {

		try {
			System.setProperty("webdriver.ie.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\IEDriverServer64.exe"); // to
			d = new InternetExplorerDriver();
			Reuse();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

	
	public void Reuse() throws InterruptedException {
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.programiz.com/dsa/binary-search"); //https://eu.absa.co.za/absa-online/login.jsp
//		WebElement acc = d.findElement(By.id("j_username")); // acc no
////		acc.clear();
//		acc.sendKeys("4047922162");
//		WebElement pin = d.findElement(By.id("j_pin")); // pin
////		pin.clear();
//		pin.sendKeys("22162");
//		Thread.sleep(1000);
//		d.findElement(By.className("ui-button-left")).click();
	}
}
