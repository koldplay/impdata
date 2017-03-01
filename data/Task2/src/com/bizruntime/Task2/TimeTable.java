package com.bizruntime.Task2;

public class TimeTable {
	public static void main(String[] args) {
		int size = 9;
		System.out.println("*"+" | "+"1\t"+"2\t"+"3\t"+"4\t"+"5\t"+"6\t"+"7\t"+"8\t"+"9\t");
		System.out.println("--------------------------------------------------------------------");
		for (int row = 1; row <=size; row++) 
		{
			System.out.print(row + " "+ "| ");
			for (int col = 1; col <= size; col++) {
				
				System.out.print(row*col+"\t");
			}
			System.out.println();
		}
	}
}
