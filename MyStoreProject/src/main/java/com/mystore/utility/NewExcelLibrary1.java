package com.mystore.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelLibrary1 {

	
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private static XSSFWorkbook workbook = null;
	private static XSSFSheet sheet = null;
	private static XSSFRow row = null;
	private static XSSFCell cell = null;
	
	public NewExcelLibrary1(String  path) {

//		this.path=path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// returns the row count in a sheet
	public int getRowCount(String sheetName){
					int index = workbook.getSheetIndex(sheetName);
					if(index==-1)
						return 0;
					else{
					sheet = workbook.getSheetAt(index);
					int number=sheet.getLastRowNum()+1;
					return number;
					}
				}
	// find whether sheets exists	
    public boolean isSheetExist(String sheetName){
					int index = workbook.getSheetIndex(sheetName);
					if(index==-1){
						index=workbook.getSheetIndex(sheetName.toUpperCase());
							if(index==-1)
								return false;
							else
								return true;
					}
					else
						return true;
				}
				
	// returns number of columns in a sheet	
	public int getColumnCount(String sheetName){
					// check if sheet exists
					if(!isSheetExist(sheetName))
					 return -1;
					
					sheet = workbook.getSheet(sheetName);
					row = sheet.getRow(0);
					
					if(row==null)
						return -1;
					
					return row.getLastCellNum();
					
				}
				
				// returns the data from a cell
				public static String getCellData(String sheetName,int colNum,int rowNum){
					try{
						if(rowNum <=0)
							return "";
					
					int index = workbook.getSheetIndex(sheetName);

					if(index==-1)
						return "";
					
				
					sheet = workbook.getSheetAt(index);
					row = sheet.getRow(rowNum-1);
					if(row==null)
						return "";
					cell = row.getCell(colNum);
					if(cell==null)
						return "";
					
				  if(cell.getCellType().name().equals("STRING"))
					  return cell.getStringCellValue();
				  else if(cell.getCellType().name().equals("NUMERIC") || cell.getCellType().name().equals("FORMULA") ){
					  
					  String cellText  = String.valueOf(cell.getNumericCellValue());
					  if (HSSFDateUtil.isCellDateFormatted(cell)) {
				           // format in form of M/D/YY
						  double d = cell.getNumericCellValue();

						  Calendar cal =Calendar.getInstance();
						  cal.setTime(HSSFDateUtil.getJavaDate(d));
				            cellText =
				             (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
				           cellText = cal.get(Calendar.MONTH)+1 + "/" +
				                      cal.get(Calendar.DAY_OF_MONTH) + "/" +
				                      cellText;
				           
				          // System.out.println(cellText);

				         }

					  
					  
					  return cellText;
				  }else if(cell.getCellType().name().equals("BLANK"))
				      return "";
				  else 
					  return String.valueOf(cell.getBooleanCellValue());
					}
					catch(Exception e){
						
						e.printStackTrace();
						return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
					}
				}
}
