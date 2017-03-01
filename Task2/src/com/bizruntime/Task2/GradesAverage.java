package com.bizruntime.Task2;

import java.util.Scanner;

public class GradesAverage {
	public static void main(String[] args) {
		int size ;
		int[] student;
		double average ;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students");
		size = in.nextInt();
		
		student = new int[size];
		for (int pos = 1; pos <= size; pos++) {
			System.out.println("Enter the grade for student "+pos+" is");
			student[pos] = in.nextInt();
			if (student[pos] >100) {
				System.out.println("Invalid grade ");
				System.out.println("Enter the grade for student "+pos+" is");
				student[pos] = in.nextInt();
			}
		}
		average = average(student);
		System.out.println(average);
		in.close();	
	}

	public static double average(int[] student) {
		int sum = 0;
		double average;
		for (int pos = 0; pos < student.length; pos++) {
			sum +=student[pos];
		}
		average = sum/student.length;
		return average;
	}
}
