package Execution;


import MyConfig.ActionKeyword;
import Utility.ExcelUtils;


public class DriverScript {
	
	public static void main(String[] args) throws Exception {
	String sPath = "E:\\Selenium\\eclipse\\selenium_Workspace\\Selenium_webDriver\\Hybrid\\Actionkeyword.xls";   // Excel path 
	ExcelUtils E1 = new ExcelUtils();
	E1.setExcelFile("keyword",sPath, "Sheet1"); 
	int totalRow= E1.getLastRow("keyword");
	String objPath="E:\\Selenium\\eclipse\\selenium_Workspace\\Selenium_webDriver\\Hybrid\\Hybrid.Properties";
	ActionKeyword.setObjRepository(objPath);
	for (int iRow=1;iRow<=totalRow;iRow++){
	String sActionKeyword = E1.getCellData(sPath, iRow, 3);
	if(sActionKeyword.equals("openBrowser"))
	ActionKeyword.openBrowser();
	else if(sActionKeyword.equals("openURL"))
	ActionKeyword.openURL();
	else if(sActionKeyword.equals("input_Username"))
	ActionKeyword.input_Username();
	else if(sActionKeyword.equals("input_password"))
	ActionKeyword.input_password();
	else if(sActionKeyword.equals("ReInput_password"))
		ActionKeyword.ReInput_password();
	else if(sActionKeyword.equals("Click_signin"))
		ActionKeyword.Click_signin();
	else if(sActionKeyword.equals("waitFor"))
	ActionKeyword.waitFor();
	else if(sActionKeyword.equals("dataDriven"))
		ActionKeyword.dataDriven();
	
	/*else if(sActionKeyword.equals("movemasters"))
		ActionKeyword.movemasters();
	else if(sActionKeyword.equals("click_Logout"))
	ActionKeyword.click_Logout();*/
	else if(sActionKeyword.equals("closeBrowser"))
	ActionKeyword.closeBrowser();
	}

}
}
