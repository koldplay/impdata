package com.bizruntime.Task2;

import java.util.Scanner;

public class IsOdd {
	public static void main(String[] args) {
		int number ;
		boolean flag ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number");
		number = in.nextInt();
		flag = isOdd(number);
		if (flag == true) {
			System.out.println("EVEN");
		}else{
			System.out.println("ODD");
		}
		System.out.println();
		in.close();
	}
	public static boolean isOdd(int number){
		boolean flag = false;
		if (number == -(number)) {
			number = number*(-1);
		}
		if (number%2 == 0) {
			flag = true;
		}else{
			flag = false;
		}	
		return flag;
	}

}
