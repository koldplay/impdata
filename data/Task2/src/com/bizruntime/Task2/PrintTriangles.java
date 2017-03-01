package com.bizruntime.Task2;

import java.util.Scanner;

public class PrintTriangles {
	public static void main(String[] args) {
		int size ;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		size = in.nextInt();
		
		printXxxTriangle(size);
		in.close();
 	}

	public static void printXxxTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j =i; j >=1 ; --j) {
				if (j== i || j==1) {
					System.out.print("1"+ " ");
				}else {
					System.out.print((j-1)+" ");
				}
			}
			System.out.println();
		}
	}
}
