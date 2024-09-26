package interviewQuestionsExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import grid.newGrid;

public class HandlingDynamicWebElements {
	
	@Test
	public void openBrow() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webDriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver118\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://m.facebook.com/?wtsid=rdr_0PtsHpKfsMWCXSRvw");
		
	}
	

}
