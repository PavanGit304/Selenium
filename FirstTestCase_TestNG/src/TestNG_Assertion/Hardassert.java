package TestNG_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Hardassert { // if one validation is fail then it terminates the execution 
  @Test
  public void f() {
	  
	  String actual = "pavan";
	  String expected ="Tumuku";  
	  Assert.assertEquals(actual, expected,"enter the valid value"); // actual value get from app  expected value get from test case this is hard assert 
  }
  
//  
//  @Test
//  public void ex2() 
//  {
//	  String name = "pavan";
//	  Assert.assertTrue(name.contains("pavan"),"name is not matching");  // if string contains pavan then it passes or it fails and throws the message 
//  }
  
   

@Test
  public void ex3() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3DOGB%26tab%3Drk%26utm_medium%3Dact%26pli%3D1&csig=AF-SEnZOyVueqpW7y_o5%3A1589351334&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//*[contains(@id,'identifierId')] ")).sendKeys("pavanbosa304@gmail.com");
		WebElement btn =driver.findElement(By.xpath("//*[contains(@id,'Next')]"));
		btn.click(); //password
		 }
}
