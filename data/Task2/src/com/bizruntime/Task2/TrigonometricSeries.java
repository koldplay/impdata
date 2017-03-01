package com.bizruntime.Task2;

import java.util.Scanner;

public class TrigonometricSeries {
	public static void main(String[] args) {
		double sinsys;
		double cossys;
		double sinuser;
		double cosuser;
		double expo;
		double expoval;
		int num ;
		int denom ;
		double sumofseries;
		
		System.out.println("Enter Value for checking");
		Scanner in = new Scanner(System.in);
		
		denom = in.nextInt();
		
		double number = Math.toRadians((Math.PI/denom));
		
		
		System.out.println("Enter no. of check");
		num = in.nextInt();
		
		sinsys = Math.sin(number);
		cossys = Math.cos(number);
		sinuser = sin(number, num);
		cosuser = cos(number, num);
		expo = exp(num);
		expoval = exp(number,num);
		
		sumofseries = sumOfSeries(denom, num);
		
		System.out.println("Sin series value upto "+num+" terms is "+sinuser +" and system defined value is "+sinsys );
		System.out.println("Sin series value upto "+num+" terms is "+cosuser +" and system defined value is "+cossys );
		System.out.println(expo);
		System.out.println(expoval);
		System.out.println(sumofseries);
		in.close();
	}
	public static double sin(double x ,int numterms){
		double val =0;
		for (int i = 0; i < numterms; i+=3) {
			val += Math.pow(-1, i)*(Math.pow(x, 2*i+1)/(2*i+1));
		}		
		return val;
	}
	public static double cos(double x ,int numterms){
		double val =0;
		double fact;
		for (int i = 0; i < numterms; i+=2) {
			fact = factorial(2*i+1);
			val += Math.pow(-1, i)*(Math.pow(x, 2*i+1)/fact);
		}		
		return val;
	}
	public static double factorial(int n){
		double val = 1;
		if (n == 0) {
			val = 1;
		}
		for (int i = 1; i <= n; i++) {
			val*=i;
		}
		return val;
	}
	
	public static double exp(int number){
		double val = 0;
		double fact;
		for (int i = 0; i <= number; i++) {
			fact = factorial(i);
			val += 1/fact;
		}
		return val;
	}
	public static double exp(double x ,int number){
		double val = 0;
		double fact;
		for (int i = 0; i <= number; i++) {
			fact = factorial(i);
			val += Math.pow(x, i)/fact;
		}
		return val;
	}
	
	public static double sumOfSeries(double number ,int num){
		double val = 0;
		int numerator = 1;
		int denominator = 1;
		for (int i = 1; i <= num; i++) {
			
			val +=(numerator/denominator+1)*(Math.pow(number, 2*i+1)/2*i+1);
		}
		return val;
	}
}
