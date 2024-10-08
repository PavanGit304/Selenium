package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

public class SerachResultPageTest extends BaseClass{
	IndexPage index;
	SearchResultPage searchResultPage;

	@Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
//		driver.quit();
	}
	
	@Test(groups = "Smoke")
	public void productAvailabilityTest() {
		index = new IndexPage();
		searchResultPage =index.searchProduct("Men T-shirt");
		boolean result = searchResultPage.isProductAvaialable();
//		searchResultPage.clickOnProduct();
		Assert.assertTrue(result);
	}
}
