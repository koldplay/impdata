package com.bizruntime.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://test.bizruntime.com/", portName = "CalculatorServicePort", serviceName = "CalculatorServiceService")
public class CalculatorService {
	
	@WebMethod(operationName = "add", action = "urn:Add")
	@RequestWrapper(className = "com.bizruntime.test.jaxws.Add", localName = "add", targetNamespace = "http://test.bizruntime.com/")
	@ResponseWrapper(className = "com.bizruntime.test.jaxws.AddResponse", localName = "addResponse", targetNamespace = "http://test.bizruntime.com/")
	@WebResult(name = "return")
	public int add(@WebParam(name = "arg0") int i , @WebParam(name = "arg1") int j){
		return i+j;
	}
	@WebMethod(operationName = "sub", action = "urn:Sub")
	@RequestWrapper(className = "com.bizruntime.test.jaxws.Sub", localName = "sub", targetNamespace = "http://test.bizruntime.com/")
	@ResponseWrapper(className = "com.bizruntime.test.jaxws.SubResponse", localName = "subResponse", targetNamespace = "http://test.bizruntime.com/")
	@WebResult(name = "return")
	public int sub(@WebParam(name = "arg0") int i , @WebParam(name = "arg1") int j){
		return i-j;
	}
}
