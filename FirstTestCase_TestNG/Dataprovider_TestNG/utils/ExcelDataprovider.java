package utils;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataprovider {
//	WebDriver driver;
//	@BeforeTest
//	public void setUpTest() {
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//
//	@Test(dataProvider = "test1data")
//	public void test1(String uname, String pwd) {
//		
////	System.out.println(username +"|"+password);
//		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("firstname")).sendKeys(uname);
//		driver.findElement(By.name("lastname")).sendKeys(pwd);
//}
	
	public static Object[][] testData(String excelPath, String sheetName) throws IOException {
		excelUtils_WithOutHardCoding excel = new excelUtils_WithOutHardCoding(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount]; // 1st row is headings so that we removing 1st row thats why using -1 so the data is taking from 2nd row 
		
		for(int i=1; i<rowCount; i++) {  // it itrates  rows
			for(int j=0;j<colCount; j++) { //it itrates column 
				String cellData =excelUtils_WithOutHardCoding.getCellData(i, j);
//				System.out.println(cellData);
				data[i-1][j] =cellData;
			}
		}
		return data; 
	}
	
	@DataProvider(name ="test1data")
	public static Object[][] getData() throws IOException { //object[][] it is 2d object array for calling all data using data provider 
		String excelPath ="E:\\Selenium\\eclipse\\selenium_Workspace\\FirstTestCase_TestNG\\excel\\data.xlsx";
		return testData(excelPath, "Sheet1"); // it returns below method
	}
}
