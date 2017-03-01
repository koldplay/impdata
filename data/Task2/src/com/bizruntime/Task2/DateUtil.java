package com.bizruntime.Task2;

import java.util.Scanner;

public class DateUtil {
	public static void main(String[] args) {
		int year ;
		boolean flag;
		boolean flag1;
		int month ;
		int day;
		int dayinword;
		String dayinwordf;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year");
		year = in.nextInt();
		month = in.nextInt();
		day = in.nextInt();
		
		
		
		
		flag = isLeapYear(year);
		if (flag == true) {
		System.out.println("the year is leap year");
		}else {
			System.out.println("sorry try some");
		}
		
		flag1 = isValidDate(year ,month,day);
		if (flag1 == true) {
			System.out.println("entered date is valid");
		}else {
			System.out.println("entered date is not valid");
		}
		
		dayinword = getDayOfWeek(year , month ,day);
		switch (dayinword) {
		case 0:
			System.out.println("monday");
			break;

		case 1:
			System.out.println("tusday");
			break;
		case 2:
			System.out.println("wedday");
			break;
		case 3:
			System.out.println("thusday");
			break;
		case 4:
			System.out.println("friday");
			break;
		case 5:
			System.out.println("saturday");
			break;
		case 6:
			System.out.println("sunday");
			break;
	
			
		default:
			System.out.println("sorry");
			break;
		}
		
		dayinwordf = toString(year ,month,day);
		System.out.print(dayinwordf);
		in.close();
		
		
	}

	public static String toString(int year, int month, int day) {
		String days;
		String mon = null;
		int dayinword = getDayOfWeek(year, month, day);
		switch (dayinword) {
		case 0:
			System.out.println(days ="monday");
			break;

		case 1:
			System.out.println(days ="tusday");
			break;
		case 2:
			System.out.println(days ="wedday");
			break;
		case 3:
			System.out.println(days ="thusday");
			break;
		case 4:
			System.out.println(days ="friday");
			break;
		case 5:
			System.out.println(days ="saturday");
			break;
		case 6:
			System.out.println(days ="sunday");
			break;
			
		default:
			System.out.println(days ="sorry");
			break;
		}
		switch (month) {
		case 1:
			System.out.println(mon ="jan");
			break;

		case 2:
			System.out.println(mon ="fab");
			break;
		case 3:
			System.out.println(mon ="mar");
			break;
		case 4:
			System.out.println(mon ="apr");
			break;
		case 5:
			System.out.println(mon ="may");
			break;
		case 6:
			System.out.println(mon ="jun");
			break;
		case 7:
			System.out.println(mon ="july");
			break;
		case 8:
			System.out.println(mon ="aug");
			break;
		case 9:
			System.out.println(mon ="sep");
			break;
		case 10:
			System.out.println(mon ="oct");
			break;
		case 11:
			System.out.println(mon ="nov");
			break;
		case 12:
			System.out.println(mon ="dec");
			break;
			
		default:
			System.out.println(days ="sorry");
			break;
		}
		
		return "\""+days+" "+day+" day "+mon+" month "+year +"\"";
	}

	private static int getDayOfWeek(int year, int month, int day) {
		int dayin ;
		int century =(int) Math.floor(year/100);
		dayin = (day+ month+year+(int)Math.floor(year/4)+century)%7;
		
		return dayin;
	}

	public static boolean isValidDate(int year, int month, int day) {
		boolean flag = false;
		if (year >= 1 && year <= 9999 && isLeapYear(year)) {
			if (month >= 1 && month <= 12) {
				if (day >= 1 && (day <= 28 ||day <= 29 || day <=30 || day <= 31)) {
					flag = true;
				}
			}
		}
		return flag;
	}

	public static boolean isLeapYear(int year) {
		boolean flag = false;
		if ((year % 4 == 0 || year % 400 == 0)&&year%100 !=0) {
			flag = true;
		}		
		return flag	;
	}
}
