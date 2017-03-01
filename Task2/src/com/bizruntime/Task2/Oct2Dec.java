package com.bizruntime.Task2;

import java.util.Scanner;

public class Oct2Dec {
	public static void main(String[] args) {
		String stroct;
		int strlen;
		int value = 0;
		int decimal = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter octat value");
		stroct = in.next();
		strlen = stroct.length();
		for (int pos = strlen-1; pos >= 0; --pos) {
			
			if (stroct.charAt(pos)>='0'&& stroct.charAt(pos) <= '7') {
				int order = strlen - 1- pos;
				if (stroct.charAt(pos) == '0') {
					value = 0;
				}else if (stroct.charAt(pos) == '1') {
					value = 1;
				}else if (stroct.charAt(pos) == '2') {
					value = 2;
				}else if (stroct.charAt(pos) == '3') {
					value = 3;
				}else if (stroct.charAt(pos) == '4') {
					value = 4;
				}else if (stroct.charAt(pos) == '5') {
					value = 5;
				}else if (stroct.charAt(pos) == '6') {
					value = 6;
				}else if (stroct.charAt(pos) == '7') {
					value = 7;
				}else {
					System.out.println("enter some valid");
				}
				decimal += value*(int)Math.pow(8, order);
			}
			
		}
		System.out.println(decimal);
		in.close();
	}
}
