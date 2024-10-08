package TestNG_Assertion;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class HardAssert1 {
	WebDriver driver;
	WebElement btn ;
	String expected ="Next";
		
  @Test
  public void assertequal() {
        reuse();// method calling
//		btn =driver.findElement(By.xpath("//*[contains(@id,'Next')]"));
		String actualvalue = btn.getText();
        Assert.assertEquals(actualvalue,expected,"enter the valid value "); //it compares the expected result with that of the actual result
	    System.out.println("Test passed   "+" actualtext: "+actualvalue);
		btn.click(); 
  } 
  
//@Test
//public void ElementisDispalyed(){
//	  reuse();
//	  Assert.assertTrue(btn.isDisplayed(),"enter the valid value"); //it checks whether the element is displayed or not 
//	  System.out.println("Test passed"+"\n"+"Element is displayed on the web page");
//	  btn.click(); 
//}

//@Test
//public void webElementText() {
//	    reuse();
//		assertTrue(driver.getPageSource().contains("Next"),"is present "); //it checks whether the element(text) is present on web page
//		System.out.println("Test passed"+"\n"+"Element Text is present on the web page");
//		  btn.click(); 
//}
//
//@Test
//public void assertNotNull() {
//	  reuse();
//	  Assert.assertNotNull(btn);
//	  System.out.println("Test passed"+"\n"+"it contains value");
//	  btn.click(); 
//}
  
  public void reuse() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
	    driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//*[contains(@id,'identifierId')] ")).sendKeys("pavanbosa304@gmail.com");
		btn =driver.findElement(By.xpath("//*[contains(@id,'Next')]"));
  }
  	
}
