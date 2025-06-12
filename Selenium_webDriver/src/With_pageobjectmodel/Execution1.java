package With_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Execution1 extends Listner {

	withPOM1 obj;
	// WebDriver driver;

	@Test(groups = { "login" })
	public void login1() {
		obj = new withPOM1(driver);
		obj.Enter_FirstName();
		obj.Enter_LastName();
	}

}
