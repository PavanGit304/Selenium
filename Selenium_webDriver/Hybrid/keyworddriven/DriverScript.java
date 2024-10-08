package keyworddriven;

public class DriverScript {
	
	
	public static void main(String[] args) throws Exception 
	{

	String sPath = "E:\\Selenium\\eclipse\\selenium_Workspace\\Selenium_webDriver\\src\\keyworddriven\\keyworddriven.xls";   // Excel path 
	ExcelUtils.setExcelFile(sPath, "Sheet1"); 
	for (int iRow=1;iRow<=7;iRow++){
	String sActionKeyword = ExcelUtils.getCellData(sPath, iRow, 3);
	if(sActionKeyword.equals("openBrowser"))
	ActionKeyword.openBrowser();
	else if(sActionKeyword.equals("openURL"))
	ActionKeyword.openURL();
	else if(sActionKeyword.equals("input_Username"))
	ActionKeyword.input_Username();
	else if(sActionKeyword.equals("input_password"))
	ActionKeyword.input_password();
	else if(sActionKeyword.equals("ReInput_password"))
		ActionKeyword.input_password();

	else if(sActionKeyword.equals("waitFor"))
	ActionKeyword.waitFor();
	else if(sActionKeyword.equals("click_Login"))
	ActionKeyword.click_Next();

	/*else if(sActionKeyword.equals("movemasters"))
		ActionKeyword.movemasters();
	else if(sActionKeyword.equals("click_Logout"))
	ActionKeyword.click_Logout();*/
	else if(sActionKeyword.equals("closeBrowser"))
	ActionKeyword.closeBrowser();
	}

}
}
