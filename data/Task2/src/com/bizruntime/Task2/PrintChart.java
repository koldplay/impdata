package com.bizruntime.Task2;

import java.util.Scanner;

public class PrintChart {
	public static void main(String[] args) {
		int size;
		int[] value ;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of bars");
		size = in.nextInt();
		value = new int[size];
		for (int pos = 0; pos < size; pos++) {
			System.out.println("Enter bar "+pos+" value: ");
			value[pos] = in.nextInt();
		}
		readInput(value);
		in.close();
	}
	public static void readInput(int[] array){
		for (int pos = 0; pos < array.length; pos++) {
			printChart(array[pos]);
			System.out.println("("+array[pos]+")");
		}
	}
	public static void printChart(int pos){
		for (int j = 0; j < pos; j++) {
			System.out.print("*");
		}
	}
}
