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
import com.mystore.utility.Log4j_2;

public class LoginPageTest extends BaseClass {
	IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;

    // Externalizing expected URL to avoid hardcoding in the test method
    private static final String EXPECTED_URL = "https://gw.lightinthebox.com/newv/en/user/orders?type=0&location=REALTIME";
    
    // Initial setup for browser configuration
    @Parameters({"browser"})
    @BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
    public void setup(String browser) {
        launchApp(browser);
    }
    
 // Clean up after each test
    @AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
    public void tearDown() {
    	 if (BaseClass.getDriver() != null) {
    	        BaseClass.getDriver().quit();
    	        BaseClass.removeDriver(); // Clear ThreadLocal
    	    }
    }
    
 // Test case for successful login with valid credentials
//    @Test(dataProvider = "credentials", dataProviderClass = DataProviders.class, groups = {"Smoke", "Sanity"})
    @Test(dataProvider = "credentials", dataProviderClass = DataProviders.class)  // delete this use above line for real time 
    public void loginTest(String uname, String pwd) {
        
    	Log4j_2.startTestCase("testLoginWithValidCredentials"); //Starts the test case in the logs
    	
        indexPage = new IndexPage(); 
        Log4j_2.info("Navigate to Login page from the homepage(click on signIn button)");
        loginPage = indexPage.clickOnSignIn(); // Navigates to LoginPage
   
        Log4j_2.info("Performing login with username and password...");
        homePage = loginPage.login(uname, pwd); // Login and navigate to HomePage
        
        String actualURL = homePage.getHomePageCurrentURL();
        Log4j_2.info("Verifying login URL...");
        
        Assert.assertEquals(actualURL, EXPECTED_URL, "URLs do not match, login might have failed.");    // Assert with a custom failure message to give more context
        
        Log4j_2.info("Login is successful");
        Log4j_2.endTestCase("loginTest");
    }
}





/*
 
 
 
 
 
 * 

****************************************************** old code 
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
		 // Properly quitting the driver after the test execution to clean up resources
        if (getDriver() != null) {
			getDriver().quit();
		}
	}
        
	
	@Test(dataProvider  = "credentials" , dataProviderClass = DataProviders.class, groups = {"Smoke","Sanity"})// DataProviders.class: DataProviders is a class name.it connects the Data provider class 
	public void loginTest(String uname, String pwd ) {
		Log4j_2.startTestCase("loginTest"); //in start method pass the Testcase name ex:loginTest
		indexPage = new IndexPage(); // note: here each page is related with another page 
		Log4j_2.info("user is going to click on signIn button");
		loginPage=indexPage.clickOnSignIn(); // after click on signIn it navigate to login page that way we assining indexPage class method to loginPage obj
	    Log4j_2.info("enter user name and password");
//        String uname = null;
//		String pwd = null;
	  //homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password")); // by using loginPage object we calling login method from LoginPage
	    homePage= loginPage.login(uname, pwd);
	   String actualURL= homePage.getHomePageCurrentURL();
	   String expectedURL="https://gw.lightinthebox.com/newv/en/user/orders?type=0&location=REALTIME";
	   Log4j_2.info("verifying if user is able to login");
	   Assert.assertEquals(actualURL, expectedURL);
	   Log4j_2.info("Login is Sucess");
	   Log4j_2.endTestCase("loginTest");
	}
	
 * */
