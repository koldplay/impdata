package com.bizruntime.test;

public class IFTest {
	public static void main(String[] args) {
		Stack stk = new Stack(5);
		Stack stk1 = new Stack(8);
		
		for (int i = 0; i < 5; i++) {
			stk.push(i);
		}
		for (int i = 0; i < 8; i++) {
			stk1.push(i);
		}
		System.out.println("Stack in Stk1");
		for (int i = 0; i < 5; i++) {
			System.out.println(stk.pop());
		}
		for (int i = 0; i < 8; i++) {
			System.out.println(stk1.pop());
		}
	}
}
