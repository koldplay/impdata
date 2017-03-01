package com.bizruntime.Task2;

public class Arithmetic {
	public static void main(String[] args) {
		
		int oper1 = Integer.parseInt(args[0]);
		int oper2 = Integer.parseInt(args[1]);
		char operator;
		operator = args[2].charAt(0);
		
		if (args.length!=3) {
			System.err.println("Usage: java Arithmetic int1 int2 op");
			return;
		}
		System.out.println(args[0]+" "+args[1]+" "+args[2]+" "+"=");
		switch (operator) {
		case '+':
			System.out.println(oper1+oper2);
			break;

		case '-':
			System.out.println(oper1-oper2);
			break;

		case '*':
			System.out.println(oper1*oper2);
			break;

		case '/':
			System.out.println(oper1/oper2);
			break;

		default:
			System.out.println("Error: invalid operator!");
			break;
		}
	}
}
