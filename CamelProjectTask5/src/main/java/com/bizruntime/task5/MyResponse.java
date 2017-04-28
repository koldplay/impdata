package com.bizruntime.task5;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyResponse {

	private boolean result = true;
	private String description ="data on working";
	private Integer appresponse = 200;
	
	@XmlElement
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement
	public Integer getAppresponse() {
		return appresponse;
	}
	public void setAppresponse(Integer appresponse) {
		this.appresponse = appresponse;
	}
	
	public MyResponse(boolean result, String description, Integer appresponse) {
		this.result = result;
		this.description = description;
		this.appresponse = appresponse;
	}
	
	public MyResponse() {
		
	}
	@Override
	public String toString() {
		return "MyResponse [result=" + result + ", description=" + description + ", appresponse=" + appresponse + "]";
	}
	
	
}
