package com.bizruntime.Task2;

public class SumDigits {
	public static void main(String[] args) {
		int operand = Integer.parseInt(args[0]);
		int sum = 0;
		String len = args[0];
		int remender;
		System.out.println("sum of the digits = "+args[0]);
		for (int i = 0; i < len.length(); i++) {
			remender = operand%10;
			if (i == len.length()-1) {
				System.out.print(remender+"=");
			}else{
				System.out.print(remender +"+");
			}
			sum += remender;
			operand = operand/10;
		}
		System.out.println(sum);
	}
}
