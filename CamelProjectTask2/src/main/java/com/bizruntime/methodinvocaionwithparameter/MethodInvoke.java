package com.bizruntime.methodinvocaionwithparameter;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class MethodInvoke {
	
	private final static Logger LOGGER = Logger.getLogger(MethodInvoke.class);
	
	public void getName(String fname ,String lname ,Exchange exchange) {
		
		LOGGER.info("Name is printing :"+fname+" "+lname);
	}
	
	public void getNamePrimExch(String fname , Exchange exchange) {
		
		LOGGER.info(exchange.getIn().getHeader("myheader"));
		LOGGER.info("Name is printing :"+fname);
	}
	
	public void getNamefromHeader(String fname, String lname) {
		LOGGER.info("Name is printing :"+fname);
		LOGGER.info("Name is printing :"+lname);
	}
	
	public void printObj(Employee employee) {
		
		employee.setEID(120);
		employee.setEmpName("data");
		LOGGER.info("Printing Object" +employee.getEID()+" "+employee.getEmpName());
	}
	
	public void getNameExchPrim(Exchange exchange , String fname ) {
		
		LOGGER.info(exchange.getIn().getHeader("myheader"));
		LOGGER.info("Name is printing :"+fname);
	}
	
	
}
