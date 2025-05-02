package com.mystore.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigManager {
	
	
	 private static final Logger logger = LogManager.getLogger(ConfigManager.class);
	    private static final Properties prop = new Properties();

	    static {
	        try {
	            // Try loading from resources first
	            InputStream input = ConfigManager.class.getClassLoader().getResourceAsStream("config.properties");
	            prop.load(input);
	            logger.info("Configuration loaded successfully");
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to load config.properties", e);
	        }
	    }


	    public static String get(String key) {
	        String value = prop.getProperty(key);
	        if (value == null) {
	            logger.warn("Configuration key '{}' not found", key);
	        }  
	        System.out.println("ConfigManager: Key = " + key + ", Value = " + value);
	        return value;
	    }

	    private ConfigManager() {}
	    
}   




//if (input == null) {
//	// Fallback to absolute path if running tests directly from IDE
//    String configPath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
//    input = new java.io.FileInputStream(configPath);
//}

//	 private static final Logger logger = LogManager.getLogger(ConfigManager.class);
//	    private static final Properties prop = new Properties();
//
//	    // Static block loads config when class is initialized
//	    static {
//	        loadConfig();
//	    }
//
//	    private static void loadConfig() {
//	        try (InputStream input = ConfigManager.class.getClassLoader()
//	                .getResourceAsStream("config.properties")) {
//	            
//	            if (input == null) {
//	            	
//	            	  // Fallback to file system path
//	                String configPath = System.getProperty("user.dir") + "/src/main/resources/config.properties";
//	                input = new java.io.FileInputStream(configPath);
////	                throw new RuntimeException("config.properties not found in classpath");
//	            }
//	            prop.load(input);
//	            logger.info("Configuration loaded successfully");
//	            
//	        } catch (IOException e) {
//	            logger.error("Failed to load configuration", e);
//	            throw new RuntimeException("Configuration loading failed", e);
//	        }
//	    }
//
//	    // Public method to access config values
//	    public static String get(String key) {
//	        String value = prop.getProperty(key);
//	        if (value == null) {
//	            logger.warn("Configuration key '{}' not found", key);
//	        }
//	        return value;
//	    }
//
//	    // Prevent instantiation
//	    private ConfigManager() {}


