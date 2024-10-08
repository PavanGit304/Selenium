package TestNG_Assertion;
//assertNull: This checks that an object or variable is null. If it's not null, the test fails.
import org.testng.Assert;

 
public class HardAssert_assertNull {
 
		public static void main(String[] args) {        
		Assert.assertNull(null,"obj value is not - null");  //instead of null enter 10 it throws an error 
//		Assert.assertNotNull(null, "obj value is null");	// object should not be null
		System.out.println("obj value is null");  
}
}