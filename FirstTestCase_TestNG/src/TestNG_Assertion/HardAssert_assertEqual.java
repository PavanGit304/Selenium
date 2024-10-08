/*An assertion is used to compare the actual r esult of an application with the expected result.
Assert.assertEquals (String actual, String expected);
•	It accepts two strings.
•	If both the strings are equal, the test case executes successfully otherwise the test case fails.
*/
package TestNG_Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert_assertEqual {
	
	public static void main(String[] args) {  
	    
	        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	        driver.navigate().to("https://ib.absa.co.za/absa-online/login.jsp");  
	        WebElement d= driver.findElement(By.name("AccessAccount"));
	       
	      String expectedString =d.getAttribute("name");// to get attribute value we need to use string 
	      Assert.assertEquals("AccessAccount", expectedString,"enter valid UserName");// if actual and expected are not equal then it prints enter valid Uname 
	      d.sendKeys("156316446");
	           System.out.println("Text content is :"+ expectedString); // it prints attribute value 
  
	}
}
