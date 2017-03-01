package com.bizruntime.Task2;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar {
	private static final int Day_OF_Week = 0;

	public static void main(String[] args) {
		int year;
		int month;
		int day ;
		
		Scanner in = new Scanner(System.in);
		year = in.nextInt();
		month = in.nextInt();
		day = in.nextInt();		
		
		GregorianCalendar cal = new GregorianCalendar(year , month-1 , day);
		int dayNumber = cal.get(Calendar.Day_OF_Week);
		String[] calenderDays = {"monday", "tusday","wednesday","thusday","friday","saturday","sunday"};
		
		System.out.println("It is " + calenderDays[dayNumber-1]);
		in.close();
	}
}
