package com.bizruntime.test;

public class Stack implements IntStk {
	private int[] stk ;
	private int tos;
	public Stack(int size) {
		stk = new int[size];
		tos = -1;		
	}

	public void push(int x) {
		if (tos == stk.length-1) {
			System.out.println("Stack is full");
		}else{
			stk[++tos] = x;
		}
	}
	public int pop() {
		if (tos < 0) {
			System.out.println("Stack is under flow");
			return 0;
		}else {
			return stk[tos--];
		}	
	}
}
