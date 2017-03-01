package com.bizruntime.Task2;

import java.util.Scanner;

public class PhoneKeyPad {
	public static void main(String[] args) {
		String str;
		Scanner in = new Scanner(System.in);
		str = in.next().toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':case 'b':case 'c':
				System.out.print(1);
				break;
				
			case 'd':case 'e':case 'f':
				System.out.print(2);
				break;
				
			case 'g':case 'h':case 'i':
				System.out.print(3);
				break;
				
			case 'j':case 'k':case 'l':
				System.out.print(4);
				break;
				
			case 'm':case 'n':case 'o':
				System.out.print(5);
				break;
				
			case 'p':case 'q':case 'r':
				System.out.print(6);
				break;
				
			case 's':case 't':case 'u':
				System.out.print(7);
				break;
				
			case 'v':case 'w':case 'x':
				System.out.print(8);
				break;
				
			case 'y':case 'z':
				System.out.print(9);
				break;
				
			default:
				System.out.println("Enter Valid String Character");
				break;
			}
		}
		in.close();
	}
}
