package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Locaters.locator_partial_linkText;

public class locator_partial_linkText {
	static WebDriver driver;
    public static void main(String[] args) {													
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver108\\chromedriver.exe");					
         driver = new ChromeDriver();						
    }
    
    public void linktext() {
    	 driver.get("http://demo.guru99.com/test/accessing-link.html");		
         driver.findElement(By.partialLinkText("go here")).click();// go here is full link 			
         System.out.println("Title of page is: " + driver.getTitle());							
         driver.quit();		
    }
    public void partial_linktext() {
    	 driver.get("http://demo.guru99.com/test/accessing-link.html");		
         driver.findElement(By.partialLinkText("here")).click();  // here is partical link 					
         System.out.println("Title of page is: " + driver.getTitle());							
         driver.quit();	
         WebElement number6 = driver.findElement(By.id(""));
    	
    }
}
