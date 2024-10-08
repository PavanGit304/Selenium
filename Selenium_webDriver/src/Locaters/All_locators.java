package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class All_locators {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 String exePath = "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
//		 driver.get("https://demoqa.com/automation-practice-form");//		 driver.manage().window().maximize();
//		 Thread.sleep(2000);
//		 scrolltoElement("//*[@id=\"firstName\"]");
//		 Thread.sleep(1000);
//		 driver.findElement(By.id("firstName")).sendKeys("Testing");//Locate by ID Attribute
//		 driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Testing12@gmail.com");//Locate by Name attribute
//		 driver.findElement(By.className("mr-sm-2 form-control"));//Locate by className attribute
		 
		 
		 
		 /**
		  *  Locate by linkText and ParticalLinkText attribute
		  *  URL - https://demoqa.com/links
		  */
		 
			driver.get("https://demoqa.com/links");
			// linkText
			scrolltoElement("//*[@id=\"bad-request\"]");
//		 driver.findElement(By.linkText("Home")).click();
			WebElement bedRequestLink = driver.findElement(By.xpath("//a[contains(@id,'bad-request')]"));
			bedRequestLink.click();

		 // //<HTML tag>[contains(@attribute_name,'attribute_value')]
		 //partialLinkText
//		 Thread.sleep(1000);
//		 driver.findElement(By.partialLinkText("Ho")).click();
		 

//		   Locate by tagName attribute
		  
//		 driver.get("https://demoqa.com/links");
//		 List <WebElement> list = driver.findElements(By.tagName("a"));
		
//		 
//		
////		   Locate by cssSelector attribute
//		 driver.get("https://demoqa.com/text-box");
//		 driver.findElement(By.cssSelector("input[id= ‘userName’]"));
//		  
////		   Locate by xpath attribute
//		 
//		 driver.get("https://demoqa.com/text-box");
//		 driver.findElement(By.xpath("//input[@id='userName']"));
		 
	}





		public  static String scrolltoElement(String name) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath(name));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
		Thread.sleep(8000);
		return name;
		}
		

}
