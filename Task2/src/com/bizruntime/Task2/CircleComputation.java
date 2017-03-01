package com.bizruntime.Task2;

import java.util.Scanner;

public class CircleComputation {
	public static void main(String[] args) {
		double radius;
		double area;
		double circumference;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = in.nextDouble();
		if (radius == -1) {
			System.out.println("area and circumference is not negative");
		}
		
		area = Math.PI*radius*radius;
		circumference = 2*Math.PI*radius;
		System.out.println("The area is "+area);
		System.out.println("The circimference is "+circumference );
		in.close();
	}
}
