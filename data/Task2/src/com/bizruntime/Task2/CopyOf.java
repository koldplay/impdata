package com.bizruntime.Task2;

import java.util.Scanner;

public class CopyOf {
	public static void main(String[] args) {
		int size ;
		int[] array;
		int[] array1;
		int[] array2; 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of method");
		size = in.nextInt();
		array = new int[size];
		for (int pos = 0; pos < size; pos++) {
			array[pos] = in.nextInt();
		}
		array1 = copyOf(array);
		for (int pos = 0; pos < array1.length; pos++) {
			if (pos >0) {
				System.out.print(",");
			}
			System.out.print(array1[pos]);
		}
		System.out.println("Enter new length");
		int key = in.nextInt();
		array2 = copyOfEx(array , key);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		in.close();
	}
	public static int[] copyOfEx(int[] array, int key) {
		int[] array1 = new int[key];
		for (int pos = 0; pos < key; pos++) {
			if (array.length < key) {
				array1[pos] = 0;
			}else {
				array1[pos] = array[pos];
			}
		}
		return array1;
	}
	public static int[] copyOf(int[] array){
		int[] array1 = new int[array.length];
		for (int pos = 0; pos < array1.length; pos++) {
			array1[pos] = array[pos];
		}
		return array1;
	}
}
