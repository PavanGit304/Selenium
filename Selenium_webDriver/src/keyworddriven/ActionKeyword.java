package keyworddriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyword {
	public static WebDriver driver;
	
	public static void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		 driver= new ChromeDriver();
	}
	public static void openURL() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
//	driver.get("openURL");
	Thread.sleep(1000);
	}
	public static void input_Username() throws InterruptedException{
		  driver.findElement(By.name("identifier")).sendKeys("tumuku1993@gmail.com");  // userName 
//			WebElement un = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]"));  //click 
//			un.click();
		  Thread.sleep(5000);
	}
	
	public static void click_Next(){  // next button
		driver.findElement(By.xpath("//*[contains(@id,'Next')]")).click();
		}
		
//	public static void input_password(){
//	driver.findElement(By.name("password")).sendKeys("Pavan304");   // password 
//	}
//	
//	public static void waitFor() throws Exception{
//	Thread.sleep(5000);
//	}
//	public static void click_Next(){  // next button
//	driver.findElement(By.className("VfPpkd-RLmnJb")).click();
//	}
	
    
	/*public static void movemasters()
     {
    	WebElement mnuMast=driver.findElement(By.xpath(".//*[@id='smoothmenu1']/ul/li[5]/a"));
        Actions act=new Actions(driver);
        act.moveToElement(mnuMast).build().perform();
      }
     
	public static void click_Logout()
	{
	driver.findElement (By.xpath(".//*[@id='logout']")).click();
	}*/
	public static void closeBrowser(){
	driver.close();
	}
}


