package com.bizruntime.Task2;

import java.util.Scanner;

public class FactorialRecursive {
	public static void main(String[] args) {
		int number;
		int factorail;
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		factorail = factorial(number);
		System.out.println("Factorial of "+number +" is "+ factorail);
		in.close();
	}
	public static int factorial(int number){
		
		if (number == 0) {
			return 1;
		}else {
			return number*factorial(number-1);
		}
		
	}
}
