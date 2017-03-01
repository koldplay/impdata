package com.bizruntime.Task2;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int key ;
		int[] array ={11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
		int fisrtindex = 0;
		int lastindex = array.length-1;
		
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter key value");
		key = in.nextInt();
		flag = binarySearch(array , key , fisrtindex , lastindex);
		if (flag == true) {
			System.out.println("Value found in array");
		}else {
			System.out.println("Value is not found in array");
		}
		in.close();
	}

	private static boolean binarySearch(int[] array, int key, int fisrtindex, int lastindex) {
		boolean flag = false;
		int midile = (fisrtindex+ lastindex)/2;
		if (array[midile] == key) {
			flag = true;
		}else if (key <array[midile]) {
			lastindex = midile ;
			binarySearch(array, key, fisrtindex, lastindex);
		}else if (key > array[midile]) {
			fisrtindex = midile ;
			binarySearch(array, key, fisrtindex, lastindex);
		}
		return flag;
	}
}
