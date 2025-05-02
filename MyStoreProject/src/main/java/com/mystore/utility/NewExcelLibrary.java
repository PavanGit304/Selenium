package com.mystore.utility;

	import java.io.File;
import java.io.FileInputStream;  
	import java.io.FileOutputStream;
    import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFCellStyle;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
    import org.checkerframework.common.value.qual.StaticallyExecutable;
	import org.apache.poi.ss.usermodel.Cell;

	public class NewExcelLibrary {
		
	    // Path to the Excel file (with File.separator to ensure compatibility across OS)
	    String TEST_DATA_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "TestData" + File.separator + "TestData.xlsx";
//		 String TEST_DATA_PATH = System.getProperty("user.dir")+ "/src/test/resources/TestData/TestData.xlsx";
		private static final Logger logger = LogManager.getLogger(NewExcelLibrary.class);
//		private static final String TEST_DATA_PATH = ConfigManager.get("excel.path");
		private XSSFWorkbook workbook;

		public NewExcelLibrary() {
//			try (FileInputStream fis = new FileInputStream(TEST_DATA_PATH)) {
//				workbook = new XSSFWorkbook(fis);
//			} catch (IOException e) {
//				e.printStackTrace();
//				 throw new RuntimeException("Failed to load Excel at: " + TEST_DATA_PATH, e);
//			}
			
			try {
	            // First try loading from test resources
	            InputStream input = getClass().getClassLoader()
	                    .getResourceAsStream("TestData/TestData.xlsx");
	            
	            if (input == null) {
	                // Fallback to absolute path if running tests directly from IDE
//	                String excelPath = System.getProperty("user.dir") + "/src/test/resources/TestData/TestData.xlsx";
	                input = new FileInputStream(TEST_DATA_PATH);
	            }
	            
//	            if (input == null) {
//	                throw new RuntimeException("TestData.xlsx not found in classpath");
//	            }
	            
	            workbook = new XSSFWorkbook(input);
	        } catch (IOException e) {
	            logger.error("Failed to load Excel file", e);
	            throw new RuntimeException("Failed to initialize Excel library", e);
	        }
			
		}

		public int getRowCount(String sheetName) { //✅ It counts only the rows with real data in the Excel sheet, skipping empty rows
			
			 XSSFSheet sheet = workbook.getSheet(sheetName);
			    return sheet.getLastRowNum(); // Directly get physical rows
		
			    
//		    XSSFSheet sheet = workbook.getSheet(sheetName);
//		    if (sheet == null) return 0;
//
//		    int count = 0;
//		    for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Skipping header row (0)
//		        XSSFRow row = sheet.getRow(i);
//		        if (row != null) {
//		            boolean hasData = false;
//		            for (int j = 0; j < row.getLastCellNum(); j++) {
//		                XSSFCell cell = row.getCell(j);
//		                // Check if any cell has a non-empty value
//		                if (cell != null && !getCellFormattedValue(cell).trim().isEmpty()) {
//		                    hasData = true;
//		                    break;
//		                }
//		            }
//		            if (hasData) {
//		                count++;
//		            }
//		        }
//		    }
//		    return count;
		}

		
		
		
		
		// New overloaded method to get cell data using column index
		public String getCellData(String sheetName, int colIndex, int rowNum) {
			if (rowNum <= 0)
				return "";

			XSSFSheet sheet = workbook.getSheet(sheetName);
			if (sheet == null)
				return "";

			XSSFRow row = sheet.getRow(rowNum - 1);
			if (row == null)
				return "";

			XSSFCell cell = row.getCell(colIndex);
			return getCellFormattedValue(cell);
		}

		public String getCellData(String sheetName, String colName, int rowNum) {
			if (rowNum <= 0)
				return "";

			XSSFSheet sheet = workbook.getSheet(sheetName);
			if (sheet == null)
				return "";

			XSSFRow header = sheet.getRow(0);
			if (header == null)
				return "";

			int colNum = -1;
			for (int i = 0; i < header.getLastCellNum(); i++) {
				if (header.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
					colNum = i;
					break;
				}
			}

			if (colNum == -1)
				return "";

			XSSFRow row = sheet.getRow(rowNum - 1);
			if (row == null)
				return "";

			XSSFCell cell = row.getCell(colNum);
			return getCellFormattedValue(cell);
		}

		public boolean setCellData(String sheetName, String colName, int rowNum, String data) {
			try (FileInputStream fis = new FileInputStream(TEST_DATA_PATH);
					FileOutputStream fileOut = new FileOutputStream(TEST_DATA_PATH)) {

				workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet(sheetName);
				if (sheet == null || rowNum <= 0)
					return false;

				XSSFRow header = sheet.getRow(0);
				int colNum = -1;
				for (int i = 0; i < header.getLastCellNum(); i++) {
					if (header.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
						colNum = i;
						break;
					}
				}
				if (colNum == -1)
					return false;

				XSSFRow row = sheet.getRow(rowNum - 1);
				if (row == null)
					row = sheet.createRow(rowNum - 1);

				XSSFCell cell = row.getCell(colNum);
				if (cell == null)
					cell = row.createCell(colNum);

				cell.setCellValue(data);
				workbook.write(fileOut);

				return true;

			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}

		private String getCellFormattedValue(Cell cell) {
			if (cell == null)
				return "";

			switch (cell.getCellType()) {
			case STRING:
				return cell.getStringCellValue();
			case NUMERIC:
			case FORMULA:
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					Calendar cal = Calendar.getInstance();
					cal.setTime(cell.getDateCellValue());
					return String.format("%d/%d/%d", cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) + 1,
							cal.get(Calendar.YEAR) % 100);
				} else {
					return String.valueOf(cell.getNumericCellValue());
				}
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case BLANK:
				return "";
			default:
				return "";
			}
		}

		public boolean isSheetExist(String sheetName) {
			return workbook.getSheet(sheetName) != null || workbook.getSheet(sheetName.toUpperCase()) != null;
		}

		public int getColumnCount(String sheetName) {
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow row = (sheet != null) ? sheet.getRow(0) : null;
			return (row != null) ? row.getLastCellNum() : -1;
		}

		public int getCellRowNum(String sheetName, String colName, String cellValue) {
			for (int i = 2; i <= getRowCount(sheetName); i++) {
				if (getCellData(sheetName, colName, i).equalsIgnoreCase(cellValue)) {
					return i;
				}
			}
			return -1;
		}

	}



		
		
		
/*
 * 
new code explanation  

📌 Constructor:  public NewExcelLibrary()
Why: Loads the Excel workbook when the class is initialized.
Where: Called automatically when creating a new object of this class.
 
 📘 getRowCount(String sheetName)
What: Returns the total number of rows in a sheet.
Why: Useful for looping through rows during data-driven testing.

📗 getCellData(String sheetName, String colName, int rowNum)
What: Gets data from a specific cell using column name.
Why: Ideal when reading test data based on headers.

📙 getCellData(String sheetName, int colNum, int rowNum)
What: Gets cell data using column index.
Why: Use when headers aren't available or you're looping by index.

✍️ setCellData(String sheetName, String colName, int rowNum, String data)
What: Writes data into a specific cell.
Why: Useful for writing test results like “PASS/FAIL” back to Excel.

➕ addSheet(String sheetName)
What: Creates a new sheet.
Why: For separating data for different test scenarios.

➖ removeSheet(String sheetName)
What: Deletes a sheet from the Excel file.
Why: Housekeeping or cleanup after testing.

➕ addColumn(String sheetName, String colName)
What: Adds a new column (header) in the sheet.
Why: Dynamic data structure – e.g., adding “Result” column.

❌ removeColumn(String sheetName, int colNum)
What: Deletes a specific column.
Why: Remove outdated or irrelevant columns.

✅ isSheetExist(String sheetName)
What: Checks if a sheet exists.
Why: Avoid errors when reading/writing to a non-existent sheet.

🔢 getColumnCount(String sheetName)
What: Returns number of columns in the first row (header).
Why: Useful when looping through columns.

🔍 getCellRowNum(String sheetName, String colName, String cellValue)
What: Finds row number of a cell that contains specific value.
Why: For mapping or locating data in large sheets.
 
 
 
 
 
 
****************************************changes to old to new code ****************************************************
  
 
 
Add missing methods (e.g., add/remove sheets or columns)

Implement better exception handling/logging

Convert it into a utility class with static methods

Use Apache POI streaming for large Excel files
 
 
 
 
 
 
 *********************************************************  Old Code   ***************************************************************************
 
 //		public static String TEST_DATA_PATH = "E:\\Selenium\\eclipse\\MyStoreProject\\src\\test\\resources\\resources\\TestData\\TestData.xlsx";		
		private static final String TEST_DATA_PATH = System.getProperty("user.dir") + "/src/test/resources/TestData/TestData.xlsx"; //user.dir : it gets the project directory ex:MyStoreProject
		
		public FileInputStream fis = null;
		public FileOutputStream fileOut = null;
//		private String path;
		private XSSFWorkbook workbook = null;
		private XSSFSheet sheet = null;
		private XSSFRow row = null;
		private XSSFCell cell = null;

		public NewExcelLibrary() {
//			this.path=path;
			try {
				fis = new FileInputStream(TEST_DATA_PATH);
				workbook = new XSSFWorkbook(fis);
				sheet = workbook.getSheetAt(0);
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

//		public NewExcelLibrary(String path) {
//
//			 this.path = path;
//			try {
//				fis = new FileInputStream(path);
//				workbook = new XSSFWorkbook(fis);
//				sheet = workbook.getSheetAt(0);
//				fis.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		// returns the row count in a sheet
		public int getRowCount(String sheetName) {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1)
				return 0;
			else {
				sheet = workbook.getSheetAt(index);
				int number = sheet.getLastRowNum() + 1;
				return number;
			}
		}

		public String getCellData(String sheetName, String colName, int rowNum) {
			try {
				if (rowNum <= 0)
					return "";

				int index = workbook.getSheetIndex(sheetName);
				int col_Num = -1;
				if (index == -1)
					return "";

				sheet = workbook.getSheetAt(index);
				row = sheet.getRow(0);
				for (int i = 0; i < row.getLastCellNum(); i++) {
					// System.out.println(row.getCell(i).getStringCellValue().trim());
					if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
						col_Num = i;
				}
				if (col_Num == -1)
					return "";

				sheet = workbook.getSheetAt(index);
				row = sheet.getRow(rowNum - 1);
				if (row == null)
					return "";
				cell = row.getCell(col_Num);

				if (cell == null)
					return "";
				// System.out.println(cell.getCellType());
				if (cell.getCellType().name().equals("STRING"))
					return cell.getStringCellValue();
				else if (cell.getCellType().name().equals("NUMERIC") || cell.getCellType().name().equals("FORMULA")) {

					String cellText = String.valueOf(cell.getNumericCellValue());
					if (HSSFDateUtil.isCellDateFormatted(cell)) {
						// format in form of M/D/YY
						double d = cell.getNumericCellValue();

						Calendar cal = Calendar.getInstance();
						cal.setTime(HSSFDateUtil.getJavaDate(d));
						cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
						cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cellText;

						// System.out.println(cellText);

					}

					return cellText;
				} else if (cell.getCellType().name().equals("BLANK"))
					return "";
				else
					return String.valueOf(cell.getBooleanCellValue());

			} catch (Exception e) {

				e.printStackTrace();
				return "row " + rowNum + " or column " + colName + " does not exist in xls";
			}
		}

		// returns the data from a cell
		public String getCellData(String sheetName, int colNum, int rowNum) {
			try {
				if (rowNum <= 0)
					return "";

				int index = workbook.getSheetIndex(sheetName);

				if (index == -1)
					return "";

				sheet = workbook.getSheetAt(index);
				row = sheet.getRow(rowNum - 1);
				if (row == null)
					return "";
				cell = row.getCell(colNum);
				if (cell == null)
					return "";

				if (cell.getCellType().name().equals("STRING"))
					return cell.getStringCellValue();
				else if (cell.getCellType().name().equals("NUMERIC") || cell.getCellType().name().equals("FORMULA")) {

					String cellText = String.valueOf(cell.getNumericCellValue());
					if (HSSFDateUtil.isCellDateFormatted(cell)) {
						// format in form of M/D/YY
						double d = cell.getNumericCellValue();

						Calendar cal = Calendar.getInstance();
						cal.setTime(HSSFDateUtil.getJavaDate(d));
						cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
						cellText = cal.get(Calendar.MONTH) + 1 + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + cellText;

						// System.out.println(cellText);

					}

					return cellText;
				} else if (cell.getCellType().name().equals("BLANK"))
					return "";
				else
					return String.valueOf(cell.getBooleanCellValue());
			} catch (Exception e) {

				e.printStackTrace();
				return "row " + rowNum + " or column " + colNum + " does not exist  in xls";
			}
		}

		// returns true if data is set successfully else false
		public boolean setCellData(String sheetName, String colName, int rowNum, String data) {
			try {
				fis = new FileInputStream(TEST_DATA_PATH);
				workbook = new XSSFWorkbook(fis);

				if (rowNum <= 0)
					return false;

				int index = workbook.getSheetIndex(sheetName);
				int colNum = -1;
				if (index == -1)
					return false;

				sheet = workbook.getSheetAt(index);

				row = sheet.getRow(0);
				for (int i = 0; i < row.getLastCellNum(); i++) {
					// System.out.println(row.getCell(i).getStringCellValue().trim());
					if (row.getCell(i).getStringCellValue().trim().equals(colName))
						colNum = i;
				}
				if (colNum == -1)
					return false;

				sheet.autoSizeColumn(colNum);
				row = sheet.getRow(rowNum - 1);
				if (row == null)
					row = sheet.createRow(rowNum - 1);

				cell = row.getCell(colNum);
				if (cell == null)
					cell = row.createCell(colNum);

				// cell style
				// CellStyle cs = workbook.createCellStyle();
				// cs.setWrapText(true);
				// cell.setCellStyle(cs);
				cell.setCellValue(data);

				fileOut = new FileOutputStream(TEST_DATA_PATH);

				workbook.write(fileOut);

				fileOut.close();

			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		// returns true if sheet is created successfully else false
		public boolean addSheet(String sheetname) {

			FileOutputStream fileOut;
			try {
				workbook.createSheet(sheetname);
				fileOut = new FileOutputStream(TEST_DATA_PATH);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		// returns true if sheet is removed successfully else false if sheet does not
		// exist
		public boolean removeSheet(String sheetName) {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1)
				return false;

			FileOutputStream fileOut;
			try {
				workbook.removeSheetAt(index);
				fileOut = new FileOutputStream(TEST_DATA_PATH);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		// returns true if column is created successfully
		public boolean addColumn(String sheetName, String colName) {
			// System.out.println("**************addColumn*********************");

			try {
				fis = new FileInputStream(TEST_DATA_PATH);
				workbook = new XSSFWorkbook(fis);
				int index = workbook.getSheetIndex(sheetName);
				if (index == -1)
					return false;

				XSSFCellStyle style = workbook.createCellStyle();
				// style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
				// style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

				sheet = workbook.getSheetAt(index);

				row = sheet.getRow(0);
				if (row == null)
					row = sheet.createRow(0);

				// cell = row.getCell();
				// if (cell == null)
				// System.out.println(row.getLastCellNum());
				if (row.getLastCellNum() == -1)
					cell = row.createCell(0);
				else
					cell = row.createCell(row.getLastCellNum());

				cell.setCellValue(colName);
				cell.setCellStyle(style);

				fileOut = new FileOutputStream(TEST_DATA_PATH);
				workbook.write(fileOut);
				fileOut.close();

			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}

			return true;

		}

		// removes a column and all the contents
		public boolean removeColumn(String sheetName, int colNum) {
			try {
				if (!isSheetExist(sheetName))
					return false;
				fis = new FileInputStream(TEST_DATA_PATH);
				workbook = new XSSFWorkbook(fis);
				sheet = workbook.getSheet(sheetName);
				XSSFCellStyle style = workbook.createCellStyle();
				// style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
				// XSSFCreationHelper createHelper = workbook.getCreationHelper();
				// style.setFillPattern(HSSFCellStyle.NO_FILL);

				for (int i = 0; i < getRowCount(sheetName); i++) {
					row = sheet.getRow(i);
					if (row != null) {
						cell = row.getCell(colNum);
						if (cell != null) {
							cell.setCellStyle(style);
							row.removeCell(cell);
						}
					}
				}
				fileOut = new FileOutputStream(TEST_DATA_PATH);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;

		}

		// find whether sheets exists
		public boolean isSheetExist(String sheetName) {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1) {
				index = workbook.getSheetIndex(sheetName.toUpperCase());
				if (index == -1)
					return false;
				else
					return true;
			} else
				return true;
		}

		// returns number of columns in a sheet
		public int getColumnCount(String sheetName) {
			// check if sheet exists
			if (!isSheetExist(sheetName))
				return -1;

			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(0);

			if (row == null)
				return -1;

			return row.getLastCellNum();

		}

		public int getCellRowNum(String sheetName, String colName, String cellValue) {

			for (int i = 2; i <= getRowCount(sheetName); i++) {
				if (getCellData(sheetName, colName, i).equalsIgnoreCase(cellValue)) {
					return i;
				}
			}
			return -1;

		}
 
 * */
