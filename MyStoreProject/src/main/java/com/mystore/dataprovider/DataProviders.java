package com.mystore.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.mystore.utility.NewExcelLibrary;
import com.mystore.utility.NewExcelLibrary1;

public class DataProviders {

	private static final String SHEET_NAME = "Credentials";

//Loading the Data from Excel: using newEcelLibrary
    @DataProvider(name = "credentials")
    public Object[][] getCredentialsData() {
    	try {
            NewExcelLibrary excel = new NewExcelLibrary();
            return fetchData(excel, SHEET_NAME);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load test data", e);
        }
    }
    

    private Object[][] fetchData(NewExcelLibrary excel, String sheetName) {
    	   // Validate sheet exists
        if (!excel.isSheetExist(sheetName)) {
            throw new IllegalArgumentException("Sheet '" + sheetName + "' not found in Excel file");
        }
    	
        int rowCount = excel.getRowCount(sheetName);
        int colCount = excel.getColumnCount(sheetName);
        
        
     // Debugging: print row and column count
        System.out.println("Sheet Name: " + SHEET_NAME +"\n" + "Row Count: " + rowCount +"\n"+ "Column Count: " + colCount);

        
        Object[][] data = new Object[rowCount - 1][colCount];// Skipping header row

        for (int i =1; i < rowCount ; i++) {// Loop through the rows and columns to fetch data
            for (int j = 0; j < colCount; j++) {	
                data[i-1][j] = excel.getCellData(sheetName, j, i + 1); // i+1 to fetch the correct row from Excel
                
                // Debugging: print each cell's value
//                System.out.print("Row " + (i + 2) + ", Col " + (j + 1) + ": " + data[i][j] + " | ");
            }  
        }
        return data;
    }
	
}








/*

This code provides test data from an Excel sheet to TestNG tests using a DataProvider.

It reads data from the "Credentials" sheet in the Excel file.
The fetchData() method stores the data in a 2D array and returns it.
The data is then used in the test methods with the @DataProvider(name = "credentials") annotation.



Brief explanation 


DataProvider: The @DataProvider annotation is used to provide the test data. It’s named "credentials" and fetches data from an Excel sheet.

Excel Path: The path to the Excel file (TestData.xlsx) is stored in a constant (EXCEL_PATH).

Data Fetching: The getCredentialsData() method calls fetchData() to read data from the "Credentials" sheet.

fetchData() Method:
It uses the NewExcelLibrary class to get row and column counts.
It then reads the data (skipping the header) and stores it in a 2D array (Object[][]).

Test Method Usage: The test method can use the @DataProvider(name = "credentials") to get each set of credentials (username, password) from the Excel sheet.











**************************************************Old Code *******************************************************


NewExcelLibrary  obj = new NewExcelLibrary();
	
	@DataProvider(name ="credentials")
	public static Object[][] getData() throws IOException { //object[][] it is 2d object array for calling all data using data provider 
		String path ="E:\\Selenium\\eclipse\\MyStoreProject\\src\\test\\resources\\TestData\\TestData.xlsx";
		return getCredentials(path);
	}
	
	
	public static  Object[][] getCredentials(String path) {
		NewExcelLibrary  obj = new NewExcelLibrary(path);
		// Totals rows count
		int rows = obj.getRowCount("Credentials"); // pass the sheet name ex:Credentials. getRowCount: it gets the row count 
		// Total Columns
		int column = obj.getColumnCount("Credentials");// pass the sheet name ex:Credentials. getRowCount: it gets the column  count 
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = NewExcelLibrary.getCellData("Credentials", j, i + 2);	
			}
		}
		return data;
	}
	
	
	
	
	
//	@DataProvider(name = "credentials")
//	public   Object[][] getCredentials() {
//	
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
//				data[i][j] = obj.getCellData("Credentials", j, i +2 ); 
//			}
//		}
//		return data;
//	}


 * */
