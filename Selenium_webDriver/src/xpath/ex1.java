package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver d= new ChromeDriver();
		d.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
		WebElement uname = d.findElement(By.xpath("//input[@name='unm']"));
		uname.sendKeys("31331");
		System.out.println("uname :" +uname.getAttribute("name"));
		
        
		
		
	}

}
