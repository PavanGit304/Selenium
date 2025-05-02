package com.mystore.base;


import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.tracing.Propagator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.DOMConfiguration;
import com.mystore.actiondriver.Action;
import com.mystore.utility.ConfigManager;
import com.mystore.utility.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static final Logger logger = LogManager.getLogger(BaseClass.class);
//    public static Properties prop;
    
    public static WebDriver getDriver() {
        return driver.get();
    }


    @BeforeSuite(groups = {"Smoke", "Sanity", "Regression"})
    public void setup() {
        try {    
        	 // Config is already loaded by ConfigManager's static block  prop = loadConfig();
            logger.info("Using URL: {}", ConfigManager.get("url"));
//            ExtentManager.setExtent();
            logger.info("Test execution started");
        } catch (Exception e) {
            logger.error("Error loading configuration", e);
            throw new RuntimeException("Test setup failed", e);
        }
    }

    
    public static void launchApp(String browserName) {
    	    String runMode = ConfigManager.get("run.mode").trim();     
    	    logger.info("LaunchApp called with browser: " + browserName + ", runMode: " + runMode);
    	    
    	    WebDriver browserDriver;
    	    
    	    if (runMode.equalsIgnoreCase("browserstack")) {
    	        browserDriver = setupBrowserStack(browserName);
    	    } else {
    	        browserDriver = createBrowserDriver_setupLocal(browserName);
    	    }	       
        driver.set(browserDriver);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get(ConfigManager.get("url"));  //getDriver().get(prop.getPropert	y("url"));
    }

    
    private static WebDriver createBrowserDriver_setupLocal(String browserName) {
    	
//    	boolean isHeadless = ConfigManager.get("headless").equalsIgnoreCase("true");
    	String isHeadlessConfig = ConfigManager.get("headless");
    	boolean isHeadless = "true".equalsIgnoreCase(isHeadlessConfig);

        switch (browserName.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOpts = new ChromeOptions();
                if (isHeadless) {
                    chromeOpts.addArguments("--headless=new");
                }
                chromeOpts.addArguments("--remote-allow-origins=*");
                logger.info("Launching Chrome browser. Headless: {}", isHeadless);
                return new ChromeDriver(chromeOpts);

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOpts = new FirefoxOptions();
                if (isHeadless) {
                    firefoxOpts.addArguments("--headless");
                }
                logger.info("Launching Firefox browser. Headless: {}", isHeadless);
                return new FirefoxDriver(firefoxOpts);

            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                if (isHeadless) {
                    edgeOptions.addArguments("--headless");
                }
                edgeOptions.addArguments("--remote-allow-origins=*", "--disable-notifications");
                logger.info("Launching Edge browser. Headless: {}", isHeadless);
                return new EdgeDriver(edgeOptions);

            default:
                throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
    }
    
    
	private static WebDriver setupBrowserStack(String browserName) {
		 try {
	            MutableCapabilities capabilities = new MutableCapabilities();

	            Map<String, Object> browserstackOptions = new HashMap<>();
	            browserstackOptions.put("os",ConfigManager.get("bs.os"));
	            browserstackOptions.put("osVersion", ConfigManager.get("bs.os_version"));
//	            browserstackOptions.put("local", "false");
	            browserstackOptions.put("projectName", "MyStore Automation");
	            browserstackOptions.put("buildName", "MyStore_Regression_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()));
	            browserstackOptions.put("sessionName", "Login Test - " + browserName);
	            browserstackOptions.put("debug", "true");
	            browserstackOptions.put("consoleLogs", "info");
	            browserstackOptions.put("networkLogs", "true");
//	            browserstackOptions.put("seleniumVersion", "4.10.0");
	            
	            capabilities.setCapability("browserName", browserName);
	            capabilities.setCapability("browserVersion", ConfigManager.get("bs.browser_version")); 
	            capabilities.setCapability("bstack:options", browserstackOptions);
	            
	            // Add BrowserStack credentials
	            String username = ConfigManager.get("browserstack.username");
	            String accessKey = ConfigManager.get("browserstack.key");
	            
	         // Set the capabilities for the BrowserStack session
	            String remoteURL = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";

	            return new RemoteWebDriver(new URL(remoteURL), capabilities);

	        } catch (Exception e) {
	            logger.error("BrowserStack driver initialization failed", e);
	            throw new RuntimeException("Failed to initialize BrowserStack driver", e);
	        }
	}  
    
   
    @AfterSuite
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
        logger.info("Test execution finished");
    }
    
    public static void removeDriver() {
        driver.remove();
    } 
}




/*
 * 
 * 
  Real-Time Use Case Comparison    browserstackOptions.put("local", "false");
Scenario	                                            local = true	local = false
Testing a dev/staging site on localhost or internal IP	✅ Required	    ❌ Not suitable
Testing a public site like https://example.com	        ❌ Not needed	✅ Preferred
 
 instead of    getDriver().get(prop.getProperty("url")); 
 now we using  getDriver().get(ConfigManager.get("url"));
 
 
 This BaseClass manages test setup and teardown for Selenium tests.

Logger: Logs test start, end, and errors.
ThreadLocal WebDriver: Ensures each test thread uses a separate WebDriver instance, supporting parallel test execution.
loadConfig(): Loads configuration (like URL) from a .properties file.
setup():      Initializes config and reporting before tests. (Runs before tests, loading the config, setting up reporting, and logging the start of the test execution.)
launchApp():  Launches the app in the specified browser.
tearDown():   Quits the WebDriver, cleans up resources, and ends the reporting after test execution.
 
 * Summary:
Parallel Execution: Uses ThreadLocal to handle parallel test execution.

Browser Management: Supports Chrome, Firefox, and Edge with WebDriverManager.

Logging and Reporting: Logs test execution steps and errors using Log4j2 and generates Extent reports










************************************************************
public static Properties prop;
	
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
		ExtentManger.setExtent(); //it Initializes ExtentReports to generate test reports.
		// Log4j2 auto config - no need for DOMConfigurator.configure() in Log4j 2.x
//		DOMConfigurator.configure("log4j2.xml"); // Configures Log4j for logging based on settings in the log4j.xml file.
		
//		loadConfig	
		try {
			prop = new Properties();
			System.out.println("super constructor invoked");
			FileInputStream ip = new FileInputStream("D:\\Desktop\\Selenium end to end\\Selenium end to end\\MyStoreProject\\configuration\\config.properties");
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

//it checks the value of browserName is equal to "chrome" and ignores case differences( eg."chrome" or "CHROME",Chrome would also match)		
		if(browserName.equalsIgnoreCase("Chrome")) {

			
			WebDriverManager.chromedriver().setup(); // it automatically downloads and sets up the ChromeDriver and ensuring the correct version is used 
//			ChromeOptions options = new ChromeOptions(); //OR FirefoxOptions options2 = new FirefoxOptions();
//			options.setExperimentalOption("prefs", prefs);
			driver.set(new ChromeDriver());    //driver = new ChromeDriver(options);
			
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup(); //WebDriverManager.firefoxdriver().driverVersion("0.33.0").setup();
			driver.set(new FirefoxDriver()); //driver = new FirefoxDriver();
			}
		else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());//driver = new InternetExplorerDriver();
		}
			
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
 * */
