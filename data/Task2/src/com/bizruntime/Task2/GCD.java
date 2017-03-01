package com.bizruntime.Task2;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		int number1;
		int number2;
		int gcd;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		number1 = in.nextInt();
		number2 = in.nextInt();
		
		gcd = gcd(number1 , number2);
		System.out.println(gcd);
		in.close();
	}

	public static int gcd(int number1, int number2) {
		int number = 0 ;
		if (number2  == 0) {
			number = number1;
		}else {
			return gcd(number2,remender(number1 ,number2));
		}
		return number;
	}

	private static int remender(int number1, int number2) {
		int number = 0;
			number = number1%number2;
		return number;
	}
}
