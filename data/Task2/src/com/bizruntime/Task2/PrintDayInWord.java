package com.bizruntime.Task2;

public class PrintDayInWord {
	
	public static void main(String[] args) {
		
		int day = 7;
		if (day == 0) {
			System.out.println("SUNDAY");
		} else if(day == 1){
			System.out.println("MONDAY");
		}else if (day == 2) {
			System.out.println("TUSEDAY");
		}else if (day == 3) {
			System.out.println("WEDESDAY");
		}else if (day == 4) {
			System.out.println("THUSDAY");
		}else if (day == 5) {
			System.out.println("FRIDAY");
		}else if (day == 6) {
			System.out.println("SATURDAY");
		}else {
			System.out.println("Not a Valid Day");
		}
		
		switch (day) {
		case 0:
			System.out.println("SUNDAY");
			break;

		case 1:
			System.out.println("MONDAY");
			break;

		case 2:
			System.out.println("TUSDAY");
			break;
			
		case 3:
			System.out.println("WEDNESDAY");
			break;

		case 4:
			System.out.println("THUSDAY");
			break;

		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;

		default:
			System.out.println("Not a Valid Day");
			break;
		}
	}
}
