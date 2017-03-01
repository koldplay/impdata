package com.bizruntime.Task2;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			compute(1);
			compute(2);
		} catch (MyException e) {
			System.out.println("Cought" + e);
		}
	}
	static void compute(int a ) throws MyException{
		System.out.println("Called " + a);
		if (a>10 ) {
			throw new MyException(a);
		}
	}
}
