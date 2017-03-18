package com.bizruntim.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	private String ErrorMessage;
	private int errorcode;
	private String documentation;

	public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}
	public ErrorMessage(String ErrorMessage,int errorcode , String documentation) {
		
		this.ErrorMessage = ErrorMessage;
		this.errorcode = errorcode;
		this.documentation = documentation;
	}
	
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
}
