package com.bizruntime.Task2;

import java.util.Scanner;

public class Hex2Bin {
	public static void main(String[] args) {
		String hexaStr;
		int strlen;
		int value;
		int binary;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter HeaxaDecimal String");
		hexaStr = in.next();
		strlen = hexaStr.length();
		
		for (int pos = 0; pos<= strlen-1; ++pos) {
			if (hexaStr.charAt(pos) >= '0' && hexaStr.charAt(pos) <= '9') {
				char character  = hexaStr.charAt(pos);
				if (character == '0') {
					value = 0;
					binary = calculate(value);
					System.out.print("The equivalent binary for hexadecimal\"000"+binary+"\"");
				} else if (character == '1') {
					value = 1;
					binary = calculate(value);
					System.out.print("\"000"+binary+"\"");
				}else if (character == '2') {
					value = 2;
					binary =calculate(value);
					System.out.print("\"00"+binary+"\"");
				}else if (character == '3') {
					value = 3;
					binary =calculate(value);
					System.out.print("\"00"+binary+"\"");
				}else if (character == '4') {
					value = 4;
					binary =calculate(value);
					System.out.print("\"0"+binary+"\"");
				}else if (character == '5') {
					value = 5;
					binary = calculate(value);					
					System.out.print("\"0"+binary+"\"");
				}else if (character == '6') {
					value = 6;
					binary =calculate(value);
					System.out.print("\"0"+binary+"\"");
				}else if (character == '7') {
					value = 7;
					binary =calculate(value);
					System.out.print("\"0"+binary+"\"");
				}else if (character == '8') {
					value = 8;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				}else if (character == '9') {
					value = 9;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				}
			}else if (hexaStr.charAt(pos) >= 'a' && hexaStr.charAt(pos) <='f') {
				char character = hexaStr.charAt(pos);
				if (character == 'a') {
					value = 10;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				} else if(character == 'b') {
					value = 11;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				}else if (character == 'c') {
					value = 12;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				}else if (character == 'd') {
					value = 13;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				}else if (character == 'e') {
					value = 14;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				}else if (character == 'f') {
					value = 15;
					binary =calculate(value);
					System.out.print("\""+binary+"\"");
				}
			}else{
				System.out.println("Enter valid String of Hexa");
			}
		}
		System.out.println();
		in.close();
	}

	private static int calculate(int value) {
		int n = value;
		int abc = 0;
		int binary = 0;
		while (n!=0) {
			if (n >=8) {
				abc = Integer.parseInt("1000");
				n-=8;
			} else if(n>=4) {
				abc = Integer.parseInt("0100");
				n-=4;
			}else if(n>=2){
				abc = Integer.parseInt("0010");
				n-=2;
			}else if (n>=1) {
				abc = Integer.parseInt("0001");
				n-=1; 
			}else {
				abc = Integer.parseInt("0000");
			}
			binary+=abc;			
		}	
		return binary;
	}
}
