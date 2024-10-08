package groups;

import org.testng.annotations.Test;

public class Groupofclass {
	
  @Test(groups= {"pay some one"}) 
  public void ex1() {
	  System.out.println("print pay some one");
  }
  
  @Test(groups= {"pay some one"}) 
  public void ex2() {
	  System.out.println("print pay some one");
  }
  
  @Test(groups= {"pay new beneficiary"}) 
  public void ex3() {
	  System.out.println("print pay new beneficiary ");
  }
  
  @Test(groups= {"pay new beneficiary"}) 
  public void ex4() {
	  System.out.println("print  pay new beneficiary");
  }
  
  @Test(groups= {"pay an Existing Beneficiary"}) 
  public void ex5() {
	  System.out.println("print pay an Existing Beneficiary");
  }
  
  
  
}
