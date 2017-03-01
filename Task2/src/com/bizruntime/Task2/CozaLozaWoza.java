package com.bizruntime.Task2;

public class CozaLozaWoza {
	
	public static void main(String[] args) {
		int lowerbound = 1 , upperbound = 110;
		for (int i = lowerbound; i <= upperbound; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.print("CozaLoza");
			}else if (i%3 ==0) {
				System.out.print("Coza");
			}else if (i%5 == 0) {
				System.out.print("Loza");
			}else if (i%7 == 0) {
				System.out.print("Moza");
			}
			if (i%3 != 0 && i%5 !=0 && i%7 !=0) {
				System.out.print(i+" ");
			}
			if(i%11 == 0){
				System.out.println();
			}else {
				System.out.print(" ");
			}
			
		}
	}
}
