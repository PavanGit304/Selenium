package With_pageobjectmodel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Execution {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe"); 																						
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3DOGB%26tab%3Drk%26utm_medium%3Dact%26pli%3D1&csig=AF-SEnZOyVueqpW7y_o5%3A1589351334&flowName=GlifWebSignIn&flowEntry=AddSession");
	}

	@Test
	public void login() throws InterruptedException {
		withPOM obj = PageFactory.initElements(driver, withPOM.class);// initiElements(); it is used to initialize the web elements															
		obj.enter_username("Tumuku");
		Thread.sleep(2000);
		obj.next.click();
	}
}










//driver.findElement(By.xpath("//*[contains(@id,'identifierId')] ")).sendKeys("pavanbosa304@gmail.com");
//driver.findElement(By.xpath("//*[contains(@id,'Next')] ")).click(); //password
