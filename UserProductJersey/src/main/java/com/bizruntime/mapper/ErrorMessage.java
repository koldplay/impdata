package com.bizruntime.mapper;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String errormsg;
	private int errorcode;
	private String documentaion;
	
	public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}
	public ErrorMessage(String errormsg, int errorcode,String documentaion) {
		this.errormsg = errormsg;
		this.errorcode = errorcode;
		this.documentaion = documentaion;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getDocumentaion() {
		return documentaion;
	}
	public void setDocumentaion(String documentaion) {
		this.documentaion = documentaion;
	}
	
}
