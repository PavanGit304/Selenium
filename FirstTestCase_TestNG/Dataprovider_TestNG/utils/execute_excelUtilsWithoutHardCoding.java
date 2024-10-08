package utils;

import java.io.IOException;

public class execute_excelUtilsWithoutHardCoding {
	
	public static void main(String[]args) throws IOException {
		String projectpath = System.getProperty("user.dir");//it directly locates the project ex: FirstTestCase
		excelUtils_WithOutHardCoding excel = new excelUtils_WithOutHardCoding(projectpath+"/excel/data.xlsx", "Sheet1");
	
		excel.getRowCount();
		excel.getCellData(1, 1); // passing the row and column values 
		
	
	}

}
