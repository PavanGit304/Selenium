package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest{
	WebDriver driver;
  @Test              
  public void get_URL(){
	  driver.get("https://www.lightinthebox.com/en/p/men-s-t-shirt-tee-solid-color-v-neck-street-casual-short-sleeve-tops-basic-fashion-classic-comfortable-white-navy-blue-summer_p9169020.html?prm=1.5.1.1");
  }
  
  @BeforeTest
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close(); 
  }
}
