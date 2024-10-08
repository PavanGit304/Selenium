package ExtentReport_Highlevel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport_Highlevel_Execution extends ExtentReport_Highlevel_Lsitener {


	POM obj ;
	WebDriver driver;
	
	@Test
	public void Sample_Web_Page_To_Test() 
	{
		obj = new POM(driver);
		try {
		
		obj.Enter_FirstName();
		System.out.println("print 1st name ");
		obj.Enter_LastName();
		}
		catch(Exception ex) {
			
//			System.out.println(ex.getMessage());
//			System.out.println(ex.getCause());
//			ex.printStackTrace();
			test.log(LogStatus.FAIL, ex);
		}	
	}
}
