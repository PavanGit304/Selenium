package page_upload;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class file_upload {

	//file upload: by using Sendkeys we can upload a file 
	static WebDriver d;
	public static void main(String[] args) throws Exception { 
		try {    // it is a block of code in which exception are occurred
			
//		Process P = Runtime.getRuntime().exec("E:\\Selenium\\eclipse\\selenium_Workspace\\Selenium_webDriver\\src\\page_upload\\file_upload.exe");
	                   //Runtime.getRuntime().exec() : it takes the absolute path of the executable along with the extension i.e. .exe
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver108\\chromedriver.exe");
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
	d.findElement(By.id("u")).sendKeys("pavan"); 
	Thread.sleep(1000);	
	d.findElement(By.id("p")).sendKeys("12345");
	Thread.sleep(1000);
	d.findElement(By.id("s0")).click();
	Thread.sleep(1000);
	d.findElement(By.id("c1")).click();
	Thread.sleep(1000);
	WebElement select_car = d.findElement(By.id("cr"));
	Select s = new Select(select_car);
	s.selectByIndex(3);                  //it select the 3rd index 																								
	Thread.sleep(1000);
	WebElement select_coun = d.findElement(By.name("cv"));
	Select s_c = new Select(select_coun);
	s_c.selectByIndex(2);
	Thread.sleep(1000);
	WebElement descrip = d.findElement(By.id("ft"));
	descrip.sendKeys("going with emirates is doing nice ");
	Thread.sleep(1000);
	WebElement email= d.findElement(By.id("em"));
	email.sendKeys("pavanbosa304@gmail.com");
	Thread.sleep(1000);
	Thread.sleep(500);
	WebElement Browser =d.findElement(By.id("res"));
	 Browser.sendKeys("D:\\Desktop\\SQL CV.docx");
	Thread.sleep(5000);
	d.findElement(By.id("sub")).click();	}
		catch(Exception e)  // it catch try block exceptions 
		{
			System.out.println(e);
		}
	}
}
