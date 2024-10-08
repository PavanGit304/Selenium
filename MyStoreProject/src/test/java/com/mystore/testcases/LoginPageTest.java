package com.mystore.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

public class LoginPageTest extends BaseClass {

IndexPage indexPage;
LoginPage loginPage;
HomePage homePage;
	

    @Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}
	
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
//		getDriver().quit();
	}
	
	@Test(dataProvider  = "credentials" , dataProviderClass = DataProviders.class, groups = {"Smoke","Sanity"})// DataProviders.class: DataProviders is a class name.it connects the Data provider class 
	public void loginTest(String uname, String pwd ) {
		Log.startTestCase("loginTest"); //in start method pass the Testcase name ex:loginTest
		indexPage = new IndexPage(); // note: here each page is related with another page 
		Log.info("user is going to click on signIn button");
		loginPage=indexPage.clickOnSignIn(); // after click on signIn it navigate to login page that way we assining indexPage class method to loginPage obj
	    Log.info("enter user name and password");
//        String uname = null;
//		String pwd = null;
	  //homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password")); // by using loginPage object we calling login method from LoginPage
	    homePage= loginPage.login(uname, pwd);
	   String actualURL= homePage.getHomePageCurrentURL();
	   String expectedURL="https://gw.lightinthebox.com/newv/en/user/orders?type=0&location=REALTIME";
	   Log.info("verifying if user is able to login");
	   Assert.assertEquals(actualURL, expectedURL);
	   Log.info("Login is Sucess");
	   Log.endTestCase("loginTest");
	}
	
}
