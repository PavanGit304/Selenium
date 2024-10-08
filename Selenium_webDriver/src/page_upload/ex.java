package page_upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex {

	
	public static void main(String[] args) throws Exception 
	{
		try {
		Process P = Runtime.getRuntime().exec("E:\\Selenium\\eclipse\\selenium_Workspace\\Selenium_webDriver\\src\\page_upload\\file_upload.exe");
		
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver108\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("http://www.andhra.com");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}
