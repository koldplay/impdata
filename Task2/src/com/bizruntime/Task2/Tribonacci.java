package com.bizruntime.Task2;

public class Tribonacci {
	
	public static void main(String[] args) {
		int n = 4;
		int fn = 0;
		int firstno = 1;
		int secondno = 1;
		int thirdno = 2;
		int nMax = 20;
		
		System.out.print(firstno + ",");
		System.out.print(secondno +",");
		System.out.print(thirdno);
		while (n <= nMax) {
			fn = firstno + secondno +thirdno;
			System.out.print(","+fn);
			firstno = secondno;
			secondno = thirdno;
			thirdno = fn;
			++n;
		}
	}
}
