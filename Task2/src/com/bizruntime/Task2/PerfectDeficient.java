package com.bizruntime.Task2;

public class PerfectDeficient {
	public static void main(String[] args) {
		int upperlimit = 1000;
		boolean flag1 = false;
		boolean flag = false;
		boolean flag2 = false;
		boolean flag3 = false;
		int counter = 0;
		System.out.println("These numbers are perfect no.:");
		for (int i = 1; i <= upperlimit; i++) {
			flag = perfectNo(i);
			if (flag == true) {
				System.out.println(i);
			}
		}
		System.out.println("These numbers are deficient no. :");
		for (int i = 1; i <= upperlimit; i++) {
			flag1 = isdeficentNo(i);
			if (flag1 == true) {
				System.out.println(i);
			}
		}
		System.out.println("These numbers are neither deficient nor perfect:");
		for (int i = 1; i <= upperlimit; i++) {
			flag2 = perfectNo(i);
			flag3 = isdeficentNo(i);
			if (flag2!= true && flag3 != true) {
				counter++; 
				System.out.println(i);
			}
			
		}
		System.out.println(counter);
	}
	public static boolean perfectNo(int n){
		int sum = 0;
		boolean flag = false;
			for (int i = 1; i <=n/2; i++) {
				if (n%i ==0) {
					sum += i;
				}
			}
			if (sum == n) {
				flag = true;
			}else{
				flag = false;
			}
			return flag;		
	}
	public static boolean isdeficentNo(int n ){
		int  sum = 0;
		boolean flag  = false ;
		for (int i = 1; i <=n/2 ; i++) {
			if (n%i == 0) {
				sum+=i;
			}
		}
		if (sum < n) {
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	}
}
