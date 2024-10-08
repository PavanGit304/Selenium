package TestNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MultipleTestCases { // multiple Tests : by using testNG we can run multiple test in a single test class and it execute alphabetic order 
   
	@Test
	public void One() {
		System.out.println("This is the Test Case number One");
	}

	@Test
	public void Two() {
		System.out.println("This is the Test Case number Two");
	}

	@Test
	public void Three() {
		System.out.println("This is the Test Case number Three");
	}

	@Test
	public void Four() {
		System.out.println("This is the Test Case number Four");

	}

}

/*

@Test
public void c_test() 
{
  Assert.fail();
}

@Test 
public void a_test() 
{
  Assert.assertTrue(true);
}

@Test
public void b_test() 
{
  throw new  SkipException("skipping ");
}

*/


//.................................................................................................................................... OR


