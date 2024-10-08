package drang_drop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import grid.newGrid;

public class mouseHoverClass {
	 public static WebDriver driver;
	 
	 public static void main(String[] args) throws InterruptedException {
		 
			//Set system properties for geckodriver This is required since Selenium 3.0
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");

		    driver = new ChromeDriver();
			driver.get("https://demoqa.com/menu/");
			System.out.println("demoqa webpage Displayed");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			MainItem();        
		        //Instantiate Action Class        
		    Actions actions = new Actions(driver);
		        //Retrieve WebElement 'Music' to perform mouse hover 
		    WebElement mainitem2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		    actions.moveToElement(mainitem2).perform();
		    System.out.println("Done Mouse hover on 'Music' from Menu");
		    WebElement subSUBList = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a")); 
		    actions.moveToElement(subSUBList).perform();
		    System.out.println("Done Mouse hover on 'Rock' from Menu");
		 	  
		    WebElement Subsubitem1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
		    Subsubitem1.click();
		    System.out.println("Selected 'Alternative' from Menu");

		    driver.close();
		 }
	 
	 static void MainItem() throws InterruptedException {
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
			Thread.sleep(8000);
//			driver.close();
		}  
}//*[@id="nav"]/li[2]/a
