package Without_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Without_POMclass {
	WebDriver driver;

	public Without_POMclass(WebDriver driver) {
		this.driver = driver; // this : it refers current class variables
	}

	By username = By.xpath("//*[contains(@id,'identifierId')] ");
	By next = By.xpath("//*[contains(@id,'Next')]");

	public void typeusername() {
		driver.findElement(username).sendKeys("Tumuku");
	}

	public void clicknext() {
		driver.findElement(next).click();
	}
}
