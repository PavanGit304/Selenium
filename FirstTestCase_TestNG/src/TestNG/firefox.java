package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firefox {

	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.google.com/");

		Thread.sleep(5000);
		System.out.println("Test");

	}

	@BeforeTest
	public void beforetest() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Selenium\\selenium_softwares\\GeckoDriver\\v0.30.0\\geckodriver.exe");
		driver = new FirefoxDriver(); // E:\Selenium\selenium_softwares\GeckoDriver\v0.30.0
		System.out.println("before Test");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("after Test");
		driver.quit();
		
	}
}
