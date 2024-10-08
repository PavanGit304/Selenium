package debuggingcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DebuggingcodeClass {
	
	
	WebDriver d = null;
	@Test
	public void lunchbrow() {	
	try {

    System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver114\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.google.com/");
	WebElement srch = d.findElement(By.name("q")); 
	srch.sendKeys("pawan kalyan photos",Keys.RETURN);//Keys.RETURN/Keys.ENTER  :it press enter
	d.findElement(By.xpath("//*[contains(text(),'330 Pavan kalyan ideas - Pinterest')]")).click();
	}
	
	catch (Exception e){	
		System.out.println(e);}
    }
	
	@Test
	public void closebrow() {
		d.quit();
	}

}
