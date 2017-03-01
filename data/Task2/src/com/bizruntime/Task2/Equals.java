package com.bizruntime.Task2;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		int size;
		int[] array;
		int[] array1;
		boolean flag ;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size = in.nextInt();
		array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		array1 = new int[size];
		for (int j = 0; j < size; j++) {
			array1[j] = in.nextInt();
		}
		flag = equals(array,array1);
		if (flag == true) {
			System.out.println("Both Have similar elements");
		}else {
			System.out.println("try to put similar element");
		}
		in.close();
	}
	public static boolean equals(int[] array ,int[] array1){
		boolean flag = false;
		if (array.length == array1.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array[i] != array1[i]) {
					flag = false;
					break;
				}else {
					flag =true;
				}
			}
		}else {
			flag = false;
		}
		return flag;		
	}
}
