package parameterizationTypes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization1 {

	@Test
	@Parameters({ "name", "age" })
	public void Sum(String name, int age) {
		System.out.println("name :" + name +"\n"+ "age :"+ age);
	}
}