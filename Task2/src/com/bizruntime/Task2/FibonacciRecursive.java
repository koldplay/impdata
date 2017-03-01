package com.bizruntime.Task2;

import java.util.Scanner;

public class FibonacciRecursive {
	public static void main(String[] args) {
		int number1 ;
		int number2;
		int number;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. 1");
		number1 = in.nextInt();
		System.out.println("Enter no. 2");
		number2 = in.nextInt();
		System.out.println(number1);
		System.out.println(number2);
		number = fibonaci(number1 , number2);
		System.out.println(number);
		in.close();
	}

	public static int fibonaci(int number1, int number2) {
		int number = number1+number2;
		number1 = number2;
		number2 = number;
		return number;
	}
}
