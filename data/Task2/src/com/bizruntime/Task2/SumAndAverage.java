package com.bizruntime.Task2;

public class SumAndAverage {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int lowerbound = 1;
		int upperbound = 100;
		int count = 0;
		double average;
		
		for (int i = lowerbound; i <= upperbound; i++) {
		sum += i;
		}
//		int number = lowerbound;
//		while (number <= upperbound) {
//			sum += number;
//			++number;
//		}
//		do {
//			sum += number;
//			++number;
//		} while (number <= upperbound);
		

//		for (int i = lowerbound; i <= upperbound; i++) {
//		sum += i;
//		count++;
//		}
//		System.out.println(count);
		

//		for (int i = lowerbound; i <= upperbound; i++) {
//			if (i%2 == 0) {
//				continue;
//			}else {
//				sum += i;
//			}
//			
//			//++count;
//		}
		
//		for (int i = lowerbound; i <= upperbound; i++) {
//			sum+=(i*i);
//		}
//		
		System.out.println(" The sum is " +sum);
		average = (double)sum/100;
		System.out.println(" The Average is " +average);
	}
}
