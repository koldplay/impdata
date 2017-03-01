/**
 * This is class name is Laptop which is sub class of ProcessingDevices
 * @version 1.0
 * @since 12-02-2017
 * */

package com.bizRuntime.task4;

import java.util.Map;

import org.apache.log4j.Logger;

public class Laptop extends ProcessingDevice {
	/**
	 * Declaration and initialization of objects.
	 * */
	
	public final static Logger LOGGER = Logger.getLogger(ProcessingDevice.class);
	private String graphicCard;
	
	/**
	 * Starting of getters and Setters.
	 * */
	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}
	public String getGraphicCard() {
		return graphicCard;
	}
	
	@Override
	public String toString() {
		return super.toString() + ","+graphicCard+")";
	}
	public void buildProduct(Map<String,String> map)throws ProductCSVReaderFileNotFoundException{
		LOGGER.info("BuildProduct method of Laptop class is about to start");
		
		super.buildProduct(map);
		LOGGER.info("Super calling to Processing Device");
		LOGGER.info("Setting value according to Laptop class");
		setGraphicCard(map.get("graphicsCard"));
		

	}

}
