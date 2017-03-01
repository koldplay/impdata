package com.bizruntime.Task2;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String inStr;
		int strlen;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		inStr = in.next();
		strlen  = inStr.length();
		System.out.print("The reverse of the String "+inStr+" is ");
		for (int i = strlen-1; i >=0; --i) {
			System.out.print(inStr.charAt(i));
		}
		
		in.close();
	}
}
