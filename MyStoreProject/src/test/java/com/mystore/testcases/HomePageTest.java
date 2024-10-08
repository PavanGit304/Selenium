package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass{
	
	IndexPage indexpage;
	LoginPage loginPage;
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
	
	@Test(groups = "Smoke")
	public void allOrder() {
		indexpage = new IndexPage();
		loginPage=indexpage.clickOnSignIn();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result =homePage.validateAllOrders();
		Assert.assertTrue(result);
	}
	
	@Test(groups = "Smoke")
	public void MyFavorites () {
		indexpage = new IndexPage();
		loginPage=indexpage.clickOnSignIn();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result =homePage.validateMyFavorites();
		Assert.assertTrue(result);
	}

}
