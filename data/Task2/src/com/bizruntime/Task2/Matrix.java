package com.bizruntime.Task2;//not done

import java.util.Scanner;

public class Matrix {
	public static int[][] array; 
	public static double[][] array1;
	static Scanner in = new Scanner(System.in);
	static int count = 0;
	
	public static void main(String[] args) {
		int row ;
		int cols ;
		int[][] array;
		double[][] array1;
		int[][] array2;
		double[][] array3;
		boolean flag = false;
		
		
		System.out.println("Enter size of row");
		row  = in.nextInt();
		System.out.println("Enter size of col");
		cols = in.nextInt();
		System.out.println("Enter values to 1st int array");
		array = readArray(row ,cols);
		printMatrix(array);
		System.out.println("Enter values to 2nd int array");
		array2 = readArray(row, cols);
		
		flag = haveSameDimension(array, array2);
		if (flag== true) {
			System.out.println("has Same dimension");
			int[][] array4 =add(array, array2);
			printMatrix(array4);
		}else {
			System.out.println("sorry! they don't");
		}
		System.out.println("Enter values to 1st double array");
		array1 = readDoubleArray(row, cols);
		printMatrix(array1);
		System.out.println("Enter values to 2nd double array");
		array3 = readDoubleArray(row, cols);
		haveSameDimension(array1, array3);
		if (flag==true) {
			System.out.println("has Same dimension");
			double[][] array5 = add(array1, array3);
			printMatrix(array5);
		}else {
			System.out.println("sorry! they don't");
		}
		
		
	}
	public static int[][] readArray(int row ,int col){
		if (count >0) {
			System.out.println("Enter row value for 2nd array");
			row = in.nextInt();
			System.out.println("Enter col value for 2nd array");
			col = in.nextInt();
			System.out.println("Enter 2nd array elements");
		}
		array = new int[row][col];
		for (int pos = 0; pos < row; pos++) {
			for (int pos1 = 0; pos1 < col; pos1++) {
				array[pos][pos1] = in.nextInt();
			}
		}
		
		count++;
		return array;
	}
	public static double[][] readDoubleArray(int row ,int col){
		if (count >0) {
			System.out.println("Enter row value for 2nd array");
			row = in.nextInt();
			System.out.println("Enter col value for 2nd array");
			col = in.nextInt();
			System.out.println("Enter 2nd array elements");
		}
			array1 = new double[row][col];
			for (int pos = 0; pos < row; pos++) {
				for (int pos1 = 0; pos1 < col; pos1++) {
					array1[pos][pos1] = in.nextDouble();
				}
			}
			count++;
			return array1;
		}
	public static void printMatrix(int[][] array){
		for (int pos = 0; pos <array.length; pos++) {
			for (int pos1 = 0; pos1 < array[pos].length; pos1++) {
				System.out.print(array[pos][pos1] +" ");
			}
			System.out.println();
		}
	}
	public static void printMatrix(double[][] array){
		for (int pos = 0; pos <array.length; pos++) {
			for (int pos1 = 0; pos1 < array[pos].length; pos1++) {
				System.out.print(array[pos][pos1] +" ");
			}
			System.out.println();
		}
	}
	public static boolean haveSameDimension(int[][] array1, int[][] array2){
		boolean flag = false;
		if (array1.length == array2.length) {
			flag = true;
		}
		return flag;
	}
	public static boolean haveSameDimension(double[][] array1, double[][] array2){
		boolean flag = false;
		if (array1.length == array2.length) {
			flag = true;
		}		
		return flag;
	}
	public static int[][] add(int[][] array1 ,int[][] array2){
		int[][] array3 =new int[array1.length][array2.length];
		for (int pos = 0; pos < array1.length; pos++) {
			for (int pos1 = 0; pos1 < array1[pos].length; pos1++) {
				array3[pos][pos1] =array1[pos][pos1]+array2[pos][pos1];
			}
		}
		return array3;
	}
	public static double[][] add(double[][] array1 ,double[][] array2){
		int i = array1.length;
		System.out.println(i);
		double[][] array3 = new double[i][i];
		for (int pos = 0; pos < array1.length; pos++) {
			for (int pos1 = 0; pos1 < array1[pos].length; pos1++) {
				array3[pos][pos1] = array1[pos][pos1]+array2[pos][pos1];
			}
		}
		return array3;
	}
}
