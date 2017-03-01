package com.bizruntime.Task2;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int size ;
		int[] array;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size = in.nextInt();
		array = new int[size];
		for (int pos = 0; pos < size; pos++) {
			array[pos] = in.nextInt();
		}
		reverse(array);
		in.close();
	}
	public static void reverse(int[] array){
		int lower = 0;
		int upper = array.length-1;
		while (lower < upper) {
			int temp = array[upper];
			array[upper] = array[lower];
			array[lower] = temp;
			lower++;
			upper--;
		}
		for (int pos = 0; pos < array.length; pos++) {
			if (pos>0) {
				System.out.print(",");
			}
			System.out.print(array[pos]);
		}
	}
}
