package Typesofwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {/*it tells the webdriver to wait certain condition before throws an exception */

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
					"E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, 50);
			driver.get("https://www.lightinthebox.com/index.php?main_page=index");
			WebElement myFavorites = driver.findElement(By.xpath("//*[@id=\"uni-header\"]/div[2]/div/a/span"));
			wait.until(ExpectedConditions.elementToBeClickable(myFavorites)).click();
//			WebElement Enter_emailAddress = driver.findElement(By.xpath("//input[@id='registerEmail']"));
//			wait.until(ExpectedConditions.visibilityOf(Enter_emailAddress)).sendKeys("Testing@gmail.com");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='registerEmail']")))).sendKeys("Testing@gmail.com"); 
  	   
    }
}







//driver.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
//WebElement bike =driver.findElement(By.id("c0"));
//wait.until(ExpectedConditions.visibilityOf(bike)).click(); // we can use in a 2 ways 1 directly webelememnt 2 with webelement nam
//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("c0")))).click();
//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("c1")))).click();    
