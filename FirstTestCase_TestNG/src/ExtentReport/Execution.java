package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Execution extends Listner {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver108\\chromedriver.exe"); 
		driver = new ChromeDriver(); // Set the drivers path in environment variables to avoid

	  driver.get("https://www.google.com/");
		WebElement srch = driver.findElement(By.name("q"));
		//test.log(LogStatus.PASS, "srch"); 
		srch .sendKeys("pawan kalyan photos",Keys.RETURN);//Keys.RETURN/Keys.ENTER  :it press enter
		driver.findElement(By.xpath("//*[contains(text(),'330 Best pavan kalyan ideas - Pinterest')]")).click();
		driver.close();
		
		test.log(LogStatus.INFO, "passed 1");

  }
}
