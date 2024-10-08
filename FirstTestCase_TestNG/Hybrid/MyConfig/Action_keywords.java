package MyConfig;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utility.Constant;
import Utility.ExcelUtils;

public class Action_keywords extends BaseClass {
	
	public static Properties prop;
	public Action_keywords(WebDriver driver) {
		super(driver);
	}

	public static void setObjRepository(String Path) throws Exception{	
	File fn = new File(Path);
	prop = new Properties();
	FileInputStream objInput = new FileInputStream(fn);		
	prop.load(objInput);
	objInput.close();
	}

	public static void openBrowser(){
		driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	public static void openURL() throws InterruptedException{
		driver.get(prop.getProperty("URL"));
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void input_Username(){
		driver.findElement(By.id(prop.getProperty("LoginPage.UName"))).sendKeys("pavan");		
	}
	
	public static void input_password(){
		driver.findElement(By.id(prop.getProperty("LoginPage.Pwd"))).sendKeys("123456");
	}
	
	public static void input_Re_password(){
		driver.findElement(By.id(prop.getProperty("LoginPage.Pwd"))).sendKeys("123456");
	}
	public static void click_Submit(){
		driver.findElement(By.id(prop.getProperty("LoginPage.signIn"))).click();
	}
	
//	public static void click_Rest(){
//		driver.findElement(By.id(prop.getProperty("Rest.ID"))).click();
//	}
	
	public static void waitFor() throws Exception{
		Thread.sleep(5000);
	}
	
	public static void dataDriven() throws Exception{
		String sPath = "E:\\Selenium\\eclipse\\selenium_Workspace\\FirstTestCase_TestNG\\Hybrid\\DataDriven.xlsx";
		 ExcelUtils E2=new  ExcelUtils();
		E2.setExcelFile("datadriven",sPath, "Sheet1");
		int dataRows=E2.getLastRow("datadriven");
		String iName;
		String iCity;
		String iEmail;
		
		for(int k=1;k<=dataRows;k++){					
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement Name=driver.findElement(By.id(prop.getProperty("Name.ID")));
			Name.clear();
			iName = E2.getCellData("datadriven", k, Constant.Col_Name);
			Name.sendKeys(iName);
			
			WebElement cityname =driver.findElement(By.id(prop.getProperty("City.ID")));
			cityname.clear();
			iCity = E2.getCellData("datadriven", k, Constant.Col_City);		
			cityname.sendKeys(iCity);
			
			WebElement emailaddre =driver.findElement(By.id(prop.getProperty("Email.ID")));
			emailaddre.clear();
			iEmail = E2.getCellData("datadriven", k, Constant.Col_Email);		
			emailaddre.sendKeys(iEmail);
			
			WebElement sub=driver.findElement(By.id(prop.getProperty("Submit.ID")));
			sub.click();
		}		
	}
		
//	public static void click_Logout(){
//		driver.findElement(By.xpath(prop.getProperty("Logout"))).click();
//	}
	
	public static void closeBrowser(){
		driver.close();
	}
}
