package com.bizruntime.Task2;

import java.util.Scanner;

public class WordGuess {
	public static void main(String[] args) {
		String str = "testing";
		String[] str1 = new String[str.length()];
		String check ;
		char character ;
		boolean flag = false;
		
		Scanner in = new Scanner(System.in);
		check = in.next();
		
		if (strCheck(check, str) == true) {
			System.out.println("you got it");
		}
		while (strCheck(check, str) == false) {
			if (check.length() == 1) {
				character = check.charAt(0);
				str1 = strcom(str , character, str1);
				check = in.next();
			}else {
				flag = strCheck(check , str);
			}
			System.out.println(flag);
		}
		
		in.close();
	}

	public static String[] strcom(String str, char character, String[] str1) {
			
		for (int i = 0; i < str.length(); i++) {
			if (character == str.charAt(i)) {
				str1[i] = String.valueOf(character);
			}
		}
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == null) {
				System.out.println(" ");
			}else{
				System.out.println(str1[i]);
			}
		}
		return str1;
		//System.out.println(str1);		
	}

	public static boolean strCheck(String check, String str) {
		boolean flag = false;
		if (check.length() == str.length()) {
			for (int i = 0; i < check.length(); i++) {
				if (check.charAt(i) == str.charAt(i)) {
					flag = true;
				}
			}
		}
		
		return flag;
		}
}
