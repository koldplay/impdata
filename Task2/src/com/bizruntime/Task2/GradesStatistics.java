package com.bizruntime.Task2;

import java.util.Scanner;

public class GradesStatistics {
	public static void main(String[] args) {
		int size ;
		int[] student;
		double average ;
		double median;
		int  minimum;
		int maximum;
		double mean;
		double standarddeviation;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students");
		size = in.nextInt();
		
		student = new int[size];
		for (int pos = 0; pos < size; pos++) {
			System.out.println("Enter the grade for student "+pos+" is");
			student[pos] = in.nextInt();
			if (student[pos] >100) {
				System.out.println("Invalid grade ");
				System.out.println("Enter the grade for student "+pos+" is");
				student[pos] = in.nextInt();
			}
		}
		printArray(student);
		average =average(student);
		median = Math.floor(average);
		System.out.println("The average is :"+average);
		System.out.println("The median is :"+median);
		minimum = minimum(student);
		maximum = maximum(student);
		System.out.println("The minimum is :"+minimum);
		System.out.println("The maximum is :"+maximum);
		mean = mean(student);
		
		standarddeviation = Math.round(standardDeviation(student, mean,size));
		System.out.println(standarddeviation);
		in.close();	
	}	
	
	public static void printArray(int[] student){
		System.out.print("{");
		for (int pos = 0; pos < student.length; pos++) {
			if (pos > 0) {
				System.out.print(",");
			}
			System.out.print(student[pos]);
		}
		System.out.println("}");
	}

	public static double average(int[] student) {
		int sum = 0;
		double average;
		for (int pos = 0; pos < student.length; pos++) {
			sum +=student[pos];
		}
		average = (double)sum/student.length;
		return average;
	}
	public static int minimum(int[] student){
		int min = student[0];
		for (int pos = 1; pos < student.length; pos++) {
			if (min > student[pos]) {
				min = student[pos];
			}
		}
		return min;
	}
	public static int maximum(int[] student){
		int max = student[0];
		for (int pos = 1; pos < student.length; pos++) {
			if (max < student[pos]) {
				max = student[pos];
			}
		}
		return max;
	}
	public static int mean(int[] student){
		int sum = 0;
		int average;
		for (int pos = 0; pos < student.length; pos++) {
			sum +=student[pos];
		}
		average = sum/student.length;
		return average;
	}
	public static double standardDeviation(int[] student ,double mean ,int size){
		int sum = 0;
		double standarddev ; 
		for (int pos = 0; pos < size; pos++) {
			sum += (int)(Math.pow((student[pos]-mean), 2));
		}
		//double avg = (double);
		standarddev = Math.sqrt(sum/size);
		//System.out.println(sum);
		return standarddev;
	}
}
