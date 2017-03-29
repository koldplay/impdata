package com.bizruntime.UserProductRestEasy;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private String productId;
	private String productName;
	private String productCategory;
	private Double price;
	private List<String> availableCity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productId,String productName,String productCategory , Double price , List<String> availableCity) {
		this.productId = productId;
		this.productName = productName ;
		this.productCategory = productCategory;
		this.price = price;
		this.availableCity = availableCity;
	}
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
	
}
