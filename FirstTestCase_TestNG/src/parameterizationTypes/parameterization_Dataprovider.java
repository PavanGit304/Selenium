package parameterizationTypes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterization_Dataprovider {

	@DataProvider
	public Object[][] testData(){  
		Object[][] data = new Object[2][2]; // creating array of 2D obj
		
		data[0][0] = "Test1"; // 1st row 1st col
		data[0][1] = "Test2"; // 1st row 2nd col
		
		data[1][0] = "Test3"; // 2nd row 1st col
		data[1][1] = "Test4"; // 2nd row 2st col
		
		return data;   // method return type is 2D object ex:Object[][] and its name:data
		}
	 	
	@Test(dataProvider="testData")// testData is DataProvider name 
	public void test(String s1, String s2) {//when ever we use data provider, your test should have same no of arguments here we using 2Darray so pass 2 arguments   
		System.out.println("s1"+""+s1+"s2"+""+s2);
	}	
}
