package browser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FireFoxBrower {

public static void main(String[] arg){
	
		//System.setProperty("webdriver.ie.driver","E:\\Selenium\\selenium_softwares\\Drivers\\IEDriverServer\\IEDriverServer64.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		
		WebDriver d=  new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		
//		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement srch = d.findElement(By.xpath("//INPUT[@class='lst']"));
//		srch.sendKeys("pawan kalyan photos",Keys.RETURN);
//		//d.findElement(By.xpath("(//INPUT[@class='gNO89b'])[2]")).click();//INPUT[@class='gLFyf gsfi']
//		System.out.print("hello");
	
}
}
