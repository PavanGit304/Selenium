package TestNG_Assertion;
//assertNotEquals is an assertion method used to verify that two values are not equal. If the values are equal, the test will fail.
import org.testng.Assert;

public class HardAssert_assertNotEqual {
	
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Assert.assertNotEquals("Hello", "Hellos","you entered same values");  
//        Assert.assertEquals("Hello", "Hellos","you entered same values");
        System.out.println("both actual and expected are different");  
          
    }  

}
