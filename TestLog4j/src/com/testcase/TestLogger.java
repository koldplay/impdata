package com.testcase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {
	
	final static Logger logger = Logger.getLogger(TestLogger.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is Debug");
		logger.info("This is Info");
		logger.warn("This ia warn");
		logger.error("This is Error");
		logger.fatal("This is Fatal");
	}

}
