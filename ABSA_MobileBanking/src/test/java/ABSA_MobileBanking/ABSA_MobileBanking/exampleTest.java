package ABSA_MobileBanking.ABSA_MobileBanking;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class exampleTest {

 static AndroidDriver<MobileElement> driver;
	
	@Test
	public static void capabil() throws InterruptedException, IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO K10 5G"); // DEVICE_NAME : model number :Galaxy A52
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium"); // AUTOMATION_NAME: by default
		capabilities.setCapability("udid", "VWJFBY6XCQPBR86P"); // udid : adb device name (we can find in cmd (type adb devices ))
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		Reporter.log("open android ...<br>", true);
		
		Thread.sleep(3000);
		capabilities.setCapability("noReset", "true");
//		capabilities.setCapability("appPackage", "com.barclays.absa.banking.uat2");
//		capabilities.setCapability("appActivity","com.barclays.absa.banking.v4.presentation.launch.SplashScreen2faActivity");// 2
		
		 capabilities.setCapability("appPackage", "com.coloros.calculator2");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator - Calculator");
		Thread.sleep(3000);
		Reporter.log("open appilcation ...<br>", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub"); // http://127.0.0.1:4723/wd/hub : 4723-port no
		
         driver = new AndroidDriver<MobileElement>(url, capabilities);
     	Thread.sleep(5000);
		Reporter.log("appilcation started...<br>", true);

	}

}
