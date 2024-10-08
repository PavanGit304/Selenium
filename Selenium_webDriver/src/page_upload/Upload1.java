package page_upload;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload1 {  // file upload : by using only sendkeys method we can upload the file note: if you click button it will not work 
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException { 
		
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");
		  
	 driver = new ChromeDriver(); //Instantiation of driver object. To launch Firefox browser
		 driver.manage().window().maximize();
		 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");//To open URL "http://softwaretestingmaterial.com"
		Thread.sleep(2000);
		
		WebElement fname= driver.findElement(By.xpath("//*[contains(@name,'firstname')]"));
		fname.sendKeys("pavan");
		
		WebElement Lname= driver.findElement(By.xpath("//*[contains(@name,'lastname')]"));
		Lname.sendKeys("Reddy");
		
		JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
		jsExecuter.executeScript("window.scrollBy(0,500)");	
		
		 WebElement browse =driver.findElement(By.id("uploadfile"));//Locating 'browse' button
		 //browse.click();   
		 Thread.sleep(7000);
		 browse.sendKeys("D:\\Desktop\\SQL CV.docx");//pass the path of the file to be uploaded using Sendkeys method
		 Thread.sleep(2000);
          driver.close(); //'close' method is used to close the browser window
		 }

}
