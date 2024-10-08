package drang_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class drag_drop_ex1 {
	
	static WebDriver driver ;
	public static void main(String []args){	
		try {
 //setProperty: it set the properties for the desired browser to be used in test automation.			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html"); 
			
			WebElement sourceLocatorBank=driver.findElement(By.xpath("//*[@id='credit2']/a"));	   //Element which needs to drag.
			WebElement targetLocator_DebitSide_Account=driver.findElement(By.xpath("//*[@id='bank']/li"));	  //Element on which need to drop.	
			WebElement source_5000=driver.findElement(By.xpath("//*[@id='fourth']/a"));         //Element which needs to drag. 
	        WebElement target_DebitSide_Amount=driver.findElement(By.xpath("//*[@id='amt7']/li"));	       //Element on which need to drop.
	       
		        //Using Action class for drag and drop.		
		         Actions act=new Actions(driver);					
		         act.dragAndDrop(sourceLocatorBank,targetLocator_DebitSide_Account).build().perform();  //Dragged and dropped.	
		         Thread.sleep(2000);
		         act.dragAndDrop(source_5000,target_DebitSide_Amount).build().perform();	            //Dragged and dropped
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}

