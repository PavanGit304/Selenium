package ScreenshotsandReports;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Executionclass extends Listenerclass { 
	   
	  @Test (groups= {"loginpage"})
		
		public void execu() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");   
	WebElement srch = driver.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']"));
     //	test.log(null, srch.getText(), "srch text");
	//  Assert.assertEquals(srch.getText(), "Pay","check Pay button in Buttons Class" + "<br>");
	
	test.log(LogStatus.PASS, "srch"); 
	srch .sendKeys("pawan kalyan photos",Keys.RETURN);//Keys.RETURN/Keys.ENTER  :it press enter
	driver.findElement(By.xpath("//*[contains(text(),'330 Pavan kalyan ideas - Pinterest')]")).click();
	test.log(LogStatus.INFO, "passed 1");
	  //d.close();
//reports = new ExtentReports("./test-output/ScreenshotsandReports.html");
	}

	  
  
}  
