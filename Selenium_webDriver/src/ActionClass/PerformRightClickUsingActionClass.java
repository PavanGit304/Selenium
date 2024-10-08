package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClickUsingActionClass {
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
			driver= new ChromeDriver();
			driver.manage().window().maximize();

		   // Launch the URL 
		   driver.get("https://demoqa.com/buttons");
		   System.out.println("demoqa webpage displayed");
		   rightClickBtn();
	 
		   //Instantiate Action Class
		   Actions actions = new Actions(driver);
			 
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
			 
		   //Right Click the button
		   actions.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");
		   driver.close();
		   
		  }
	 
	 
	 
		static void rightClickBtn() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("doubleClickBtn"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
		Thread.sleep(8000);
//		driver.close();
	}

}
