package Utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static HSSFWorkbook ExcelWBook;
	private static HSSFSheet ExcelWSheet;
	private static HSSFWorkbook DExcelWBook;
	private static HSSFSheet DExcelWSheet;
	private static int rows;
	private static HSSFCell Cell;
	

	
	
	public void setExcelFile(String purpose, String Path, String SheetName) throws Exception
	{
		
		FileInputStream ExcelFile=new FileInputStream(Path);
		if (purpose.equals("datadriven")){
			DExcelWBook = new HSSFWorkbook(ExcelFile);
			DExcelWSheet= DExcelWBook.getSheet(SheetName);
		}
		else{
			ExcelWBook = new HSSFWorkbook(ExcelFile);
			ExcelWSheet= ExcelWBook.getSheet(SheetName);
		}			
	}

	public int getLastRow(String purpose) throws Exception
	{
		if (purpose.equals("datadriven"))
			rows=DExcelWSheet.getLastRowNum();
		else
			rows=ExcelWSheet.getLastRowNum();
		return rows;
	}
	
	public String getCellData(String purpose,int RowNum, int ColNum) throws Exception
	{
		if (purpose.equals("datadriven"))
			Cell=DExcelWSheet.getRow(RowNum).getCell(ColNum);
		else
			Cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData=Cell.getStringCellValue();
		return CellData;
	}

}



// setExcelFile() method expecting values  and the values are passed in DriverScript 
//public static void setExcelFile(String Path, String SheetName) throws Exception{
//	FileInputStream ExcelFile=new FileInputStream(Path);
//	ExcelWBook = new HSSFWorkbook(ExcelFile);
//	ExcelWSheet= ExcelWBook.getSheet(SheetName);
//}
//
//public static String getCellData(String purpose, int RowNum, int ColNum) throws Exception{
//	Cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
//	String CellData=Cell.getStringCellValue();
//	return CellData;
//} 