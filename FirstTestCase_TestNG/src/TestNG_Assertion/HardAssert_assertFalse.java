package TestNG_Assertion;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HardAssert_assertFalse {

	   public static void main(String[] args) {  
		    // TODO Auto-generated method stub  
		        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("D:\\downloads\\html\\htmlform.html");
				WebElement gender = driver.findElement(By.id("g1"));
				String s = gender.getAttribute("name");
				System.out.println("content text is : " + s);
//				/WebElement male =driver.findElement(By.id("g1"));
				gender.click();  
		        System.out.println(gender.isSelected());  //driver.findElement(By.id("g1")).isSelected()
		        Assert.assertFalse(false);//if condition not selects above statement it print false
			    Assert.assertTrue(true); // if condition selects above statement it print true
		      
		    }  
}
