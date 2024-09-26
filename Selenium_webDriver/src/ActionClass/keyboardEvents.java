package ActionClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class keyboardEvents {
public static void main(String[] args) {
	WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 50);
        
        WebElement fullName = driver.findElement(By.id("userName"));
//        fullName.sendKeys("Mr.Peter Haynes");
        
        wait.until(ExpectedConditions.visibilityOf(fullName)).sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        
        // Select the Current Address using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        // Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();   
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        //Compare Text of current Address and Permanent Address
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
//        driver.close();
	}
}
