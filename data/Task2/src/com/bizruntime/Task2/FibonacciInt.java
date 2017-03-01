package com.bizruntime.Task2;//(undone)

import java.util.Scanner;

public class FibonacciInt {
	public static void main(String[] args) {
		int number = 0;
		int firstnumber = 1;
		int secondnumber = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter both numbers");
		number = in.nextInt();
		firstnumber = number;
		number = in.nextInt();
		secondnumber = number;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		
		number = firstnumber + secondnumber;
		while (number >=Integer.MIN_VALUE && number <= Integer.MAX_VALUE ) {
			number = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = number;
			System.out.println(number);
			if ((Integer.MAX_VALUE - firstnumber)< secondnumber) {
				break;
			}
		}
		in.close();		
	}
}
