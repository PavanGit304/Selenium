package DropDown;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class multi_select_dropdown {
	
//	Select class: It is used for selecting and deselecting the  option in a dropdown 
	public static void main(String[]args)  	{
			try {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver118\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
				
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize(); 
			d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			d.get("D:\\downloads\\html\\javascript45(javascriptForm).html");
			Thread.sleep(1000);
			WebElement ele = d.findElement(By.id("cr"));
			Select s = new Select(ele);
			Thread.sleep(1000);
			s.selectByVisibleText("Maruthi"); 
			Thread.sleep(1000);
			s.selectByIndex(1);
			Thread.sleep(1000);
			s.selectByValue("Wagon-R");
			Thread.sleep(1000);
			//s.deselectByIndex(1);    // it de-select the 1 option
			
//.......................................getFirstSelectedOption();  it return 1st select value  			
//		    WebElement fistSel = s.getFirstSelectedOption();
//			System.out.println("First selected car :"+fistSel.getText());    // getText() it return text 
			
			

//.......................................getALLSelectedOption();  it return all select value  		
			
//			List<WebElement> selcar= s.getAllSelectedOptions();
//			
//			for(WebElement obj : selcar)     // for each loop : for iteration 
//			{
//				System.out.println("selected cars :"+obj.getText());
//			}
			
//.......................................getOptions();  it return all options			
//			List<String> allcar = new ArrayList();
//			for(WebElement obj1:s.getOptions()){
//				System.out.println("All cars "+allcar.add(obj1.getText()));
			
		  
			List<WebElement> allcar = s.getOptions();
			for(WebElement obj1:allcar){
				System.out.println("All cars "+obj1.getText());
			}
//	
			d.close();
	}
			catch(Exception e) {
			System.out.println(e);	
			}			
			}
}
