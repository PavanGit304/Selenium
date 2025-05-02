package com.mystore.utility;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4j_2 {
	
	private static final Logger logger = LogManager.getLogger(Log4j_2.class);

    public static void startTestCase(String testCaseName) {
        logger.info("======= {} START =======", testCaseName);
    }

    public static void endTestCase(String testCaseName) {
        logger.info("======= {} END =======", testCaseName);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(String message) {
        logger.fatal(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

	}
	
	
	
	
/*
code explanation 

Method        |             Purpose        | Example
startTestCase | Marks start of a test case | "LoginTest START"
info          | General info message       | "Opening browser"
warn          | Something went wrong, but not fatal | "Pop-up not closed"
error         | An error occurred          | "Login button not found"
fatal         | Critical failure           | "DB connection failed!"
debug         | Dev-level debug info       | "Variable x = 42"
endTestCase   | Marks end of a test case   | "LoginTest END"




Log4j1 differences  Log4j2

🚫 Why Avoid Log4j 1.x in 2024–25?
•	Security risks (e.g., Log4Shell exploit).
•	No active support.
•	Lacks performance & flexibility needed for modern test automation.
•	Cannot handle parallel execution or multi-threaded logs well.
________________________________________
✅ Why Use Log4j 2.x?
•	Works great in multi-threaded test frameworks (like Selenium + TestNG/JUnit).
•	Easy to filter, route, and format logs.
•	Secure, actively patched, and future-proof.


 * 
 * 
 ********************************************  Log 4j 1 code ***********************************************************

 		// Initialize Log4j logs
		public static Logger Log = Logger.getLogger(Log.class.getName());

		public static void startTestCase(String sTestCaseName){		  
			 Log.info("====================================="+sTestCaseName+" TEST START=========================================");
			 }
		
		public static void endTestCase(String sTestCaseName){
			Log.info("====================================="+sTestCaseName+" TEST END=========================================");
			 }
		
		// Need to create below methods, so that they can be called  

		 public static void info(String message) {
				Log.info(message);
				}

		 public static void warn(String message) {
		    Log.warn(message);
			}

		 public static void error(String message) {
		    Log.error(message);
			}

		 public static void fatal(String message) {
		    Log.fatal(message);
			}

		 public static void debug(String message) {
		    Log.debug(message);
			}
		
 
 
 
 * */
	
	
	
	
	
	

