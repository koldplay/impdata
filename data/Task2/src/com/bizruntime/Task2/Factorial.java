package com.bizruntime.Task2;

public class Factorial {
	public static void main(String[] args) {
		int n = 20;
		int factorial = 1;//solution is long in place of int.
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial*i;
		}
		System.out.println("The factorial of " +n+ " is "+factorial);
	}
}
