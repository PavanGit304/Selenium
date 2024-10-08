//invocationCount: If you want to execute a test case “n” no.of times, then we use invocationCount attribute 
package TestNG;

import org.testng.annotations.Test;

public class iterations {
@Test  
  public void m1() {
//	for (int i =0; i < 7;i++) {
		  System.out.println("hello");
//	}
	}

@Test(invocationCount=7)
public void m2() {
	System.out.println("pavan");	
	}
}
