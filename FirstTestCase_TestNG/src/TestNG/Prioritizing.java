package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/* using priority parameter we can execute the methods in order    Ex 0 is 1st priority   9 is last priority
If we want to Run the Tests in a sequential order then we have to set 
the priority along with @Test annotation*/
public class Prioritizing {


	public WebDriver driver;

	@Test(priority = 8) // 3rd

	public void One() {
		System.out.println("This is the Test Case number One");
	}

	@Test(priority = 1)  // 1st

	public void Two() {
		System.out.println("This is the Test Case number Two :");
	}

	@Test(priority = 2)//2nd

	public void Three() {
		System.out.println("This is the Test Case number Three");
	}
// 0  1 2 3 4 5 6 7 8 9 last 
	@Test(priority = 9)//last
	public void Four() {
		System.out.println("This is the Test Case number Four");

	}
	
	@Test(priority = 9)//last
	public void Four1() {
		System.out.println("This is the Test Case number Four");

	}

}
