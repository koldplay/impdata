package com.bizruntime.Task2;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		String hexStr;
		int strlen;
		int decimal = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter HexaDecimal String");
		hexStr = in.next();
		strlen = hexStr.length();
		int value =0;
		for (int pos = strlen-1; pos >=0; --pos) {
			int power = strlen - 1 - pos;
			if (hexStr.charAt(pos)>= '0' && hexStr.charAt(pos) <= '9') {
				if (hexStr.charAt(pos) == '0') {
					value=0;
				}else if (hexStr.charAt(pos) == '1') {
					value = 1;
				}else if (hexStr.charAt(pos) == '2') {
					value = 1;
				}else if (hexStr.charAt(pos) == '3') {
					value = 1;
				}else if (hexStr.charAt(pos) == '4') {
					value = 1;
				}else if (hexStr.charAt(pos) == '5') {
					value = 1;
				}else if (hexStr.charAt(pos) == '6') {
					value = 1;
				}else if (hexStr.charAt(pos) == '7') {
					value = 1;
				}else if (hexStr.charAt(pos) == '8') {
					value = 1;
				}else if (hexStr.charAt(pos) == '9') {
					value = 1;
				}
				
				decimal += value*(int) Math.pow(16, power);
			} else if (hexStr.charAt(pos)>= 'a' && hexStr.charAt(pos) <= 'f' ) {
					if(hexStr.charAt(pos) == 'a'){
						value = 10;
					}else if (hexStr.charAt(pos)=='b') {
						value = 11;
					}else if (hexStr.charAt(pos)== 'c') {
						value = 12;
					}else if (hexStr.charAt(pos)=='d') {
						value = 13;
					}else if (hexStr.charAt(pos)== 'e') {
						value = 14;
					}else if (hexStr.charAt(pos)=='f') {
						value = 15;
					}			
				
				decimal += value*(int) Math.pow(16, power);
				
			}else if(hexStr.charAt(pos) >= 'A' && hexStr.charAt(pos)<= 'F'){
				if(hexStr.charAt(pos) == 'A'){
					value = 10;
				}else if (hexStr.charAt(pos)=='B') {
					value = 11;
				}else if (hexStr.charAt(pos)== 'C') {
					value = 12;
				}else if (hexStr.charAt(pos)=='D') {
					value = 13;
				}else if (hexStr.charAt(pos)== 'E') {
					value = 14;
				}else if (hexStr.charAt(pos)=='F') {
					value = 15;
				}			
			
				
				
				decimal += value*(int)Math.pow(16,power);
			}else {
				System.out.println("Invalid hexdecimal String "+hexStr);
				System.exit(1);
			}
		}
		System.out.println(decimal);
		in.close();
	}
}
