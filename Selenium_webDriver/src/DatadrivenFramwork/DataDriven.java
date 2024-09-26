package DatadrivenFramwork;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DataDriven {
	public static void main (String [] args) throws InterruptedException{
	
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver127\\chromedriver-win64\\chromedriver.exe");  
		WebDriver z= new ChromeDriver();
	    z.manage().window().maximize(); 	
		Thread.sleep(1000);
		try {
			FileInputStream f= new FileInputStream("E:\\Selenium\\selenium_docx\\datadriven.xls");    // it is used for reading data/Excel file such as image data , audio ,video,file..etc
			//XSSFWorkbook wb = new XSSFWorkbook(f);
			HSSFWorkbook wb = new HSSFWorkbook(f);
			HSSFSheet s = wb.getSheet("Sheet1");
			String url ;
			String fname ;
			String lname ;
			
			for(int i=1 ; i<=s.getLastRowNum(); i++)     // s.getLastRowNum();  it fetch the data until last row in sheet 
			{   
				HSSFRow r= s.getRow(i);      //  it gets the rows from sheet
				url = r.getCell(0).toString();  // getCell(0)  it gets the cell data
				z.get(url);
				WebElement username = z.findElement(By.name("identifier"));  // userName 
				username.clear();
				fname = r.getCell(1).toString();  // getCell(1)  it gets the cell data
				username.sendKeys(fname);
				Thread.sleep(2000);
				WebElement next_btn = z.findElement(By.xpath("//*[contains(@type,'button')]"));  //click 
				next_btn.click();					
				Thread.sleep(1000);
			
//				WebElement password = z.findElement(By.name("password"));  //  password 
//				password.clear();
//				lname = r.getCell(2).toString();
//				password.sendKeys(lname);	
				//WebElement pw = z.findElement(By.className("CwaK9"));
				//pw.click();
			
//			    z.close ();
					
			}
			f.close();
		} 
		catch (Exception ex) {
			System.out.println(ex);
		}
			
		z.quit();
	}
}


/*..............................................................................................................................    
	z.get(" "); // get method :it  gets the url
  String pw = z.getWindowHandle();   // it handles the current window/ web page


WebElement fn = z.findElement(By.name("firstname"));  // findElement() it finds the elements by using name , id ....

fn.clear();
//fname = r.getCell(0).toString();  // getCell(0)  it gets the cell data
fn.sendKeys("tumuku");         // sendKeys("tumuku") it sends the message 

WebElement ln = z.findElement(By.name("lastname"));  // it finds the element as a name 
ln.clear();
//lname = r.getCell(1).toString();
ln.sendKeys("pavan");	
........................................................................................................................................................*/
