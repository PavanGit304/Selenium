package Without_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Without_POM.Without_POMclass;

public class Execution {	
	@Test
	public  void login(){		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3DOGB%26tab%3Drk%26utm_medium%3Dact%26pli%3D1&csig=AF-SEnZOyVueqpW7y_o5%3A1589351334&flowName=GlifWebSignIn&flowEntry=AddSession");
	
//		driver.findElement(By.xpath("//*[contains(@id,'identifierId')] ")).sendKeys("pavanbosa304@gmail.com");
//		driver.findElement(By.xpath("//*[contains(@id,'Next')] ")).click(); //password
		Without_POMclass obj = new Without_POMclass(driver);
		obj.typeusername();
		obj.clicknext();	
	}
}
