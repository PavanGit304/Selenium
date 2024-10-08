package DataProviderPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ExcelDataprovider;

public class DataProviderClass {

WebDriver driver;
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "test1data" , dataProviderClass = ExcelDataprovider.class)
	public void test3(String  uname, String pwd) {
		
//		System.out.println(username +"|"+password);
		  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		  driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys(uname);
		driver.findElement(By.name("lastname")).sendKeys(pwd);
		
	}
	
	
}
