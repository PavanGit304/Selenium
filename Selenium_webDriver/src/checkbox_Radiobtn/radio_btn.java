package checkbox_Radiobtn;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_btn {
	
	public static void main(String[] args) throws InterruptedException {  
        
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.get("D:\\downloads\\html\\radio_btn.html");  
  
       // int a = driver.findElements(By.xpath("//input [@name='group1']")).size();  
        List<WebElement> b= driver.findElements(By.xpath("//input[@name='group1']"));//it calculates the number of radio buttons whose name is group1.
        int a = b.size();  
        System.out.println(b);  // it print the size of radio button
        for(int i=0;i<=a;i++)   {  
        	//we will handle the radio buttons by using the index of a particular radio button.
        	Thread.sleep(3000);
            b.get(2).click();  
            Thread.sleep(5000);
            b.get(0).click();
        }  
	}

}
