//dependsOn Method: It tells the TestNG on which methods this test will be dependents that test method will be executed before this test 

package TestNG;

import org.testng.annotations.Test;

public class DepndentOnMethod {
	
  @Test (dependsOnMethods = { "OpenBrowser" }) // it executes after the depends method is executed
  public void SignIn()  {
	   System.out.println("This will execute second (SignIn)");
  }
  
  @Test
  public void OpenBrowser() {
  System.out.println("This will execute first (Open Browser)");
  }
 
  @Test (dependsOnMethods = { "SignIn" })
  public void LogOut() {
  System.out.println("This will execute third (Log Out)");
  }
  
}
