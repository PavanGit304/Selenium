package screenshot_failureTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
  @Test
  public void TakeScreenshotTest(){
	  Assert.assertEquals(false, true);
  }
  
  @BeforeMethod
  public void setup() {
	  initialization(); }
  
  @AfterMethod
  public void Tteardown(){
	  driver.quit();
  }
}
