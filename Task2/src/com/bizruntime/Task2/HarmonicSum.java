package com.bizruntime.Task2;

public class HarmonicSum {
	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		
		for (int i = lowerbound; i <= upperbound; ++i){
			sumL2R +=(double)1/i;
		}
		System.out.println("The sum from left to right is"+sumL2R);
		
		for (int i = upperbound; i >= lowerbound; ++i) {
			sumR2L += (double)1/i;
		}
		System.out.println("The sum from right to left is"+sumR2L);
		double differencebetsums = sumL2R - sumR2L;
		System.out.println(""+differencebetsums);
	}
}
