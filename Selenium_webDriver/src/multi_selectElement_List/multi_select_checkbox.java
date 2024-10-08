package multi_selectElement_List;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_select_checkbox {
	//findElements(): it is used to find/identify list of web elements in the current webpage
	public static void main(String[]args) 
	{
			try {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		    WebDriver d= new ChromeDriver();
			d.manage().window().maximize(); 
			d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			d.get("D:\\downloads\\html\\javascript45(javascriptForm).html.");
			
			//String checkToBeSelected = "Bike"; 
			List<WebElement> checkList = d.findElements(By.name("interest"));
			System.out.println("number of checkbox present in webpage  :"+checkList.size());  // it print list of check box
			for(int i=0; i<checkList.size(); i++) {
				//if(checkList.get(i).getAttribute("value").equalsIgnoreCase(checkToBeSelected)) 
				//{	
					checkList.get(i).click();
					Thread.sleep(2000);
					//break;
				//}
			}
			//d.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			}

}
