package com.mystore.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.ExtentReports; 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	 private static ExtentReports extent;
	private static final Logger logger = LogManager.getLogger(ExtentManager.class);
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
    public static synchronized ExtentReports getReporter() {
        if (extent == null) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport/TestReport.html";

            new File(System.getProperty("user.dir") + "/test-output/ExtentReport/").mkdirs();
            
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            sparkReporter.config().setDocumentTitle("Automation Report");
            sparkReporter.config().setReportName("Functional Testing");
            sparkReporter.config().setTheme(Theme.STANDARD);
            
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Host Name", "LocalHost");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("User", "Pavan");
            logger.info("Extent Report initialized at: " + reportPath);
        }
        return extent;
    }
    
    public static synchronized ExtentTest getTest() {
        return test.get();
    }
    
    public static synchronized void setTest(ExtentTest extentTest) {
        test.set(extentTest);
    }
    
    public static synchronized void removeTest() {
        test.remove();
    }
    
    public static synchronized void flushReport() {
        if (extent != null) {
            extent.flush();
            logger.info("Extent Report flushed and closed");
        }
    }
	
    
    
    
    
    
//	    private static final String REPORT_PATH = System.getProperty("user.dir") + "/test-output/ExtentReport/MyReport.html";
//	    private static ExtentSparkReporter sparkReporter;
//	    public static ExtentReports extent;
//	    public static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();
//
////	    public static void setExtent() {
////	        sparkReporter = new ExtentSparkReporter(REPORT_PATH);
////
////	        // Optional: Load from XML if present
////	        // File config = new File(System.getProperty("user.dir") + "/extent-config.xml");
////	        // if (config.exists()) sparkReporter.loadXMLConfig(config);
////
////	        extent = new ExtentReports();
////	        extent.attachReporter(sparkReporter);
////	        extent.setSystemInfo("HostName", "MyHost");
////	        extent.setSystemInfo("ProjectName", "MyStoreProject");
////	        extent.setSystemInfo("Tester", "Pavan");
////	        extent.setSystemInfo("OS", "Win11");
////	        extent.setSystemInfo("Browser", "Chrome");
////	    }
//
//	    
//	    public synchronized static ExtentReports getExtent() {
//	        if (extent == null) {
////	            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport/MyReport.html";
//	            sparkReporter = new ExtentSparkReporter(REPORT_PATH);
//	            
//	            sparkReporter.config().setDocumentTitle("MyStore Automation Report");
//	            sparkReporter.config().setReportName("Functional Testing");
//	            sparkReporter.config().setTheme(Theme.STANDARD);
//	            sparkReporter.config().setEncoding("utf-8");
//	            
//	            extent = new ExtentReports();
//	            extent.attachReporter(sparkReporter);
//	            extent.setSystemInfo("HostName", "MyHost");
//	            extent.setSystemInfo("ProjectName", "MyStoreProject");
//	            extent.setSystemInfo("Tester", "Pavan");
//	            extent.setSystemInfo("OS", System.getProperty("os.name"));
//	            extent.setSystemInfo("Browser", "Chrome, Firefox, Edge");
//	        }
//	        return extent;
//	    }
//	    
////	    public static ExtentReports getExtent() {
////	        return extent;
////	    }
//
//	    public static ExtentTest getTest() {
//	        return test.get();
//	    }
//
//	    public static void setTest(ExtentTest extentTest) {
//	        test.set(extentTest);
//	    }
//
//	    public synchronized static void flushReport() {
//	        if (extent != null) {
//	            extent.flush();
//	            extent = null; // Reset for next suite
//	        }
//	    }
	}



/*
 
 
 
 
 * 
 * 
 * 
 * 
 * 
 * 
 What ExtentManager does:
It sets up and manages ExtentReports for your Selenium tests.
  
  
💡 Real-time example:
setExtent()
 Creates an HTML report file.
 Adds info like OS, browser, tester name.

endReport()
 Saves and closes the report after all tests finish.


  
  
  
 * 
 * 


 public static ExtentSparkReporter sparkReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
    

    public static void setExtent() {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/MyReport.html");
        // sparkReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml"); // Optional if using config

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("HostName", "MyHost");
        extent.setSystemInfo("ProjectName", "MyStoreProject");
        extent.setSystemInfo("Tester", "Pavan");
        extent.setSystemInfo("OS", "Win11");
        extent.setSystemInfo("Browser", "Chrome");
    }

    public static void endReport() {
        extent.flush();
    }
 * */
