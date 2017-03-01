package com.bizruntime.Task2;

import java.util.Scanner;

public class HasEight {
	public static void main(String[] args) {
		int number ;
		int sentinel = -1;
		boolean flag ;
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer or -1 to exit");
		number = in.nextInt();
		while (number != sentinel) {
			
			flag = hasEight(number);
			if (flag == true) {
				sum += number;
			}
			
			System.out.println("Enter a positive integer or -1 to exit");
			number = in.nextInt();
		}
		System.out.print("The magic sum is "+sum);
		in.close();
	}
	public static boolean hasEight(int number){
		boolean flag = false;	
		while (number !=0) {
			int check = number%10;
			if (check == 8 ) {
				flag = true;
			}
			number = number/10;
		}
		return flag;
	}
}
