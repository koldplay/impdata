package com.bizruntime.Task2;

import java.util.Scanner;

public class Contains {
	public static void main(String[] args) {
		int key ;
		int size ;
		int[] array;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size = in.nextInt();
		array = new int[size];
		for (int pos = 0; pos < size; pos++) {
			array[pos] = in.nextInt();
		}
		System.out.println("Enter Key Which is to be Search");
		key = in.nextInt();
		boolean flag = contains(array ,key);
		if (flag == true) {
			System.out.println("Yes! Element is present");
		}else{
			System.out.println("No! Array does not contains element");
		}
		in.close();
	}

	public static boolean contains(int[] array, int key) {
		boolean flag = false;
		for (int pos = 0; pos < array.length; pos++) {
			if (array[pos] == key) {
				flag = true;
			}
		}
		return flag;
	}
}
