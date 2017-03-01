package com.bizruntime.Task2;

import java.util.Scanner;

public class GradesHistogram {
	public static void main(String[] args) {
		int size;
		int[] gram;
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size");
		size = in.nextInt();
		gram = new int[size];
		for (int pos = 0; pos < size; ++pos) {
			gram[pos] = in.nextInt();
		}
		for (int i = 0; i < 10; ++i) {
			if (gram[i] == 0) {
				System.out.println(i+"0"+"-"+i+"9"+" :");
			}else {
				System.out.print(i+"0"+"-"+i+"9"+" :");
				print(gram[i]);
			}
		}
		for (int i = 0; i < 10; ++i) {
			if (gram[i] == 0) {
				System.out.println(i+"0"+"-"+i+"9"+" :");
				System.out.print("");
			}else {
				print1(gram[i]);
				System.out.println(i+"0"+"-"+i+"9"+" :");
				System.out.print("");
			}
		}
		
		in.close();
	}
	public static void print(int no){
		for (int i = 0; i < no; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void print1(int no){
		for (int i = 0; i < no; i++) {
			System.out.println("*");
		}
		//System.out.println();
	}
}
