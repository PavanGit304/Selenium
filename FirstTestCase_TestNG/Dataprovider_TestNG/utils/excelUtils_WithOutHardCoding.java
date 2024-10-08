package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.inject.PrivateBinder;


public class excelUtils_WithOutHardCoding {
	
	public FileInputStream file = null;
	private XSSFWorkbook ExcelWBook =null;
	private static XSSFSheet sheet = null;
	static int rowcount =0;
	static int colCount =0;
	static String cellData =null;
	
//	static XSSFWorkbook ExcelWBook;
//	static XSSFSheet sheet;
//	static int rowcount =0;
//	static int colCount =0;
//	static String cellData =null;
	
	
	public excelUtils_WithOutHardCoding(String  excelPath, String sheetName) {
		try {
			
			file = new FileInputStream(excelPath);
        ExcelWBook = new XSSFWorkbook(file);
		sheet = ExcelWBook.getSheet(sheetName);
		}
		catch (Exception e) {
			e.getMessage();
			e.getCause(); 
		}
	}
	

	public int getRowCount() throws IOException{
		rowcount = sheet.getPhysicalNumberOfRows(); //or getLastRowNum()
		System.out.println("no of rows :" + rowcount);
		return rowcount;
	}
	
	public int getColCount() throws IOException{
		 colCount = sheet.getRow(0).getPhysicalNumberOfCells(); 
		System.out.println("no of col :" + colCount);
		return colCount;
	}
	
	public static  String getCellData(int rowNum,int colNum ) throws IOException {
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//getStringCellValue(): it prints string values (OR) To print numbers use apostrophe ex: '1234 instead of below code 

		return cellData;
	}
}
