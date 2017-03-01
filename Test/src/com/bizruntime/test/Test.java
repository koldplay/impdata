package com.bizruntime.test;

public class Test {
	int n  = 1;
	public int n_pub  = 2 ;
	private int n_pri = 3;
	protected int n_pro = 4;
	
	public Test (){
		System.out.println("base constructor");
		System.out.println("n = "+n);
		System.out.println("n_pri"+n_pri);
		System.out.println("n_pro"+n_pro);
		System.out.println("n_pub"+n_pub);
	}
}
