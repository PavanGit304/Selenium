	/* Assertions are 2 types 1. hard assertion and soft assertion  
	 * Selenium Assertions are three types: “assert”, “verify”, and ” waitFor”. 
	 * When an “assert” fails, the test is aborted/terminate. 
	 * When a “verify” fails, the test will continue execution, logging the failure.
	 *  A “waitFor” command waits for some condition to become true. */

package TestNG;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assertion {
		
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver ;

  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.out.println("launching firefox browser"); 
	     // System.setProperty("webdriver.firefox.marionette", driverPath);
	      driver = new FirefoxDriver();
	      driver.get(baseUrl);
	      Thread.sleep(2000);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle); //assert is fail, test is blocked/aborted 
//assertEquals()  it compares 	expected and actual values 
	      driver.close();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


  }
}
