package com.bizruntime.Task2;

public class SquareBoard {
	public static void main(String[] args) {
		int size = 5;
		for (int row = 0; row < size ; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print("# ");				
			}
			System.out.println();
		}
	}
}
