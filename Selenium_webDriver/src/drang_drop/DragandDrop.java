package drang_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[]args) {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();  
			driver.manage().window().maximize();
	        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
	               
	        //Creating object of Actions class to build composite actions  
	            Actions act = new Actions(driver);  
	            WebElement sourceLocator = driver.findElement(By.xpath("//*[@id='sourceImage']/img "));  //Element which needs to drag
	            WebElement targetLocator = driver.findElement(By.xpath("//*[@id='targetDiv']/div "));   //Element on which need to drop. 
	            act.dragAndDrop(sourceLocator,targetLocator).build().perform();  //Performing the drag and drop action 
		}
		
		catch(Exception ex) {
			System.out.println(ex);
		}
	    }  
	}

