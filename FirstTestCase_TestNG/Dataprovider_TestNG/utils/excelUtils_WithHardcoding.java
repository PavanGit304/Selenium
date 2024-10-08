package utils;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excelUtils_WithHardcoding {

	static String projectpath;
	static XSSFWorkbook ExcelWBook;
	static XSSFSheet sheet;
	static int rowcount;
	static String cellData;



	public static void main(String []args) throws IOException {

		projectpath = System.getProperty("user.dir");//it directly locates the project ex: FirstTestCase
		//instead of this path use "user.dir" (or) E:\Selenium\eclipse\selenium_Workspace\FirstTestCase_TestNG\excel\data.xlsx
		ExcelWBook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet = ExcelWBook.getSheet("Sheet1");

		getRowCount();
		getCellData();
//		getCellDataNumber();  
	}

	public static void getRowCount() throws IOException{

		rowcount = sheet.getPhysicalNumberOfRows(); //or getLastRowNum()
		System.out.println("no of rows :" + rowcount);

	}

	public static void getCellData() throws IOException {
//getStringCellValue(): it prints string values (OR) To print numbers use apostrophe ex: '1234 instead of below code 
		
		cellData = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(cellData);

	}
	
	public static void getCellDataNumber() throws IOException {
		double cellDatanumber = sheet.getRow(0).getCell(0).getNumericCellValue();//getNumericCellValue(): it prints numbers or we need to use apostrophe ex: '1234
		System.out.println(cellDatanumber);

	}


}
