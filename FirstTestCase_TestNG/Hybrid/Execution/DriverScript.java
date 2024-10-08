
package Execution;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import MyConfig.Action_keywords;
import Utility.ExcelUtils;

public class DriverScript {

	public static void main(String[] args) throws Exception {				
		String sPath = "E:\\Selenium\\eclipse\\selenium_Workspace\\FirstTestCase_TestNG\\Hybrid\\Keyworddriven.xlsx";
		ExcelUtils E1=new ExcelUtils();
		E1.setExcelFile("keyword",sPath, "Sheet1");
		int totRows=E1.getLastRow("keyword");
		String objPath="E:\\Selenium\\eclipse\\selenium_Workspace\\FirstTestCase_TestNG\\Hybrid\\hybrid.Properties";
		Action_keywords.setObjRepository(objPath);
		for (int iRow=1;iRow<=totRows;iRow++){			
			String sActionKeyword = E1.getCellData("keyword",iRow, 3);
			if(sActionKeyword.equals("openBrowser"))
				Action_keywords.openBrowser(); 
			else if(sActionKeyword.equals("openURL"))				
				Action_keywords.openURL();
			else if(sActionKeyword.equals("input_Username"))
				Action_keywords.input_Username();
			else if(sActionKeyword.equals("input_password"))
				Action_keywords.input_password();
			else if(sActionKeyword.equals("input_Re_password"))
				Action_keywords.input_password();
			else if(sActionKeyword.equals("click_Submit"))
				Action_keywords.click_Submit();
			else if(sActionKeyword.equals("waitFor"))
				Action_keywords.waitFor();
			else if(sActionKeyword.equals("dataDriven"))
				Action_keywords.dataDriven();
//			else if(sActionKeyword.equals("click_Logout"))
//				Action_keywords.click_Logout();
			else if(sActionKeyword.equals("closeBrowser"))
				Action_keywords.closeBrowser();
		}
	}
}
