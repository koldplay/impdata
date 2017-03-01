/**
 * This is the Pojo class for CSVProductImpl and DBProductDAOImpl.
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;
/**
 * declaration of packages and imports.
 * */
import java.util.List;

/**
 * defination of Product class. 
 * */
public class Product {
	
	/**
	 * parameters which is requiered for Pojo class.
	 * @param productId
	 * @param productName
	 * @param productCategory
	 * @param price
	 * @param availableCity
	 * */
	private String productId;
	private String productName;
	private String productCategory;
	private Double price;
	private List<String> availableCity;
	/**
	 * Getters and Setters
	 * */
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+productId+","+productName+","+productCategory+","+price+","+availableCity+")";
	}
}
