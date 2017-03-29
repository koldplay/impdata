package com.bizruntime.UserProductRestEasy;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class MyAppServletContextListener implements ServletContextListener{
	
	public final static Logger LOGGER = Logger.getLogger(MyAppServletContextListener.class);
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		LOGGER.debug("Connection is distroyed :"+arg0);
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		LOGGER.debug("Connection is initialized :" + arg0);
	}

}
