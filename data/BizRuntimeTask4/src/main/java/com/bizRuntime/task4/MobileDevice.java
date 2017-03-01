/**
 * This class name is MobileDevice which is subclass of {@link ProductService}
 * @version 1.0
 * @Since 12-02-2017
 * */
package com.bizRuntime.task4;

import java.util.Map;

import org.apache.log4j.Logger;

public class MobileDevice extends ProcessingDevice {
	/**
	 * Declartion and Initialization of objects.
	 * 
	 * @param simType
	 */
	public static final Logger LOGGER = Logger.getLogger(MobileDevice.class);
	private String simType;

	/**
	 * Starting of getter and setters
	 */
	public String getSimType() {
		return simType;
	}

	public void setSimType(String simType) {
		this.simType = simType;
	}

	@Override
	public String toString() {
		
		return super.toString()+ "," + simType + ")";
	}

	public void buildProduct(Map<String, String> map) throws ProductCSVReaderFileNotFoundException {
		LOGGER.info("BuildProduct Method of Mobiledevice class is about to starting ");
		super.buildProduct(map);
		LOGGER.info("super calling statement to Processing Device class");
		LOGGER.info("Setting value according to MobileDevice class");
		setSimType(map.get("simType"));

	}

}
