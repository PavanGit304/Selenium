package keyworddriven;

import org.apache.poi.ss.usermodel.Row;

public class DriverScript {
	
	
	public static void main(String[] args) throws Exception {

	String sPath = "C:\\Users\\PAVAN\\git\\Selenium_WebDriver\\Selenium_webDriver\\src\\keyworddriven\\keyworddriven.xls";   // Excel path 
	ExcelUtils.setExcelFile(sPath, "Sheet1"); 
	for (int iRow=1;iRow<=8;iRow++){
	String aActionKeyword = ExcelUtils.getCellData(sPath, iRow, 3);
	if(aActionKeyword.equals("openBrowser"))
	ActionKeyword.openBrowser();
	else if(aActionKeyword.equals("openURL"))
	ActionKeyword.openURL();
	else if(aActionKeyword.equals("input_Username"))
	ActionKeyword.input_Username();
	else if(aActionKeyword.equals("click_Next"))
		ActionKeyword.click_Next();
//	else if(sActionKeyword.equals("input_password"))
//	ActionKeyword.input_password();
//	else if(sActionKeyword.equals("waitFor"))
//	ActionKeyword.waitFor();
//	else if(sActionKeyword.equals("click_Login"))
//	ActionKeyword.click_Next();

	/*else if(sActionKeyword.equals("movemasters"))
		ActionKeyword.movemasters();
	else if(sActionKeyword.equals("click_Logout"))
	ActionKeyword.click_Logout();*/
	else if(aActionKeyword.equals("closeBrowser"))
	ActionKeyword.closeBrowser();
	}

}
}
