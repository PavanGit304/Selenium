package windowHandle;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleWindows {

	static WebDriver driver;
	public static void scrolltoTabButton() throws InterruptedException {
	WebElement ele = driver.findElement(By.id("tabButton"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);// This will scroll the page till the element is found
	Thread.sleep(2000);
}

	public static void main(String[] args) throws InterruptedException {									
	    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");
	    scrolltoTabButton();

	    // Opening all the child window
	    driver.findElement(By.id("tabButton")).click(); 
	    driver.findElement(By.id("windowButton")).click();
	    
	    String MainWindow = driver.getWindowHandle(); //It stores parent window value in a unique identifier of string type
	    System.out.println("Main window handle is " + MainWindow);

	    // To handle all new opened window
	    Set<String> s1 = driver.getWindowHandles();//All child windows are stored in a set of strings.
	    System.out.println("Child window handle is" + s1);
	    Iterator<String> i1 = s1.iterator();//Here we will iterate through all child windows.

	    // Here we will check if child window has other child windows and when child window is the main window it will come out of loop.
	      while (i1.hasNext()) {
	          String ChildWindow = i1.next();
	          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {// close them by comparing the main window with the child windows.
	              driver.switchTo().window(ChildWindow);
	              driver.close();
	              System.out.println("Child window closed");
	           }
	       }
	    }
}
