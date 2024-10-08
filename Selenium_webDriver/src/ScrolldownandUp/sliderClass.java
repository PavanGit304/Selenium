package ScrolldownandUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderClass {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider/");
		System.out.println("demoqa webpage Displayed"); 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//		scrolltoSlider();
		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElemnt 'slider' to perform mouse hover
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		actions.dragAndDropBy(slider, 50, 0).build().perform();
		slider.click();
		System.out.println("Moved slider in horizontal directions");

		// Close the main window
//		driver.close();
	}
	
	
	public static void scrolltoSlider() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
		Thread.sleep(8000);
		driver.close();
	}
	 
}
