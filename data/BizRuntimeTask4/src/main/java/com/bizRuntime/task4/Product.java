/**
 * This class is super class of all classes .class name is Product.
 * @version 1.0
 * @since 12-02-2017
 * */

package com.bizRuntime.task4;

import java.util.Map;

import org.apache.log4j.Logger;

public class Product {

	/**
	 * Declaration and initialization of objects.
	 * 
	 * @param LOGGER
	 * @param ProductId
	 * @param ProductName
	 * @param ProductType
	 * @param Price
	 * @param Warranty
	 * @param ManufactureDt
	 */

	public static final Logger LOGGER = Logger.getLogger(Product.class);
	private String ProductId;
	private String ProductName;
	private String ProductType;
	private Double price;
	private Integer Warranty;
	private String ManufecturedDt;

	/**
	 * @Override toString method.
	 */
	public String toString() {
		return "(" + ProductId + "," + ProductName + "," + ProductType + "," + price + "," + Warranty + ","
				+ ManufecturedDt ;
	}

	/**
	 * Getters and Setters are initialized
	 */
	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getWarranty() {
		return Warranty;
	}

	public void setWarranty(int warranty) {
		Warranty = warranty;
	}

	public String getManufecturedDt() {
		return ManufecturedDt;
	}

	public void setManufecturedDt(String manufecturedDt) {
		ManufecturedDt = manufecturedDt;
	}

	
	public void buildProduct(Map<String, String> map) throws ProductCSVReaderFileNotFoundException {
		LOGGER.info("BuildProduct method of Product class is Starting");
		
		LOGGER.info("Setting value according to Product class");		
		setProductId(map.get("productId"));
		setProductName(map.get("productName"));
		setProductType(map.get("productType"));
		setPrice(Double.parseDouble(map.get("price")));

		setWarranty(Integer.parseInt(map.get("warranty")));
		setManufecturedDt(map.get("manufecturedDt"));
		
	}

}
