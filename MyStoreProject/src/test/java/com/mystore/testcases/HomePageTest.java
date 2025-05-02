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
import com.mystore.utility.ConfigManager;

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
		homePage= loginPage.login(ConfigManager.get("username"), ConfigManager.get("password"));
		boolean result =homePage.validateAllOrders();
		Assert.assertTrue(result);
	}
	
	@Test(groups = "Smoke")
	public void MyFavorites () {
		indexpage = new IndexPage();
		loginPage=indexpage.clickOnSignIn();
		homePage= loginPage.login(ConfigManager.get("username"), ConfigManager.get("password"));
		boolean result =homePage.validateMyFavorites();
		Assert.assertTrue(result);
	}
}


/*
 
  
  Setup and Teardown:

@BeforeMethod: Open browser (e.g., Chrome or Firefox) and go to the website before each test.

@AfterMethod: Quits the browser after each test.

Test 1 – allOrder(): Navigates to the login page → logs in → verifies if "All Orders" are visible on the home page.

Test 2 – MyFavorites():Similar steps → but verifies if "My Favorites" section is working correctly.

Test Groups: Both tests are tagged with the "Smoke" group, meaning they are quick, high-priority checks.
 * 
 Real time example:
 ✅ Test 1 – allOrder()
Step1: Logs in using test credentials.
Step2: Goes to "Your Orders" page.
Step3: Verifies if the list of past orders is visible.
🛒 Real-time example: You check if your Amazon order history loads correctly.

❤️ Test 2 – MyFavorites()
step1: Logs in the same way.
Step2: Goes to "Your Wish List".
Step3: Verifies if favorite items are visible.
🎁 Real-time example: You check if your saved Amazon wish list is showing correctly.
 * 
 * */
