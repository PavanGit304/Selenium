package Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook DExcelWBook;
	private static XSSFSheet DExcelWSheet;
	private static int rows;
	private static XSSFCell Cell;
	
	public void setExcelFile(String purpose, String Path, String SheetName) throws Exception
	{
		
		FileInputStream ExcelFile=new FileInputStream(Path);
		if (purpose.equals("datadriven")){
			DExcelWBook = new XSSFWorkbook(ExcelFile);
			DExcelWSheet= DExcelWBook.getSheet(SheetName);
		}
		else{
			ExcelWBook = new XSSFWorkbook(ExcelFile);
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
