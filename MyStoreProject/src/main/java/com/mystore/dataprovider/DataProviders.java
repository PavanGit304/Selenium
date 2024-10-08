package com.mystore.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.mystore.utility.NewExcelLibrary;
import com.mystore.utility.NewExcelLibrary1;

public class DataProviders {

	 NewExcelLibrary  obj = new NewExcelLibrary();
	
//	@DataProvider(name ="credentials")
//	public static Object[][] getData() throws IOException { //object[][] it is 2d object array for calling all data using data provider 
//		String path ="E:\\Selenium\\eclipse\\MyStoreProject\\src\\test\\resources\\TestData\\TestData.xlsx";
//		return getCredentials(path);
//	}
	
	
//	public static  Object[][] getCredentials(String path) {
//		NewExcelLibrary  obj = new NewExcelLibrary(path);
//		// Totals rows count
//		int rows = obj.getRowCount("Credentials"); // pass the sheet name ex:Credentials. getRowCount: it gets the row count 
//		// Total Columns
//		int column = obj.getColumnCount("Credentials");// pass the sheet name ex:Credentials. getRowCount: it gets the column  count 
//		int actRows = rows - 1;
//
//		Object[][] data = new Object[actRows][column];
//
//		for (int i = 0; i < actRows; i++) {
//			for (int j = 0; j < column; j++) {
//				data[i][j] = NewExcelLibrary.getCellData("Credentials", j, i + 2);
//			}
//		}
//		return data;
//	}
	
	
	
	
	
	@DataProvider(name = "credentials")
	public   Object[][] getCredentials() {
	
		// Totals rows count
		int rows = obj.getRowCount("Credentials"); // pass the sheet name ex:Credentials. getRowCount: it gets the row count 
		// Total Columns
		int column = obj.getColumnCount("Credentials");// pass the sheet name ex:Credentials. getRowCount: it gets the column  count 
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Credentials", j, i +2 ); 
			}
		}
		return data;
	}
	
}
