/*We can define grouping in TestNG using groups attribute    @Test (groups= “value”)
It is attribute in testNG and it allows you to execute the multiple test cases in a single suite by using groups attribute 
For ex if have 100 Test Case and you want to run all the test case in a single suite in that satiation we use Grouping and
*/

package TestNG;

import org.testng.annotations.Test;

public class Grouping {
  @Test  (groups = { "Car" })
  public void Car1(){
	  
	  System.out.println("Batch Car - Test car 1");
  }
  

  @Test (groups = { "Car" })
 
  public void Car2() {
 
   System.out.println("Batch Car - Test car 2");
 
  }
 
  @Test (groups = { "SCooter" })
 
  public void Scooter1() {
 
   System.out.println("Batch Scooter - Test scooter 1");
 
  }
 
  @Test (groups = { "SCooter" })
 
  public void Scooter2() {
 
   System.out.println("Batch Scooter - Test scooter 2");
 
  }
  
 
  @Test (groups = { "Car" , "SCooter"})
 
  public void Sedan1() {
 
   System.out.println("Batch Sedan Car - Test sedan 1");
 
  }
}












































