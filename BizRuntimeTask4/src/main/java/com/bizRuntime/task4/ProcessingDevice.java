/**
 * This is class which is subclass ProcessingDevice of Product class.  
 * */

package com.bizRuntime.task4;

import java.util.Map;

public class ProcessingDevice extends Product {

	/**
	 * @param screenSize
	 * @param OS
	 * @param batterysize
	 * @param numcore
	 * @param ram
	 *            Declaration and Defination
	 */
	private String screenSize;
	private String OS;
	private int batterysize;
	private int numcore;
	private int ram;

	/**
	 * All The getters and Setters in the base of arguments.
	 */
	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getBatterysize() {
		return batterysize;
	}

	public void setBatterysize(int batterysize) {
		this.batterysize = batterysize;
	}

	public int getNumcore() {
		return numcore;
	}

	public void setNumcore(int numcore) {
		this.numcore = numcore;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return super.toString() + "," + screenSize + "," + OS + "," + batterysize + "," + numcore + "," + ram;
	}

	public void buildProduct(Map<String, String> map) throws ProductCSVReaderFileNotFoundException {
		LOGGER.info("Build Method of Processing class is about to start");
		super.buildProduct(map);
		LOGGER.info("supper calling statement to Product class");
		LOGGER.info("Setting value according to Processing Device class");
		setScreenSize(map.get("screenSize"));
		setOS(map.get("OS"));
		setBatterysize(Integer.parseInt(map.get("numCore")));
		setRam(Integer.parseInt(map.get("ram")));

	}

}
