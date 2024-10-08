package testNG_InterviewQuestiosn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class flakyTest {
	
	@Test
	public void testPageLoad_withFlaky() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver128\\chromedriver-win64\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gw.lightinthebox.com/index.php");
		// This may fail intermittently if the page takes too long to load
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id=\"mainNav\"]/div/div[2]/div[1]/div/a[5]")));
		element.click();
		Assert.assertTrue(element.isDisplayed());
		driver.quit();
	}	
	
//Flaky Test (Without Proper Waits)This test is flaky because it tries to click the login button immediately after loading the page, without accounting for network delays or page load times.	
	
	@Test
	public void testPageLoad_withOutFlaky(){
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver128\\chromedriver-win64\\chromedriver.exe");  
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://gw.lightinthebox.com/index.php");
//		// This may fail intermittently if the page takes too long to load
//		WebElement element = driver.findElement(By.id("//*[@id=\"mainNav\"]/div/div[2]/div[1]/div/a[5]"));
//		element.click();
//		Assert.assertTrue(element.isDisplayed());
//		driver.quit();	
	}
}
