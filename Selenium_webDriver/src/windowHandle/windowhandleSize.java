package windowHandle;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*The window handle is a unique identifier that stores the values of windows opened on a webpage and helps in window handling in Selenium.*/

//getWindowHandle() returns the window handle of currently focused window/tab.
//getWindowHandles() returns all windows/tabs handles launched/opened by same driver instance including all parent and child window.
//Return type of getWindowHandle() is String 
//while return type of getWindowHandles() is Set<String>. The return type is Set as window handle is always unique.

public class windowhandleSize {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver d;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.kotak.com/en/home.html");	
		d.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
		System.out.println("current window:"+d.getWindowHandle());
		Thread.sleep(1000);
		Set<String> secondwindow = d.getWindowHandles();
		for(String handle:secondwindow) {   // for loop return list of window handles 
			System.out.println(handle);	
		}
		
	}
}
