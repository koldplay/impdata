/**
 * since 12-2-2017
 * version 1.0 
 * This is class WashingMachine is subclass of Product Parent class.
 * 
 * */

package com.bizRuntime.task4;

import java.util.Map;

public class WashingMachine extends Product {

	/**
	 * @param loadCapacity
	 * @param isAutomatic
	 * @param doorType
	 */

	private int loadCapacity;
	private boolean isAutomatic;
	private String doorType;

	/**
	 * Getters and Setters Defination
	 */
	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public String getDoorType() {
		return doorType;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ ","+loadCapacity+","+isAutomatic+","+doorType+")";
	}
	public void buildProduct(Map<String, String> map) throws ProductCSVReaderFileNotFoundException {
		LOGGER.info("Build Method of Washing machine class is about to start");
		super.buildProduct(map);
		LOGGER.info("Super calling to Product class");
		LOGGER.info("Setting value according to Washing machine class");
		setLoadCapacity(Integer.parseInt(map.get("loadCapacity")));
		setAutomatic(Boolean.parseBoolean(map.get("isAutomatic")));
		setDoorType(map.get("doorType"));

	}

}
