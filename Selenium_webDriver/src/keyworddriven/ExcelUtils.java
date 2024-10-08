package keyworddriven;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {

	private static HSSFWorkbook ExcelWBook;
	private static HSSFSheet ExcelWSheet;	
	private static HSSFCell Cell;// record 
//	public static int row =ExcelWSheet.getLastRowNum();
	
	// setExcelFile() method expecting values  and the values are passed in DriverScript 
	public static void setExcelFile(String Path, String SheetName) throws Exception{
		FileInputStream ExcelFile=new FileInputStream(Path);
		ExcelWBook = new HSSFWorkbook(ExcelFile);
		ExcelWSheet= ExcelWBook.getSheet(SheetName);
	
	}
	
	public static String getCellData(String purpose, int RowNum, int ColNum) throws Exception{
		Cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData= Cell.getStringCellValue();// read data from Excel files and it get the value of a cell in an Excel sheet as a String.
		return CellData;
	} 
}
