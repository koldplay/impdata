/**
 * This is native class for ProductCSVReader.
 * @version 1.0
 * @since 11-02-2017
 * */

package com.bizruntime.task3;

import java.util.List;

public class Product {
	
	/**
	 * Declaration and initialization of all constants and objects.
	 * @param productId
	 * @param ProductName
	 * @param productCategory
	 * @param price
	 * @param availableCity
	 * */
	private String productId;
	private String ProductName;
	private String productCategory;
	private Double price;
	private List<String> availableCity;
	
	/**
	 * Default Constructor
	 * */
	public Product() {
	
	}
	/**
	 * Argumented Constructor with arguments which is initialized above.
	 * */
	public Product(String productId ,String ProductName ,String productCategory, Double price ,List<String> availableCity){
		this.productId = productId;
		this.ProductName = ProductName;
		this.productCategory = productCategory;
		this.price = price;
		this.availableCity = availableCity;
	}
	/**
	 * starting of getters and setters
	 * */
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<String> getAvailableCity() {
		return availableCity;
	}
	public void setAvailableCity(List<String> availableCity) {
		this.availableCity = availableCity;
	}
	/**
	 * Overrided toString methods 
	 * */
	public String toString() {
	
		return "("+productId +","+ ProductName+","+productCategory+","+price+","+availableCity +")";
	}
}
