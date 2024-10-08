package com.mystore.pageobjects;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;

public class OrderPageTest extends BaseClass{
	IndexPage index;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartpage;
	OrderPage orderPage;
	LoginPage loginPage;
	
	@Parameters("browser")
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
