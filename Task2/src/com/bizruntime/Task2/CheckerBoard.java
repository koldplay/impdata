package com.bizruntime.Task2;

public class CheckerBoard {
	public static void main(String[] args) {
		int size = 7;
		for (int row = 1; row <= size; ++row) {
			for (int col = 1; col <= size; ++col) {
				System.out.print("# ");
			}
			System.out.println();
			if (row%2 != 0) {
				System.out.print(" ");
			}
		}
	}
}
