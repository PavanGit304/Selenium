package screenshot_failureTest;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



//ITestResult : it is an interface which keep all information about the test case which we execute  it capture some information like TestCase execution status TestCase name 
public class failureTestScreenshot {
	
	WebDriver driver;
	  

  
  @Test
  public void m1() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\latest Drivers\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
	  driver= new ChromeDriver(); 
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//INPUT[@class='gLFyf gsf']")).sendKeys("pawan kalyan images",Keys.ENTER);
	  
			
	     
	  
  }
  
  
  @AfterTest //AfterMethod annotation - This method executes after every test execution
  public void screenShot(ITestResult result){
//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
try{
if(ITestResult.FAILURE==result.getStatus()){
Utility.m1();
	
}


}
catch(Exception ex) 
{
	System.out.println(ex);
}


}

/*public void screenShot(ITestResult result){
//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
if(ITestResult.FAILURE==result.getStatus()){
try{
// To create reference of TakesScreenshot
TakesScreenshot screenshot=(TakesScreenshot)driver;
// Call method to capture screenshot
File src=screenshot.getScreenshotAs(OutputType.FILE);
// Copy files to specific location 
// result.getName() will return name of test case so that screenshot name will be same as test case name
FileUtils.copyFile(src, new File(result.getName()+"E:\\Selenium\\eclipse\\selenium_Workspace\\FirstTestCase_TestNG\\src\\screenshot_failureTest\\img.jpg"));
System.out.println("Successfully captured a screenshot");
}catch (Exception e){
System.out.println("Exception while taking screenshot "+e.getMessage());
} 
}
driver.quit();
}*/
