package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

public class AddToCartPageTest extends BaseClass {
	
	IndexPage index;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartpage;

	@Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
//		driver.quit();
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void addToCartTest() {
		index = new IndexPage();
		searchResultPage=index.searchProduct("#9169020");
		addToCartpage = searchResultPage.clickOnProduct();
//		addToCartpage.enterQuantity();
		addToCartpage.selectSize();
		addToCartpage.clickOnAddToCart();
		boolean result=addToCartpage.validateAddToCart();
		Assert.assertTrue(result);
	}
}
