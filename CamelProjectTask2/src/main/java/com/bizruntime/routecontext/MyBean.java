package com.bizruntime.routecontext;

import org.apache.log4j.Logger;

public class MyBean {
	
	private final static Logger LOGGER = Logger.getLogger(MyBean.class);
	public void myBean() {
		LOGGER.info("Hello Route Context");
	}
}
