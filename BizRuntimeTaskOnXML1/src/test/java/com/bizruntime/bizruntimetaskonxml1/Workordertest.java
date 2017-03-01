package com.bizruntime.bizruntimetaskonxml1;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Workordertest {
	
	public static final Logger LOGGER = Logger.getLogger(Workordertest.class);
	@Test
	public void testValidator(){
		XSDVALIDATION xsdvalidation = new XSDVALIDATION();
		xsdvalidation.validator();
		LOGGER.info("Testing is done");
	}
	@Test
	public void testConvertor() throws Exception {
		XSLTExec exec = new XSLTExec();
		exec.convertor();
		LOGGER.info("Convertion is Done");
	}
}
