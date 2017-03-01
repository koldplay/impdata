package com.bizruntime.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) {
		 int num1 = 0;
		 double num2 = 0.0;
		 String name = null;
		 double sum = 0.0;
		 
		 Scanner in = null;
		 try {
			in = new Scanner(new File("in.txt"));
			num1 = in.nextInt();
			num2 = in.nextDouble();
			name = in.next();
			sum = num1 + num2;
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		 System.out.println("The integer read is "+num1);
		 System.out.println("The Floating point number read is "+num2);
		 System.out.println("The String read is "+ name);
		 System.out.println("Hi! "+name+", the sum of "+num1+" and "+num2+" is "+sum);
		 in.close();
	}
}
