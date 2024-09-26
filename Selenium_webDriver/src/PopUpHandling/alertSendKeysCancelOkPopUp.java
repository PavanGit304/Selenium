package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertSendKeysCancelOkPopUp {
	
	static WebDriver driver;
	public static void main(String []args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    
	  // This step will result in an alert on screen
	   scrolltoTabButton();

		WebElement clickButton3 = driver.findElement(By.id("confirmButton"));
		clickButton3.click();
		Thread.sleep(2000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.dismiss();
	    
	} 
		
		
	  public static void scrolltoTabButton() throws InterruptedException {
	    	WebElement ele = driver.findElement(By.id("alertButton"));
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
	    	Thread.sleep(1000);	
	    }
		
//		d.navigate().to("D:\\downloads\\html\\javascript8(if cond using prompt).html");
//		//d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”. The default setting is 0.
//		Thread.sleep(1000);	
//		Alert obj = d.switchTo().alert();
//		obj.sendKeys("1");
//		obj.accept();
//		Thread.sleep(2000);
//		obj.sendKeys("2");
//		obj.accept();
//		obj.dismiss();
		
		//d.close();
		
}
