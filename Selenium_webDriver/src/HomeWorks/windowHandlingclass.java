package HomeWorks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlingclass {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.lightinthebox.com/");
			
//			harikacode();
			jeevancode();
		}
	
	static void harikacode() throws InterruptedException {
//		driver.get("https://www.lightinthebox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement  Womens_Selection = driver.findElement(By.xpath("//*[@id=\"mainNav\"]/div/div[2]/div[1]/div/a[4]"));
		Womens_Selection.click();
		System.out.println(Womens_Selection.getText());
	} 
	
	static void jeevancode() throws InterruptedException {
		   String firstwindow=driver.getWindowHandle();

		   WebElement  Men_Selection  =  driver.findElement(By.xpath("//*[@id=\"mainNav\"]/div/div[2]/div[1]/div/a[3]"));
		   Men_Selection.click();

				Thread.sleep(5000);
				Set<String> secondwindow = driver.getWindowHandles();
				for (String handle : secondwindow) {
					driver.switchTo().window(handle);
					Thread.sleep(5000);
					driver.close();
		      }
				System.out.println(Men_Selection.getText());

		      driver.close();
	}
	void santhoshcode() {}
	void saicode() {}

}
