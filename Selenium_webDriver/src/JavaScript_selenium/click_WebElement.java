package JavaScript_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_WebElement {

	public static void main(String[]args)
	{
		
		try {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\latest Drivers\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
			
			WebDriver d= new ChromeDriver();
		d.manage().window().maximize(); 
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		d.get("https://www.google.com/");
		//WebElement srch = d.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']"));
		//srch .sendKeys("images");
		
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		// Typing the test data into Textbox
		
		js.executeScript("document.getElementByClassName('gLFyf gsfi').value= 'img';");
		
		
		/*WebElement element=d.findElement(By.name("btnK"));        //d.findElement(By.name("btnK")).click();
		 
	
		JavascriptExecutor js = (JavascriptExecutor)d;        // Instantiating JavascriptExecutor
		js.executeScript("arguments[0].click();", element);  // Clicking the web element
        d.quit();                                           // it closes all the windows that is opened by the program 
*/
		}
		catch(Exception e){
		System.out.println(e);	
		}
		}
	
	
	
	
}
