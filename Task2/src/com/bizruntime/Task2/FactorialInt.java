package com.bizruntime.Task2;

import java.util.Scanner;

public class FactorialInt {
	public static void main(String[] args) {
		int number ;
		Integer check;
		Scanner in = new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		number = in.nextInt();
		check = factorial(number);
		System.out.println("F("+number+") = "+check);
		while (check >= Integer.MIN_VALUE || check <= Integer.MAX_VALUE) {
			number = in.nextInt();			
			check = factorial(number);
			System.out.println("F("+number+") = "+check);
		}		
		in.close();
	}

	public static int factorial(int number) {
		Integer fact = 1;
		if (number == 0) {
			fact = 1;
		}else{
			for (int i = 1; i <= number; i++) {
				fact *= i;
			}
		}
		return fact;
	}
}
