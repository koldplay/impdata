package com.bizruntime.test;

import javax.jws.WebService;

@WebService(targetNamespace = "http://test.bizruntime.com/", portName = "CalculatorTestPort", serviceName = "CalculatorTestService", endpointInterface = "com.bizruntime.test.Calculator")
public class CalculatorTest implements Calculator {
	public int add(int  i , int j ){
		return i+j;
	}
	public int sub(int  i , int j ){
		return i-j;
	}
}
