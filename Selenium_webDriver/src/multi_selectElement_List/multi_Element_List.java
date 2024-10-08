package multi_selectElement_List;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//findElement():it finds/identify webelement within the web page 
//findElements(): it finds/identify list of web elements within web page 
public class multi_Element_List {
	public static void main(String[] args) {
		try {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver109\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
				
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize(); 
			d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			d.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
			List <WebElement> el= d.findElements(By.id("cr"));
			for(WebElement obj : el){
				String s= obj.getText();
				System.out.println(s);	
				Thread.sleep(1000);}
			d.close();
	}
			catch(Exception e){
			System.out.println(e);	
			}
			
			}
	

}