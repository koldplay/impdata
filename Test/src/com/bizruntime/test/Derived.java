package com.bizruntime.test;

public class Derived extends Test {
	public Derived(){
		System.out.println("derived constructor");
		System.out.println("n = "+n);
		//System.out.println("n_pri"+n_pri);
		System.out.println("n_pro"+n_pro );
		System.out.println("n_pub"+n_pub);
	}
	public static void main(String[] args) {
		
	}
}
