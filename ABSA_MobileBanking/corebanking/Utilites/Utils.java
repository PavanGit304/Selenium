package Utilites;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Report_Listener.MyListener;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Utils extends MyListener{

	protected static AndroidDriver<MobileElement> driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static XSSFRow dataRow3_paynewbeneficiary;
	public static XSSFRow dataRow6_payFutureDatedForAnExistingBeneficiary;
	public static XSSFRow dataRow9_PayAbsaListedBeneficiaryNew;
	public static XSSFRow dataRow12_pay_IIPForAnExistingBeneficiary;
	public static XSSFRow dataRow15_Pay_MultiAcc;
    public static XSSFRow dataRow19_Payinternational;

    
	public static void loadData() {

		try {
			
			FileInputStream f = new FileInputStream("E:\\Mob_end_end_Testing.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet s = wb.getSheet("Sheet1");

			// pay
			dataRow3_paynewbeneficiary = s.getRow(2); // it gets the rows from sheet
		
			dataRow6_payFutureDatedForAnExistingBeneficiary = s.getRow(5); // note: dataRow6 -1 =dataRow 5

			dataRow9_PayAbsaListedBeneficiaryNew = s.getRow(8);

			dataRow12_pay_IIPForAnExistingBeneficiary = s.getRow(11);

			dataRow15_Pay_MultiAcc = s.getRow(14);

			dataRow19_Payinternational = s.getRow(18);

			f.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
