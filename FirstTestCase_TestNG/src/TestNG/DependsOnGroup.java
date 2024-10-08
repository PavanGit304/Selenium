//DependenceOnGroups:  It allows the test methods to depend on the group of test methods. It executes the group of test methods before the dependent test method.
package TestNG;

import org.testng.annotations.Test;

public class DependsOnGroup {

	   @Test(dependsOnGroups = { "SignIn" })
	    public void AccView() {
	        System.out.println("SignIn Successful");
	    }
	 
	    @Test(groups = { "SignIn" })
	    public void LogIn() {
	        System.out.println("Logging In Success");
	    }
	    
	    @Test(groups = { "SignIn" })
	    public void LogOut() {
	        System.out.println("Logging Out Success");
	    }
	    
}
