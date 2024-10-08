package screen_shot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screen_shot {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("pawan kalyan images", Keys.ENTER);
		Thread.sleep(1000);
		File scr = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File(
					"C:\\Users\\PAVAN\\git\\Selenium_WebDriver\\Selenium_webDriver\\src\\screen_shot\\Monday.png"));//			"E:\\Selenium\\eclipse\\selenium_Workspace\\Selenium_webDriver\\src\\screen_shot\\friday1.png"
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
