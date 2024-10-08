package PopUpHandling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.This;
import grid.newGrid;

public class alertAcceptPopUp {
	/*  Alert Interface to perform various required actions. For example, accepting and dismissing the alert,
	 *  getting the text from the alert window, writing some text on the alert window, and so on.
	 * accept(): This method clicks on the 'OK' button of the alert box.
	 * dismiss(): We use this method when the 'Cancel' button clicks in the alert box.
	 * getText(): This method captures the message from the alert box.
	 * sendKeys(String stringToSend): This method sends data to the alert box.
	 * */

	static WebDriver driver;
	
	WebElement clickButton1;
	WebElement clickButton2;
	WebElement clickButton3;
	WebElement clickButton4;
	
	WebDriverWait wait;
	Alert simpleAlert;
	
           
	public static void main(String []args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
		Thread.sleep(1000);
		new alertAcceptPopUp().popUpHandling(); // calling popup method
	}

	
	void popUpHandling() throws InterruptedException {
		wait = new WebDriverWait(driver, 70);

		scrolltoTabButton();
// ------------------------Accept------------------------------------------------
		clickButton1 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("alertButton"))));
		clickButton1.click();
		Thread.sleep(2000);
        alerMethod().accept(); //simpleAlert.accept();
        System.out.println("click on " +clickButton1.getText());
        
// -------------------Home work-----Accept---wait for 5 sec and click on accept ---------------------------------------------
		
//		clickButton2 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("timerAlertButton"))));
//		clickButton2.click();
//		Thread.sleep(8000);
//		alerMethod().accept(); //simpleAlert.accept();
//		Thread.sleep(3000);
// ------------------------Dissmiss-------------------------------------------------		
	
		clickButton3 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("confirmButton")))); 
		clickButton3.click();
		Thread.sleep(4000);
		alerMethod().dismiss(); //simpleAlert.dismiss();
		
// ------------------------Sendkeys------------------------------------------------
//		clickButton4 =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("promtButton")))); 
//		clickButton4.click();
//		Thread.sleep(4000);
//		alerMethod().sendKeys("pavan"); //simpleAlert.dismiss();
//		System.out.println(alerMethod().getText());
//		Thread.sleep(2000);
//		alerMethod().accept();

	}

	Alert alerMethod() {
		 simpleAlert = driver.switchTo().alert();
		return simpleAlert;
	}

	public static void scrolltoTabButton() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("alertButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
		Thread.sleep(1000);
	}
}







//		driver.navigate().to("D:\\downloads\\html\\javascript4(alertDilogbox).html");
//		//d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);//it is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”. The default setting is 0.
//		Thread.sleep(2000);
//		Alert obj = driver.switchTo().alert();
//		obj.accept();
//		d.quit();



// This step will result in an alert on screen
//scrolltoTabButton();
//WebElement clickButton1 = driver.findElement(By.id("alertButton"));
//clickButton1.click();
//Thread.sleep(2000);
//Alert simpleAlert = driver.switchTo().alert();
//simpleAlert.accept();

//WebDriverWait wait = new WebDriverWait(driver, 50);
//WebElement OnButtonClick2 = driver.findElement(By.id("timerAlertButton"));
//wait.until(ExpectedConditions.elementToBeClickable(OnButtonClick2)).click();
//Thread.sleep(2000);
//Alert alert2 = driver.switchTo().alert();
//alert2.accept();

//WebElement clickButton2 = driver.findElement(By.id("confirmButton"));
//clickButton2.click();
//Thread.sleep(2000);
//simpleAlert.dismiss();