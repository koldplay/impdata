package com.bizruntime.Task2;

import java.util.Scanner;

public class TestPalindromicWord {
	public static void main(String[] args) {
		String str;
		int lowerbound ;
		int upperbound;
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		str = in.next();
		lowerbound = 0;
		upperbound = str.length()-1;
		while (lowerbound < upperbound) {
			

			if (str.charAt(lowerbound) == str.charAt(upperbound)) {
				flag = true;
			}else {
				flag = false;				
			}
			lowerbound++;
			upperbound--;

		}
		if (flag == true) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
		in.close();
	}
}
