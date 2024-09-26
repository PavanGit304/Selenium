package checkbox_Radiobtn;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpHandling_onWeb_check_box {
	public static void main(String[] args) throws InterruptedException {

		// Create a map to store preferences
		Map<String, Object> prefs = new HashMap<String, Object>();

		// add key and value to map as follow to switch off browser notification Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe"); 
																																	
		WebDriver driver = new ChromeDriver(options); // Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		driver.navigate().to("https://www.spicejet.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		// System.out.println();

		Thread.sleep(1000);
// Alert obj =driver.switchTo().alert();
// obj.accept();
		driver.findElement(By.xpath("//INPUT[@id='ctl00_mainContent_chk_IndArm']")).isSelected();
		driver.findElement(By.xpath("//INPUT[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected();
	}

}
