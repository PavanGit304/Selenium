package Typesofwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;

public class implicitwait {/* it tells the webdriver to wait certain amount of time before through an exception
	(it means if the element is not located on web page within the time(10sec) then it will throws an exception)*/
	
	static WebDriver driver;
    public static void main(String[] args) {													
   	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
     WebDriver driver = new ChromeDriver();  
     driver.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//     driver.manage().timeouts().implicitlyWait(Duration.);
	 driver.findElement(By.id("c0")).click();
	 driver.findElement(By.id("c1")).click();    
//	 driver.quit();
	 }
}
