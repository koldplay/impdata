package com.bizruntime.Task2;

import java.util.Scanner;

public class IntArray {
	public static void main(String[] args) {
		int n;
		int[] arr = null;
		double[] arr1 = null;	
		float[] arr2 = null;
		int[] arr4 = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		n = in.nextInt();
//		arr = new int[n];
//		for (int pos = 0; pos < n; pos++) {
//			arr[pos] = in.nextInt();
//		}
//		printIntArray(arr);
//		arr1 = new double[n];
//		for (int pos1 = 0; pos1 < n; pos1++) {
//			arr1[pos1] = in.nextDouble();
//		}
//		printDoubleArray(arr1);		
//		arr2 = new float[n];
//		for (int pos2 = 0; pos2 < n; pos2++) {
//			arr2[pos2] = in.nextFloat();
//		}
//		printFloatArray(arr2);
		arr4 = new int[n];
		for (int pos4 = 0; pos4 < n; pos4++) {
			arr4[pos4] = in.nextInt();
		}
		printToString(arr4);
		in.close();
	}
	public static void printFloatArray(float[] arr2) {
		for (int pos2 = 0; pos2 < arr2.length; pos2++) {
			if (pos2 > 0) {
				System.out.print(",");
			}
			System.out.print(arr2[pos2]);
		}
		
	}
	public static void printIntArray(int[] arr){
		for (int pos = 0; pos < arr.length; pos++) {
			if (pos > 0) {
				System.out.print(",");
			}
			System.out.print(arr[pos]);
		}	
	}
	public static void printDoubleArray(double[] arr1){
		for (int pos1 = 0; pos1 < arr1.length; pos1++) {
			if (pos1 > 0) {
				System.out.print(",");
			}
			System.out.print(arr1[pos1]);
		}
	}
	public static String printToString(int[] arr){
		System.out.print("{");
		for (int pos3 = 0; pos3 < arr.length; pos3++) {
			
			if (pos3 > 0) {
				System.out.print(",");
			}
			System.out.print(arr[pos3]);
			
		}
		System.out.print("}");
		return "";
	}
}
