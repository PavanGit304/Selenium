package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.tracing.Propagator;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.DOMConfiguration;
//import org.testng.annotations.Parameters;

import com.mystore.actiondriver.Action;
import com.mystore.utility.ExtentManger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	public static Properties prop;
//	public static WebDriver driver;
	
	//ThreadLocal: it stores a separate value for each thread
	//RemoteWebDriver: it drives the browser in remote setups like slenium grid
	//why ThreadLocal<RemoteWebDriver>: Parallel Testing(it prevents issues when running tests simultaneously, avoiding conflicts between threads.)
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	//getDriver:it get the RemoteWebDriver instance for the current thread
	public static WebDriver getDriver() {
		//get driver from threadLocalmap
		return driver.get();
	}
	
	@BeforeSuite(groups= {"Smoke","Sanity","Regression"})
	public void loadConfig() {
		ExtentManger.setExtent();
		DOMConfigurator.configure("log4j.xml");
		
//		loadConfig	
		try {
			prop = new Properties();
			System.out.println("super constructor invoked");
			FileInputStream ip = new FileInputStream("E:\\Selenium\\eclipse\\MyStoreProject\\configuration\\config.properties");
			prop.load(ip);
			System.out.println("driver:"+driver);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	public static void launchApp(String  browserName ) {
//		Map<String, Object> prefs = new HashMap<String, Object>();
//     	prefs.put("profile.default_content_setting_values.notifications", 2);
//     	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\Chromedriver128\\chromedriver-win64\\chromedriver.exe"); 
//        String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
//			ChromeOptions options = new ChromeOptions(); //OR FirefoxOptions options2 = new FirefoxOptions();
//			options.setExperimentalOption("prefs", prefs);
			driver.set(new ChromeDriver());    //driver = new ChromeDriver(options);
			
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
//			WebDriverManager.firefoxdriver().driverVersion("0.33.0").setup();
			driver.set(new FirefoxDriver()); //driver = new FirefoxDriver();
			}
		else if (browserName.equalsIgnoreCase("IE")) {
//			WebDriverManager.iedriver().setup();
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());//driver = new InternetExplorerDriver();
		}
		
	
//		if(browserName.contains("Chrome")) {
//			driver = new ChromeDriver();
//		}else if (browserName.contains("Firefox")) {
//			driver = new FirefoxDriver();	
//		}else if (browserName.contains("IE")) {
//			driver = new InternetExplorerDriver();
//		}
		
	getDriver().manage().window().maximize();
	Action.pageLoadTimeOut(getDriver(), 30);
	getDriver().get(prop.getProperty("url"));
//   Action.Alert(driver);
		}

	   public static void quitDriver() {
	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();  // Clean up the ThreadLocal reference
	        }
	    }
	
	@AfterSuite
	public void afterSuite() {
		ExtentManger.endReport();
	}

	
}
