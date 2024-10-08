


package Selenium.AVAF;

import org.testng.annotations.Test;

import PageObjectModel.PageObject_AVAF;
import Report_Listener.MyListener;

public class AVAF extends MyListener{
	
	
	PageObject_AVAF obj;
	
	@Test (priority = 0,groups = {"AVAF_relese1"})
	public void avaf_hub() throws InterruptedException 
	{
		
		obj = new PageObject_AVAF(driver);
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Current balance\").instance(0))");
		Thread.sleep(2000);
		obj.avafHub();

	}
	
	@Test (priority = 1,groups = {"AVAF_relese1"})
	public void transaction_mthod() 
	{
		obj.transaction();
	}
	
	@Test (priority = 2,groups = {"AVAF_relese1"})
	public void selectDate_mthod() throws InterruptedException 
	{
		obj.calender();
		Thread.sleep(2000);
		obj.selectDate();
		obj.Done();
	}
	
	@Test (priority = 3,groups = {"AVAF_relese1"})
	public void transaction_mthod1() 
	{
		obj.transaction();
	}
	

}
