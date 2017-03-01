package com.bizruntime.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSerach {
	public static void main(String[] args) {
		int[] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
		//int value ;
		int key ;
		boolean flag;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value to search in array");
		key = in.nextInt();
		System.out.println(Arrays.toString(array));
//		value = linearSearch(array , key); 
//		if (value == 1) {
//			System.out.println("the value is found");			
//		}else{
//			System.out.println("the value is not found");
//		}
//		
		flag = linearSearch(array, key);
		if (flag == true) {
			System.out.println("the value is found");
		}else{
			System.out.println("the value is not found");
		}
		in.close();
	}

//	private static int linearSearch(int[] array, int key) {
//		int val = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (key == array[i]) {
//				val = 1;
//			}
//		}
//		return val;
//	}
	private static boolean linearSearch(int[] array, int key) {
		boolean val = false;
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				val = true;
			}
		}		return val;
	}
}
