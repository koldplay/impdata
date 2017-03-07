package com.bizruntime.UserProductMaven;

import java.util.List;

public class Product {
	private String productId;
	private String ProductName;
	private String productCategory;
	private Double price;
	private List<String> availableCity;
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
	
	public String toString() {
		
		return "("+productId +","+ ProductName+","+productCategory+","+price+","+availableCity +")";
	}
}
