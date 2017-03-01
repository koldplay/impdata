package com.bizruntime.Task2;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n = 3;
		int fn = 0;
		int fisrtno = 1;
		int secondno = 1;
		int limit = 20;
		double sum = 0;
		int sumfor = 0;
		
		System.out.println("The First "+ limit +"Fibonacci numbers are:");
		System.out.print(fisrtno+",");
		System.out.print(secondno);
		while (n <= limit) {
			fn = fisrtno + secondno;
			++n;
			sumfor += fn;
			secondno = fisrtno;
			fisrtno = fn;
			System.out.print(","+fn);
		}
		System.out.println();
		sum = (double)sumfor/20;
		System.out.println(" The average is " + sum);
	}
}
