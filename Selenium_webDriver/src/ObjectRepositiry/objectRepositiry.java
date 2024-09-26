package ObjectRepositiry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class objectRepositiry {   // object repository : it is collection of objects that stored in 1 location and it is a keys and value pair when where we need the object we can call directly 
	
	public static void main(String[]args) throws IOException{
		try {
			Properties prop = new Properties();
			FileInputStream objfile = new FileInputStream("C:\\Users\\PAVAN\\git\\Selenium_WebDriver\\Selenium_webDriver\\src\\ObjectRepositiry\\repository.properties");
			prop.load(objfile);
			objfile.close();
			WebDriver d= new FirefoxDriver();
			d.get(prop.getProperty("url"));		
		    d.findElement(By.id(prop.getProperty("usernameID"))).sendKeys("pavan"); 
			d.findElement(By.id(prop.getProperty("passwordID"))).sendKeys("123456"); 		
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
