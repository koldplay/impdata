package com.bizruntime.Task2;

public class ComputePI {
	
	public static void main(String[] args) {
		double sum = 0.0;
		int maxDenominator = 10000000;
		for (int i = 1; i <= maxDenominator; i+=2) {
			if (i%4==1) {
				sum +=(double)1/i;
			}else if (i%4 == 3) {
				sum -= (double)1/i;
			}else {
				System.out.println("The computer has gone crazy?!");
			}
		}
		System.out.println(sum);
	}
}
