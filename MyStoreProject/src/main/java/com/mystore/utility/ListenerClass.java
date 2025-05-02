package com.mystore.utility;

import java.io.File;   
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ListenerClass  implements ITestListener {
	

	private static final Logger logger = LogManager.getLogger(ListenerClass.class);

    @Override
    public void onStart(ITestContext context) {
        logger.info("Test Suite {} started", context.getName());
        // 🔧 Initialize ExtentReports here
        ExtentManager.getReporter();
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("Test Suite {} finished", context.getName());
        ExtentManager.flushReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test {} started", result.getName());
        ExtentTest test = ExtentManager.getReporter().createTest(result.getMethod().getMethodName());
        ExtentManager.setTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test {} passed", result.getName());
        ExtentManager.getTest().log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED", ExtentColor.GREEN));
        attachScreenshot(result);
//        try {
//            String screenshotPath = Action.screenShot(BaseClass.getDriver(), result.getName());
//            ExtentManager.getTest().pass("Screenshot below: " + 
//            		MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//        } catch (Exception e) {
//            logger.error("Failed to capture screenshot", e);
//        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	if (ExtentManager.getTest() == null) {
            onTestStart(result); // Ensure test is initialized
        }
        logger.error("Test {} failed", result.getName(), result.getThrowable());
        ExtentManager.getTest().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED", ExtentColor.RED));
        ExtentManager.getTest().fail(result.getThrowable());
        attachScreenshot(result);
        
//        try {
//            String screenshotPath = Action.screenShot(BaseClass.getDriver(), result.getName());
//            ExtentManager.getTest().fail("Screenshot below: " + 
//            		MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//        } catch (Exception e) {
//            logger.error("Failed to capture screenshot", e);
//        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.warn("Test {} skipped", result.getName());
        ExtentManager.getTest().log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED", ExtentColor.ORANGE));
    }

    
    private void attachScreenshot(ITestResult result) {
        try {
            String screenshotPath = Action.screenShot(BaseClass.getDriver(), result.getName());
            ExtentManager.getTest().info("Screenshot:",
                    MediaEntityBuilder.createScreenCaptureFromPath("file:///" + screenshotPath.replace("\\", "/")).build());
        } catch (Exception e) {
            logger.error("Failed to capture screenshot", e);
        }
    }
    
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Implement if needed
    }
	
    
    
    
    
    
//	private static final Logger logger = LogManager.getLogger(ListenerClass.class);
//	
//	@Override
//    public void onStart(ITestContext context) {
//        // Initialize ExtentReports at suite start
//        ExtentManager.getExtent();
//    }
//
//    @Override
//    public void onTestStart(ITestResult result) {
//        ExtentTest test = ExtentManager.getExtent().createTest(result.getName());
//        ExtentManager.setTest(test);
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        String screenshotPath = Action.screenShot(BaseClass.getDriver(), result.getName());
//        ExtentManager.getTest().log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - Test Case PASSED", ExtentColor.GREEN));
//		ExtentManager.getTest().pass("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        String screenshotPath = Action.screenShot(BaseClass.getDriver(), result.getName());
//        ExtentManager.getTest().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case FAILED", ExtentColor.RED));
//		ExtentManager.getTest().fail(result.getThrowable());
//		ExtentManager.getTest().fail("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        ExtentManager.getTest().log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case SKIPPED", ExtentColor.ORANGE));
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        ExtentManager.flushReport();
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        // Implementation if needed
//    }
	
    
	}





/*
 
 
   @Override
	    public void onTestStart(ITestResult result) {
	        // Create a test in Extent report
	        ExtentManager.setTest(ExtentManager.getExtent().createTest(result.getName()));
	        logger.info("Test Started: {}", result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Take screenshot for passing test
	        String imgPath = Action.screenShot(BaseClass.getDriver(), result.getName());
	        
	        // Get the current ExtentTest instance and log the result
	        ExtentManager.getTest().log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - Test Case PASSED", ExtentColor.GREEN));
	        ExtentManager.getTest().pass("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
	        logger.info("Test Passed: {}", result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Take screenshot for failing test
	        String imgPath = Action.screenShot(BaseClass.getDriver(), result.getName());
	        
	        // Get the current ExtentTest instance and log the result
	        ExtentManager.getTest().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case FAILED", ExtentColor.RED));
	        ExtentManager.getTest().log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
	        ExtentManager.getTest().fail("Screenshot Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
	        logger.error("Test Failed: {}", result.getName(), result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Take screenshot for skipped test
	        String imgPath = Action.screenShot(BaseClass.getDriver(), result.getName());
	        
	        // Get the current ExtentTest instance and log the result
	        ExtentManager.getTest().log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case SKIPPED", ExtentColor.ORANGE));
	        ExtentManager.getTest().skip("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
	        logger.warn("Test Skipped: {}", result.getName());
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        logger.info("Test Failed but within success percentage: {}", result.getName());
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        logger.info("Test Suite Started: {}", context.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        ExtentManager.endReport();
	        logger.info("Test Suite Finished: {}", context.getName());
	    }
 
 
 * 
 * code explanation 
🧪 Real Examples:
✅ Passed Test:  Logs success + takes a screenshot
❌ Failed Test:  Logs error + shows exception + screenshot
⏭ Skipped Test: Logs skip + screenshot


📦 Tools It Uses:
ExtentReports:         For test reports
Action.screenShot():   To capture browser screenshot
BaseClass.getDriver(): Gets browser driver
MarkupHelper:          Adds color-coded labels to your logs

🎯 Result:
At the end, you get a detailed, screenshot-rich report showing which tests passed, failed, or were skipped — just like real-world QA dashboards.
 
 
 
 
 
 
 //	public class ListenerClass extends ExtentManager implements ITestListener {

//		Action action= new Action();
		
		public void onTestStart(ITestResult result) {
			test = extent.createTest(result.getName()); // it create the test in extent report
		}

		public void onTestSuccess(ITestResult result) {
			if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName()+ "Pass Test case is: ");
			}
		}

		public void onTestFailure(ITestResult result) {
			if (result.getStatus() == ITestResult.FAILURE) {
				try {
					test.log(Status.FAIL,MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
					test.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable().getMessage()+ " - Test Case Failed",ExtentColor.RED));
					String imgPath = Action.screenShot(BaseClass.getDriver(), result.getName());
			//createScreenCaptureFromPath(imgPath): it add the screenshot in extent report 
					test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		public void onTestSkipped(ITestResult result) {
			if (result.getStatus() == ITestResult.SKIP) {
				test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
			}
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub

		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
		}
 
 * */
