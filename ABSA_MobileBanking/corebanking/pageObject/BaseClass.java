package pageObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass  {
	
	
	
    public static AppiumDriver<MobileElement> driver;
//    @BeforeTest
//    @Parameters({"deviceName","udid", "platformVersion","url"})
//    public void setup(String deviceName, String udid,String platformVersion,String url) throws InterruptedException, MalformedURLException
//    {
//                DesiredCapabilities capabilities=new DesiredCapabilities();
//		/*
//		 * cap.setCapability("deviceName", deviceName); cap.setCapability("udid", udid);
//		 * cap.setCapability("appActivity", "com.android.calculator2.Calculator");
//		 * cap.setCapability("appPackage", "com.android.calculator2");
//		 * cap.setCapability("platformName", "Android");
//		 * cap.setCapability("platformVersion", platformVersion); driver=new
//		 * AppiumDriver<MobileElement>(new URL(url), cap);
//		 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		 * Thread.sleep(5000);
//		 */
   
//    	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName); // DEVICE_NAME : model number
//		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium"); // AUTOMATION_NAME: by default
//		capabilities.setCapability("udid", udid); // udid : adb device name
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
//		capabilities.setCapability("noReset", "true");
//		capabilities.setCapability("appPackage", "com.barclays.absa.banking.uat");
//		capabilities.setCapability("appActivity",
//				"com.barclays.absa.banking.v4.presentation.launch.SplashScreen2faActivity");// 2
//		driver = new AppiumDriver<MobileElement>(new URL(url), capabilities);
//     	Thread.sleep(5000);
//      
//    }
    
    
	@Test
	public static void capabil() throws InterruptedException, IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI VNS-L31"); // DEVICE_NAME : model number :Galaxy A52
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "	"); // AUTOMATION_NAME: by default
		capabilities.setCapability("udid", "4TE7N16B25004195"); // udid : adb device name (we can find in cmd (type adb devices ))
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		Reporter.log("open android ...<br>", true);
		Thread.sleep(3000);
		//capabilities.setCapability("noReset", "true");
		capabilities.setCapability("appPackage", "com.barclays.absa.banking.uat2");
		capabilities.setCapability("appActivity",
				"com.barclays.absa.banking.v4.presentation.launch.SplashScreen2faActivity");// 2

		Thread.sleep(3000);
		Reporter.log("open appilcation ...<br>", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub"); // http://127.0.0.1:4723/wd/hub : 4723-port no
		driver = new AndroidDriver<MobileElement>(url, capabilities);
     	Thread.sleep(5000);
		Reporter.log("appilcation started...<br>", true);

	}

}
