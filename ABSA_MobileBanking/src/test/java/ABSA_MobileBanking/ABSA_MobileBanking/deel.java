package ABSA_MobileBanking.ABSA_MobileBanking;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class deel {
	
	
	public static void main(String[]args) 
	{
		
		System.out.println("baba");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		
		WebDriver d= new ChromeDriver();
	d.manage().window().maximize(); 
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	d.get("https://www.google.com/");
	WebElement srch = d.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']"));
	srch .sendKeys("images",Keys.RETURN);
	
	
	}
	
	public int  m1() 
	{
		return 10;
		
		
	}
	
	

}
