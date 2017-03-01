package com.bizruntime.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int size ;
		int size1;
		int[] array;
		int[] array1;
		boolean flag = false ;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size = in.nextInt();
		System.out.println("Enter elements of first array");
		array = new int[size];
		for (int pos = 0; pos < size; pos++) {
			array[pos] = in.nextInt();
		}
		System.out.println("Enter Size of Array");
		size1 = in.nextInt();		
		System.out.println("Enter elements of second array");
		array1 = new int[size1];
		for (int pos = 0; pos < size1; pos++) {
			array1[pos] = in.nextInt();
		}
		flag = swap(array, array1);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		if (flag == true) {
			System.out.println("both are fully swapped");
		}else{
			System.out.println("sorry size is different");
		}
		in.close();
	}
	public static boolean swap (int[] array , int[] array1){
		boolean flag = false;
		if (array.length == array1.length) {
			for (int pos = 0; pos < array1.length; pos++) {
				int temp = array[pos];
				array[pos] = array1[pos];
				array1[pos] = temp;
			}
			flag = true;
		}		
		return flag;
	}
}
