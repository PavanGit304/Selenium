package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender1 {
	public static void main(String[] args)throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
	    driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")).click();
		Thread.sleep(2000);
		driver.close();
		}
}


