package browser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import grid.newGrid;

public class chrome_brow {
	public static void main(String[]args){
		chrome_brow  obj= new chrome_brow();
		obj.lunchbrow();
	}
		
		public void lunchbrow() {	
		try {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver128\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver d= new ChromeDriver();   
		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://gw.lightinthebox.com/index.php");
//	    d.findElement(By.xpath("")).click();
		//d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/form/div[3]/input")).click();
		}
		catch (Exception e) {
			
		}
		}}



//Map<String, Object> prefs = new HashMap<String, Object>();
//	prefs.put("profile.default_content_setting_values.notifications", 2);
//ChromeOptions options = new ChromeOptions();
//options.setExperimentalOption("prefs", prefs);