package com.bizruntime.Task2;

import java.util.Scanner;

public class CheckVowelsDigits {
	public static void main(String[] args) {
		String str;
		int vowel = 0;
		int digit = 0;
		int strlen = 0;
		double vowelpercent;
		double digitpercent;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String ");
		str = in.next();	
		strlen = str.length();
		
		for (int i = 0; i < strlen; i++) {
			if (str.charAt(i) == 'a'||str.charAt(i) == 'e'|| str.charAt(i) == 'i'||
					str.charAt(i) == 'o'|| str.charAt(i) == 'u'||str.charAt(i) == 'A'
					||str.charAt(i) == 'E'|| str.charAt(i) == 'I'||str.charAt(i) == 'O'
					||str.charAt(i) == 'U')	{
				
				++vowel;
			}else if (str.charAt(i) == '0'||str.charAt(i) == '1'||str.charAt(i) == '2'
				||str.charAt(i) == '3'||str.charAt(i) == '4'||str.charAt(i) == '5'
				||str.charAt(i) == '6'||str.charAt(i) == '7'||str.charAt(i) == '8'||str.charAt(i) == '9') {
				
				++digit;
			}
		}
		vowelpercent = 100*(double)vowel/strlen;
		digitpercent = 100*(double)digit/strlen;
		System.out.println("Number of vowels : "+vowel+"("+vowelpercent+"%)");
		System.out.println("Number of Digits : "+digit+"("+digitpercent+"%)");
		in.close();
	}
}
