package com.bizruntime.Task2;

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		int number;
		int key;
		int counter = 0;
		Scanner in = new Scanner(System.in);
		key = (int)Math.random();
		number = in.nextInt();
				
		if (number >= 0 || number <= 99) {
			while (number!=key) {
				if (number > key) {
					System.out.println("Try lower");
					number = in.nextInt();
					++counter;
				}else if (number < key) {
					System.out.println("Try higher");
					number = in.nextInt();
					++counter;
				}
			}
		}else{
			System.out.println("try to put value between 0 to 99");
			number = in.nextInt();
		}
		if (key == number) {
			System.out.println("You got it in "+counter + " trails!" );
		}
		
		in.close();
	}
}
