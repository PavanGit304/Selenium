package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//getWindowHandle() – This method is used to handle the current window.
//getWindowHandles() – This method is used to handle the all opened window with same driver instance including all parent and child window.
//Set – It is an interface which is used to store the all windows in the form of String.
//switchTo() – This method is used to switch from one window to other window.
//Iterator – It is an interface to fetch the element one by one.
//Return type of getWindowHandle() is String 

//Note : if we dont use window handle methods it will not close child window it means the returns false 

public class WindowHandleSwitch {  
	
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://omayo.blogspot.com/");
		
		//write code here 
      String  firstwindow = d.getWindowHandle();  // it returns current window 
	  WebElement openpopup=d.findElement(By.linkText("Open a popup window"));
      JavascriptExecutor js =  (JavascriptExecutor)d;
      js.executeScript("arguments[0].scrollIntoView();",openpopup );//This will scroll the page till the element is found	
      Thread.sleep(5000);
	  openpopup .click();
	  Thread.sleep(5000);
	  
		Set<String> secondwindows = d.getWindowHandles();// it returns all windows ex: 2nd window 
		for(String handle:secondwindows) {   // for loop return list of window handles 
			d.switchTo().window(handle); // it switch from the parent window to the child window
			System.out.println("window 2");	
			d.close();
		}
		
		  d.close(); // note: without window handle 2nd window will not close 
// 	      d.switchTo().window(firstwindow);// it switch from the chaild window to the parent window
	
	      d.quit(); // it closes all the windows 
	}
	
}






//Iterator<String> itr = windows.iterator(); // it iterate all the windows 
//while(itr.hasNext()) // it returns true if this scanner has another token in its input.
//{
//	String window = itr.next();//it finds and returns the next complete token from the scanner which is in using. 
//	d.switchTo().window(window);
//	d.close();		
//	if(d.getTitle().equals("Basic Web Page Title")) {
//		System.out.print("true");
//	d.close();
//	}	
//}
