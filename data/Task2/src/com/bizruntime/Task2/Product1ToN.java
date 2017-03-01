package com.bizruntime.Task2;

public class Product1ToN {
	
	public static void main(String[] args) {
		long total = 1;
		int lowerbound = 1;
		int upperbound = 5;
		
		for (int i = lowerbound; i <= upperbound; i++) {
			
			total = total * i;
		}
		System.out.println("The Product Of 1 to N " + total);
	}
}
