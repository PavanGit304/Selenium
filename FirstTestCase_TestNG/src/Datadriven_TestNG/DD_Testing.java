package Datadriven_TestNG;
//datadriven:we can run the same test with different input values without changing the test code
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DD_Testing {
	
	
	 WebDriver z;
		@BeforeTest            //open the browser 
		public void brower() throws InterruptedException {
			z = new FirefoxDriver();
			z.manage().window().maximize();
			Thread.sleep(1000);
		}

		@ AfterTest            //close the browser 
		public void af() {
			z.quit();
		}
		
		
	  @Test  // reading the data from XL sheet 
	  public void f(){

			try  // .xls (old format 97 2003), .xlsx(new format)
			{//FileInputStream: it reads the data from file 
				FileInputStream fileObj= new FileInputStream("E:\\Selenium\\eclipse\\selenium_Workspace\\FirstTestCase_TestNG\\src\\Datadriven_TestNG\\datadriven.xls");    // it is used for reading data/Excel file such as image data , audio ,video,file..etc
				//XSSFWorkbook wb = new XSSFWorkbook(f);
				HSSFWorkbook workBookObj = new HSSFWorkbook(fileObj);
				HSSFSheet sheetObj = workBookObj.getSheet("Sheet1");
				String url ;
				String fname ;
				String lname ;
				//i=1 T i+1 -->1+1=2 -->i=3 3+1=4....
	
				for(int i=1 ; i<=sheetObj.getLastRowNum(); i++)     // s.getLastRowNum();  it fetch the data until last row in sheet 
				{
					HSSFRow r= sheetObj.getRow(i);   // i=1 i=2 it gets the rows
					url = r.getCell(0).toString();  // getCell(0)  it gets the cell data
					z.get(url);
					WebElement fn =  z.findElement(By.name("identifier"));  // userName 
					fn.clear();
					fname = r.getCell(1).toString();  // getCell(1)  it gets the cell data
					fn.sendKeys(fname);
					Thread.sleep(1000);
					WebElement next_btn = z.findElement(By.xpath("//*[contains(@type,'button')]"));  //click 
					next_btn.click();					
					Thread.sleep(1000);
//					WebElement ln = z.findElement(By.xpath("//input[@type='password']"));  // 
//					ln.clear();
//					lname = r.getCell(2).toString();
//					ln.sendKeys(lname);	
//					WebElement pw = z.findElement(By.className("CwaK9"));
					//pw.click();
	
//				z.close ();
						
				}
				
				fileObj.close();
			} 
			catch (Exception ex) {
				System.out.println(ex);
			}

			z.quit();
		}

}
