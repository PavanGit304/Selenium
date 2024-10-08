package performance_Test;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {
	//performance Testing : checking the time taken to perform any process like delete, save, click buttons 
	public static void main(String[]args) throws InterruptedException{
		StopWatch pageLoad =new StopWatch();  //StopWatch it measure the time taken for an activity of interest
		    pageLoad.start(); //starting time 
			
		    Long starttime = System.currentTimeMillis();
		    System.out.println("start time :"+ starttime);
		    
		    WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement search = driver.findElement(By.name("q")); // search bar name 
			search.sendKeys("images"+ Keys.RETURN); // Keys.RETURN: it click on enter 
			pageLoad.stop();                 //ending time 
			Long endTime = System.currentTimeMillis();
			Long diff = starttime-endTime;
			System.out.println("end Time :"+endTime+ "\n"+"start -end time :"+diff );
			System.out.println("Total page Load Time:"+pageLoad.getTime()+"milli-seconds");
			driver.close();
			
		}
}
//
