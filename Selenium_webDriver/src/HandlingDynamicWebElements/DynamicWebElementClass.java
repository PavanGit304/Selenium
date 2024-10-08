package HandlingDynamicWebElements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import JavaScript_selenium.click_WebElement;
import grid.newGrid;

public class DynamicWebElementClass {
	
	public static void main(String[]args) throws InterruptedException {
		//Create a map to store  preferences 
				Map<String, Object> prefs = new HashMap<String, Object>();

				//add key and value to map as follow to switch off browser notification
				//Pass the argument 1 to allow and 2 to block
				prefs.put("profile.default_content_setting_values.notifications", 2);

				/*Create an instance of ChromeOptions : It helps you perform various operations like opening 
				chrome in maximized mode, disable existing extensions, disable pop-ups, etc*/
				ChromeOptions options = new ChromeOptions();

				// by using set ExperimentalOption we can handle pop up using (prefs obj) 
				options.setExperimentalOption("prefs", prefs);
		
				
				
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver d= new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://www.lightinthebox.com/index.php?main_page=index");
		
//		XPath by href Attribute:To locate the hyperlink button based on its href attribute value: use below command
		d.findElement(By.xpath("//a[@href='https://www.lightinthebox.com/search?q=Mens+t+shirts&query_type=1']")).click(); 
        Thread.sleep(2000);

//Using position(): it selects the elements based on position number ex:instead of 2 enter/type 1 it select position 1 item 
//		d.findElement(By.xpath("/html/body/div[5]/div[2]/div/a[4]")).click(); // /html/body/div[5]/div[2]/div/a[1]

		d.findElement(By.xpath("//a[@href='https://www.lightinthebox.com/search?q=T+Shirt+Men+Cotton&query_type=1']")).click();
			
				System.out.print("T shirt Men Cotton");
			
		
		
		//*[@id="uni-header"]/div[2]/ul/li[2]/a
		
		
		
		
		
		
		
//		WebDriverWait wait = new WebDriverWait(d, 60);
//		if(wait.until(ExpectedConditions.alertIsPresent())==null) {
//			System.out.println("alert not displayed");
//		}
//		else {
//			//d.switchTo().alert().dismiss();
//	        WebElement overlay = d.findElement(By.id("overlay-id"));
//            overlay.click();
//		}
//		
//		Set<String> wids = d.getWindowHandles();
//		if(wids.size()>1) {
//			
//			d.switchTo().window("give name or window handle");
//			WebElement elewindowpop = d.findElement(By.id("//*[@id=\"dismiss-button\"]"));
//			if
//			elewindowpop.click();
//		}
		
		
//		d.findElement(By.id("//*[@id=\"dismiss-button\"]")).click();
			
         
         //id="dismiss-button"
//		Alert alert= d.switchTo().alert();
//		alert.c
		
	
		
		
	

}
}