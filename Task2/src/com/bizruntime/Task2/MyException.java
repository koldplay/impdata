package com.bizruntime.Task2;

public class MyException extends Exception{
	private int detail ;
	public MyException(int a ) {
		detail = a;
	}
	public String toString() {
		return "MyException [" + detail + "]" ;
	}
}
