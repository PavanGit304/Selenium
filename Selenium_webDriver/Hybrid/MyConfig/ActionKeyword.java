package MyConfig;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.Constant;
import Utility.ExcelUtils;


public class ActionKeyword extends Baseclass{
//	public static WebDriver driver;
	
	public static Properties prop;
	public ActionKeyword(WebDriver driver) {
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
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver100\\chromedriver.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
		 driver= new ChromeDriver();
	}
	public static void openURL() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
	Thread.sleep(1000);
	}
	public static void input_Username(){
		  driver.findElement(By.id(prop.getProperty("LoginPage.UName"))).sendKeys("tumuku1993@gmail.com");  // userName 
	}
	public static void input_password(){
	driver.findElement(By.id(prop.getProperty("LoginPage.Pwd"))).sendKeys("Pavan304");   // password 
	}

	public static void ReInput_password() throws InterruptedException{
		driver.findElement(By.id(prop.getProperty("LoginPage.Re_pwd"))).sendKeys("Pavan304");   // password 	
	}
	public static void Click_signin() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id(prop.getProperty("LoginPage.signIn"))).click();
	}
	public static void waitFor() throws Exception{
	Thread.sleep(3000);
	}
	
	public static void dataDriven() throws Exception{
		String sPath = "E:\\Selenium\\eclipse\\selenium_Workspace\\Selenium_webDriver\\Hybrid\\DataDriven.xls";
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
			Thread.sleep(3000);
			WebElement cityname =driver.findElement(By.id(prop.getProperty("City.ID")));
			cityname.clear();
			iCity = E2.getCellData("datadriven", k, Constant.Col_City);		
			cityname.sendKeys(iCity);
			Thread.sleep(3000);
			WebElement emailaddre =driver.findElement(By.id(prop.getProperty("Email.ID")));
			emailaddre.clear();
			iEmail = E2.getCellData("datadriven", k, Constant.Col_Email);		
			emailaddre.sendKeys(iEmail);
	
	}
	}
//	public static void click_Next(){  // next button
//	driver.findElement(By.className("CwaK9")).click();
//	}
//	
    
	/*public static void movemasters()
     {
    	WebElement mnuMast=driver.findElement(By.xpath(".//*[@id='smoothmenu1']/ul/li[5]/a"));
        Actions act=new Actions(driver);
        act.moveToElement(mnuMast).build().perform();
      }
     
	public static void click_Logout()
	{
	driver.findElement (By.xpath(".//*[@id='logout']")).click();
	}*/
	public static void closeBrowser(){
	driver.close();
	}
	
}
