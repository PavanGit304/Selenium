package parameterizationTypes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization_Dataprovider1 {

	@DataProvider
	public Object[][] testdata1(){  
		Object[][] data1 = new Object[3][3]; // creating array of 2D obj note: it execute row and col
		
		data1[0][0] = 1; // 1st row 1st col
		data1[0][1] = 2; // 1st row 2nd col
		data1[0][2] = 3;
		
		data1[1][0] = 4; // 2nd row 1st col
		data1[1][1] = 5; 
		data1[1][2] = 6;
		
		data1[2][0] = 7; // 3rd row 1st col
		data1[2][1] = 8; 
		data1[2][2] = 9;
		
		return data1;   // method return type is 2D object ex:Object[][] and its name:data1
		}
	
	
	@Test(dataProvider="testdata1")
	public void test1(int a, int b, int c){
		System.out.println("a ="+""+a+"b ="+""+b+"c ="+""+c);	
	}
}
