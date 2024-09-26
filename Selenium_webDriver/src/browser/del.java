package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class del {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver108\\chromedriver.exe");	
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		WebElement srch= d.findElement(By.name("q"));// findElement: it is used to find the element in current web page 
		srch.sendKeys("pawan kalyan",Keys.RETURN);//Keys.RETURN : it click on enter 
		d.close();
	 
	}	
}
