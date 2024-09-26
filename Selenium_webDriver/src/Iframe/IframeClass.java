package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeClass {
	public static void main(String[]args){
//		WebDriver d= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://timesofindia.indiatimes.com/");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frms= d.findElement(By.xpath(".//*[@id='adsdivLyr']"));
		// it is frame xpath
		System.out.println(frms.getSize());// getSize():it prints frame size
	}
}
