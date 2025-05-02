package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.AddressPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.OrderSummary;
import com.mystore.pageobjects.PaymentPage;
import com.mystore.pageobjects.SearchResultPage;
import com.mystore.pageobjects.ShippingPage;
import com.mystore.utility.ConfigManager;

public class EndtoEndTest extends BaseClass {
	
	IndexPage index;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartpage;
	OrderPage orderPage;
	LoginPage loginPage;
	AddressPage addressPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;
	OrderSummary orderSummary;
	HomePage homePage;
	
	@Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}

	@Test(groups ="Regression")
	public void endToEndTest() {
		index = new IndexPage();
		searchResultPage=index.searchProduct("#9169020");
		addToCartpage = searchResultPage.clickOnProduct();
//		addToCartpage.enterQuantity();
		addToCartpage.selectSize();
		addToCartpage.clickOnAddToCart();
		
//		orderPage.getUnitPrice();
//		orderPage.getTotalPrice();
		addToCartpage.clickOnCheckOut();//loginPage= orderPage.clickOnCheckOut();
		
		homePage =loginPage.login(ConfigManager.get("username"), ConfigManager.get("password"));//addressPage=loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
		addressPage.clikOnEdit();
		shippingPage = addressPage.verifyShippingAddress();
		paymentPage = shippingPage.clickOnContinue();
		paymentPage.clickOnPayPal();
		orderSummary = paymentPage.clickOnCreditOrDebitCard();
		boolean result  =orderSummary.clickOnPurchaseButton();
		
		Assert.assertTrue(result);
		
		
		
	}

}
