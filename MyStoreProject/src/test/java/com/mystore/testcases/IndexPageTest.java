package com.mystore.testcases;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;



public class IndexPageTest extends BaseClass{

	IndexPage indexPage;
	
	@Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups = "Smoke")
	public void verifyLogo() {
		indexPage = new IndexPage();
		boolean result =indexPage.validateLogo();// it returns boolean results 
		Assert.assertTrue(result);
	}
	
	@Test(groups = "Smoke")
	public void verifyTitle() {
		String actualTitle =indexPage.getMyStoreTitle();
		Assert.assertEquals(actualTitle, "LightInTheBox - Global Online Shopping for Dresses, Home &amp; Garden, Electronics, Wedding Apparel");
	}
}
