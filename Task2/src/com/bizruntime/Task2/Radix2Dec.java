package com.bizruntime.Task2;

import java.util.Scanner;

public class Radix2Dec {
	public static void main(String[] args) {
		String strradix ;
		int decimal = 0;
		int radix ;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Radix value");
		radix = in.nextInt();
		System.out.println("Enter String Radix");
		strradix = in.next().toLowerCase();

		switch (radix) {
		case 2:
				decimal = binary(strradix, radix);
				System.out.println("The equivalent decimal number "+strradix +" is "+decimal);
			break;
			
		case 8:
			decimal = octal(strradix, radix);
			System.out.println("The equivalent decimal number "+strradix +" is "+decimal);
			break;
			
		case 16:
			decimal = hexadecimal(strradix, radix);
			System.out.println("The equivalent decimal number "+strradix +" is "+decimal);
			break;

		default:
			System.out.println("Number is not in formate" + strradix);
			break;
		}
		in.close();
	}
	public static int binary (String str ,int radix){
		int strlen = str.length();
		int order;
		int decimal = 0;
		for (int pos = strlen-1; pos >= 0; --pos) {
			order  = strlen - 1 - pos;
			if (str.charAt(pos) == '1') {
				decimal += (int)Math.pow(radix, order);
			} else if(str.charAt(pos) == '0'){
				continue;
			}else if (str.charAt(pos) != '0') {
				System.out.println("Invalid String" + str);
			}
		}
		return decimal;
	}
	public static int octal (String str ,int radix){
		int strlen = str.length();
		int order;
		int decimal = 0;
		int value = 0;
		for (int pos = strlen -1; pos >= 0 ; --pos) {
			order = strlen - 1 -pos;
			if (str.charAt(pos) >= '0' && str.charAt(pos) <= '7') {
				if (str.charAt(pos) == '0') {
					value = 0;
				} else if (str.charAt(pos) == '1'){
					value = 1;
				}else if (str.charAt(pos) == '2') {
					value = 2;
				}else if (str.charAt(pos) == '3') {
					value = 3;
				}else if (str.charAt(pos) == '4') {
					value = 4;
				}else if ( str.charAt(pos) == '5') {
					value = 5;
				}else if (str.charAt(pos) == '6') {
					value = 6;
				}else if(str.charAt(pos) == '7'){
					value = 7;
				}
				}else {
					System.out.println("Invalid String Input");
				}
			decimal += value*(int)Math.pow(radix, order);
		}
		return decimal;
	}
	public static int hexadecimal (String str ,int radix){
		int strlen = str.length();
		int order = 0;
		int decimal = 0;
		int value = 0;
		for (int pos = strlen -1; pos >=0 ; --pos) {
			order = strlen -1 -pos;
			if (str.charAt(pos) >='0' && str.charAt(pos) <= '9') {
				if (str.charAt(pos) == '0') {
					value=0;
				}else if (str.charAt(pos) == '1') {
					value = 1;
				}else if (str.charAt(pos) == '2') {
					value = 1;
				}else if (str.charAt(pos) == '3') {
					value = 1;
				}else if (str.charAt(pos) == '4') {
					value = 1;
				}else if (str.charAt(pos) == '5') {
					value = 1;
				}else if (str.charAt(pos) == '6') {
					value = 1;
				}else if (str.charAt(pos) == '7') {
					value = 1;
				}else if (str.charAt(pos) == '8') {
					value = 1;
				}else if (str.charAt(pos) == '9') {
					value = 1;
				}
				decimal += value* (int)Math.pow(radix ,order);
			} else if(str.charAt(pos)>= 'a' && str.charAt(pos)<= 'f'){
				if(str.charAt(pos) == 'a'){
					value = 10;
				}else if (str.charAt(pos)=='b') {
					value = 11;
				}else if (str.charAt(pos)== 'c') {
					value = 12;
				}else if (str.charAt(pos)=='d') {
					value = 13;
				}else if (str.charAt(pos)== 'e') {
					value = 14;
				}else if (str.charAt(pos)=='f') {
					value = 15;
				}			
				decimal += value*(int)Math.pow(radix, order);
			}else {
				System.out.println("Inter Valid String");
			}
		}
		return decimal;
	}
}
