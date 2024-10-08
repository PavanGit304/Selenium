package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class user_interface {
	WebDriver d;
	
	@BeforeMethod
	public void m1()
	{
		d=new FirefoxDriver();
	
		
	}
	
  @Test
  public void f() {
	  d.navigate().to(" https://www.euromonitor.com");
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  d.findElement(By.className("emi-button-rounded")).click();
	  
  }
}
