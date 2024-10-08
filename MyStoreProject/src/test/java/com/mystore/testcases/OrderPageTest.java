package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.SearchResultPage;

public class OrderPageTest extends BaseClass{
	IndexPage index;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartpage;
	OrderPage orderPage;
	LoginPage loginPage;

	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}

	@Test
	public void verifyTotalPrice() {
		index = new IndexPage();
		searchResultPage=index.searchProduct("#9169020");
		addToCartpage = searchResultPage.clickOnProduct();
//		addToCartpage.enterQuantity();
		addToCartpage.selectSize();
		addToCartpage.clickOnAddToCart();
		
//		orderPage.getUnitPrice();
//		orderPage.getTotalPrice();
        orderPage= addToCartpage.clickOnCheckOut();
	}
}
