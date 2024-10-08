package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipClass {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver126\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		System.out.println("demoqa webpage Displayed");

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.id("tooltipDemo"));

		// Use action class to mouse hover
		actions.moveToElement(element).perform();

		WebElement toolTip = driver.findElement(By.cssSelector(".tooltiptext"));

		// To get the tool tip text and assert
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->" + toolTipText);

		// Verification if tooltip text is matching expected value
		if (toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")) {
			System.out.println("Pass* : Tooltip matching expected value");
		} else {
			System.out.println("Fail : Tooltip NOT matching expected value");
		}

		// Close the main window
		driver.close();
	}

}
