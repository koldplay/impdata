/**
 * since 12-2-2017
 * version 1.0
 * This is subclass TV which extends super class Product
 * */

package com.bizRuntime.task4;

import java.util.Map;

public class TV extends Product {

	/**
	 * @param displaysize
	 * @param displaytype
	 * @param isSmartTV
	 */
	private int displaysize;
	private String displaytype;
	private boolean isSmartTV;

	/**
	 * Getters and Setters list
	 */
	public int getDisplaysize() {
		return displaysize;
	}

	public void setDisplaysize(int displaysize) {
		this.displaysize = displaysize;
	}

	public String getDisplaytype() {
		return displaytype;
	}

	public void setDisplaytype(String displaytype) {
		this.displaytype = displaytype;
	}

	public boolean isSmartTV() {
		return isSmartTV;
	}

	public void setSmartTV(boolean isSmartTV) {
		this.isSmartTV = isSmartTV;
	}

	public String toString() {
		
		return super.toString()+ "," + displaysize + "," + displaytype + "," + isSmartTV + ")";
	}

	/**
	 * This is method for making and building product.
	 */
	public void buildProduct(Map<String, String> map) throws ProductCSVReaderFileNotFoundException {
		LOGGER.info("Build Product Method of TV class is about to start");
		super.buildProduct(map);
		LOGGER.info("Super calling to Product class");
		LOGGER.info("Setting value according to Tv class");
		setDisplaysize(Integer.parseInt(map.get("displaySize")));
		setDisplaytype(map.get("displayType"));
		setSmartTV(Boolean.parseBoolean(map.get("isSmartTV")));

	}

}
