package com.bizruntime.Task2;

public class PrintPattern {
	public static void main(String[] args) {
		int size = 7;
		for (int row = 1; row <= size; row++) {//for (a)
			for (int col = 1; col <= row; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
		for (int row = size; row >= 1; --row) {//for (b)
			for (int col = row ; col >= 1; --col) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
		for (int row = 1; row <= size; ++row) {//for (c)
			for (int i = 1; i < row; i++) {
				System.out.print(" ");
			}
			for (int col = row; col <= size; ++col) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for (int row = size; row >=1 ; --row) { //for (d) 
			for (int space = 1; space <row ; space++) {
				System.out.print(" ");
			}
			
			for (int col = row; col <= size; col++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for (int row = 1; row <= size; row++) { //for(e)
			
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || col == size){
					System.out.print("#");
				}
			}		
			System.out.println();
		}		
		System.out.println();
		for (int row = 1; row <=size; row++) { //for (f)
			for (int col = 1; col <=size; col++) {
				if (col == row || row == 1 || row == size) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int row = 1; row <=size; row++) { //for (g)
			for (int col = 1; col <=size; col++) {
				if (col+row == size+1 || row == 1 || row == size) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int row = 1; row <=size; row++) { //for (h)
			for (int col = 1; col <=size; col++) {
				if (col+row == size+1 || col == row ||row == 1 || row == size ) {
					System.out.print("#");
				}else {
				System.out.print(" ");
				}
			}			System.out.println();
		}
	}
}
