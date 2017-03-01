package com.bizruntime.Task2;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		String binstr ;
		int strlen;
		int decimal = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Binary String");
		binstr = in.next();
		strlen = binstr.length();
		for (int pos = strlen-1; pos >= 0; --pos) {
			int power = strlen-1-pos;
			if (binstr.charAt(pos) == '1') {
				decimal+=(int)Math.pow(2,power);
			}else if (binstr.charAt(pos) == '0') {
				continue;
			} else if (binstr.charAt(pos) != '0') {
				System.out.println("error: invalid binary string \"" + binstr + "\"");
				System.exit(1);
			}
		}
		System.out.println("The equivalent decimal number for binary "+binstr+" is :"+decimal);
		in.close();
	}
}
