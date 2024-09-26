package browser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser {

	public static void main(String[] args) {

		try {
//			System.setProperty("webdriver.ie.driver","E:\\Selenium\\selenium_softwares\\Drivers\\IEDriverServer64.exe"); // to copy the path :

			//System.setProperty():it sets the properties for the desired browser to be used in test automation.
            System.setProperty("webdriver.edge.driver","E:\\Selenium\\selenium_softwares\\Drivers\\Edge browser\\edge 126\\edgedriver_win64 (1)\\msedgedriver.exe"); // to copy the path :
		
			WebDriver d = new EdgeDriver();
			d.manage().window().maximize();
			Thread.sleep(1000);
//			driver.get() method is used to open an URL and it will wait till the whole page gets loaded.
			d.get("https://www.google.com/");
			WebElement srch = d.findElement(By.name("q"));
//			sendkeys():it is used to send keyboard input such as characters, numbers, and symbols to text boxes inside an application.
			srch.sendKeys("pawan kalyan photos",Keys.RETURN);//Keys.RETURN/Keys.ENTER  :it press enter
			d.findElement(By.xpath("//*[contains(text(),'330 Pavan kalyan ideas - Pinterest')]")).click();
			d.close();
		}

		catch (Exception e) {

			System.out.println(e);
		}

	}
}
