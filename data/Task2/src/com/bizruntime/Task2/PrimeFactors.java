package com.bizruntime.Task2;

public class PrimeFactors {
	public static void main(String[] args) {
		int upperbound = 10000;
		int counter = 0; 
		int count =0;
		int upper = 100;
		for (int i = 1; i <= upperbound; i++) {
			counter = isPrime(i);
			if (counter != 1) {
				++count;
				System.out.println(i);			
			}
		}
		System.out.println(count);
		for (int i = 1; i <= upper; i++) {
			primefactor(i);
		}
	}

	public static int isPrime(int n) {
		int m = 0,flag = 0;
		m = n/2;
		for (int i = 2; i <= m; i++) {
			if (n%i == 0) {
				flag = 1;
			}
		}
		return flag ;
	}
	public static void primefactor(int n){
		int sum = 1;
		int check = 0;
			for (int i = 1; i <=n/2; i++) {
				check = isPrime(i);
				if (check  != 1 && n%i ==0) {
					sum *= i;
				}
			}
			if (sum == n) {
				System.out.println(n);
			}		
	}
}
