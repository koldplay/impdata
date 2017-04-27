package com.bizruntime.lifcycle;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalint implements MethodReplacer {

	public Object reimplement(Object o, Method m, Object[] parameter) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("new Cal Int");
		return null;
	}

}
