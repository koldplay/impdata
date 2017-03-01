package com.bizruntime.test;

import javax.jws.WebService;

@WebService(name = "Calculator", targetNamespace = "http://test.bizruntime.com/")
public interface Calculator {

	int add(int i, int j);

	int sub(int i, int j);

}