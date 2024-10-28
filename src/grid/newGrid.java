package grid;

import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class newGrid {
	public WebDriver driver;  
	public String URL, Node; 
 	protected ThreadLocal<RemoteWebDriver> threadDriver=null; 
 	@Parameters("browser") 
	
 	@BeforeTest 
 	public void launchapp(String browser)throws MalformedURLException 
 	{ 
 	 	String URL="http://www.google.co.in";  	 	
 	 	if(browser.equalsIgnoreCase("firefox")) 
 	 	{ 
 	 	 	System.out.println("Executing on firefox1"); 
 	 	 	String Node="http://192.168.0.110:5555/wd/hub";  	 	 	
 	 	 	DesiredCapabilities cap=DesiredCapabilities.firefox();  	 	 	
 	 	 	cap.setBrowserName("firefox");  	 	 
 	 	 	driver=new RemoteWebDriver(new URL(Node),cap);  	 	 
 	 	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
 	 	 	driver.navigate().to(URL); 
 	 	 	driver.manage().window().maximize(); 
 	 	} 
 	 	
 	 	else if(browser.equalsIgnoreCase("firefox1")) 
 	 	{ 
 	 	 	System.out.println("Executing on firefox2"); 
 	 	 	String Node="http://192.168.0.110:5551/wd/hub"; 
 	 	 	DesiredCapabilities cap=DesiredCapabilities.firefox();  	 	 	
 	 	 	cap.setBrowserName("firefox");  	 	 
 	 	 	driver=new RemoteWebDriver(new URL(Node),cap);  	 	
 	 	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
 	 	 	driver.navigate().to(URL); 
 	 	 	driver.manage().window().maximize(); 
 	 	} 
 	 	
 	 	else if(browser.equalsIgnoreCase("firefox2")) 
 	 	{ 
 	 	 	System.out.println("Executing on firefox3"); 
 	 	 	String Node="http://192.168.0.110:5552/wd/hub";  	 	 	
 	 	 	DesiredCapabilities cap=DesiredCapabilities.firefox();  	 	 
 	 	 	cap.setBrowserName("firefox");  	 	
 	 	 	driver=new RemoteWebDriver(new URL(Node),cap);  	 	 
 	 	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
 	 	 	driver.navigate().to(URL);  	 	 	
 	 	 	driver.manage().window().maximize(); 
 	 	} 
 	 	else 
 	 	{ 
 	 	 	throw new IllegalArgumentException("Invalid Browse Type..."); 
 	 	} 
 	 	} 
  @Test 
  public void googleTest() throws InterruptedException { 
 	  { 
 	 	  driver.get("https://www.google.co.in/"); 
 	 	  Thread.sleep(1000); 
 	 	  WebElement src=driver.findElement(By.id("lst-ib"));  	 	 
 	 	  src.sendKeys("visakhapatnam");  	 	
 	 	  driver.findElement(By.name("btnK")).click(); 
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
          driver.findElement(By.linkText("Visakhapatnam - Wikipedia")).click(); 
 	  } 
  } 
 	  @AfterTest 
 	   public void closeBrowser() 
 	   { 
 	 	  driver.close(); 
 	   } 
 	 

}
