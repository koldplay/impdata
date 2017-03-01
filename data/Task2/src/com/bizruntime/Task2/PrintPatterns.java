package com.bizruntime.Task2;

import java.util.Scanner;

public class PrintPatterns {
	public static void main(String[] args) {
		int size ;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		size = in.nextInt();	
////		printPatternXA(size);
//		System.out.println();
////		printPatternXB(size);
//		System.out.println();
////		printPatternXC(size);
//		System.out.println();
////		printPatternXD(size);
//		System.out.println();
////		printPatternXE(size);
//		System.out.println();
////		printPatternXF(size);
//		System.out.println();
////		printPatternXG(size);
//		System.out.println();
////		printPatternXH(size);
//		System.out.println();
////		printPatternXI(size);
//		System.out.println();
//		printPatternXJ(size);
//		System.out.println();
//		printPatternXK(size);
		printPatternXL(size);

		in.close();
	}
		
	public static void printPatternXA(int number){
		for (int i = 0; i < number; i++) {
			for (int j = i; j >0; --j) {
				System.out.print("  ");
			}for (int j = (number-i)*2-1; j >= 1; --j) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	public static void printPatternXB(int number){
		
			for (int i = 0; i < number; i++) {
				for (int j = 1; j < number-i; j++) {
					System.out.print("  ");
				}for (int k = 0; k < i*2-1 ; k++) {
					System.out.print("# ");
				}
				System.out.println();
			}
		
	}
	public static void printPatternXC(int number){
		for (int i = 0; i <= number; i++) {
			for (int j = 1; j < number-i; j++) {
				System.out.print("   ");
			}for (int k = 0; k < i*2-1 ; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for (int i = 0; i < number; i++) {
			for (int j = i; j >0; --j) {
				System.out.print("  ");
			}for (int j = (number-i)*2-1; j >= 1; --j) {
				System.out.print("# ");
			}
			System.out.println();
		}		
}
	
	public static void printPatternXD(int size){
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <=row ; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void printPatternXE(int size){
		for (int i = 0;  i < size; i++) {
			for (int j = i ; j > 0; j--) {
				System.out.print(" ");
			}for (int l = 1; l <= size ; l++) {
				System.out.print(l +" ");
			}
			System.out.println();
		}		
	}
	private static void printPatternXF(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size-1; j >=i ; j--) {
				System.out.print(" ");
			}for (int k = i; k >=1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	public static void printPatternXG(int size){
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >=i; j--) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	public static void printPatternXH(int number){
		int counter = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 1; j <= number-i; j++) {
				System.out.print("  ");
			}for (int k = 1; k <= i; k++) {
				System.out.print(k +" ");
				counter++;
			}for (int j = counter-1; j >=1; j--) {
				System.out.print(j+" ");
			}
			counter =0;		
			System.out.println();
		}
	}
	public static void printPatternXI(int number){
		int counter = 0;
		int j1 = 0;
		int count = 0;
		for (int i = number; i >=0; i--) {
			for (int k = count; k>=1; k--) {
				System.out.print(" ");
			}
			for(j1 = 1; j1 <=i; ++j1) {
				System.out.print(j1);
				counter++;
			}			
			if (counter == i) {				
				for (int j = counter-1; j >= 1; j--) {
					System.out.print(j);
				}
				counter = 0;
			}			
		System.out.println();
		count ++;
		}	
	}
	public static void printPatternXJ(int size){
		int count = 1;
		for (int i = 1; i <= size; i++) {
			for (int k = 1; k <=i ; k++) {
				System.out.print(k);
			}
			for (int j = size*2-1; j >1; j--) {
				System.out.print(" ");
			}for (int l = count; l>= 1; l--) {
				System.out.print(l);
			}
			count ++;
			System.out.println();
		}	
	}
	public static void printPatternXK(int number){
		int counter =0;
		int j1;
		for (int i = number; i >=0; i--) {
			for(j1 = 1; j1 <=i; ++j1) {
				System.out.print(j1 + " ");
				counter++;
			}
			for (int j = j1; j <number; j++) {
				System.out.print(" ");
			}
			
			if (counter == i) {
				for (int j = j1; j > 0; j--) {
					System.out.print(" ");
				}
				
				for (int j = counter-1; j >= 1; j--) {
					System.out.print(j +" ");
				}
				counter = 0;
			}			
		System.out.println();	
		}	
	}
	public static void printPatternXL(int number){
		int counter = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 1; j <= number-i; j++) {
				System.out.print("  ");
			}for (int k = 0; k <= i; k++) {
				System.out.print((int)Math.pow(2, k) +" ");
				counter++;
			}for (int j = counter-2; j >=0; j--) {
				System.out.print((int)Math.pow(2, j)+" ");
			}
			counter =0;		
			System.out.println();
		}
	}
}
