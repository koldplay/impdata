package com.bizruntime.SpringTest;

public class Account {
	
	private String number;
	private Double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String number , Double balance) {
		this.number = number;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public void debit(Double debitedAmount) {
		this.balance = this.balance - debitedAmount; 
	}
	
	public void credit(Double creditAmount) {
		this.balance = this.balance + creditAmount;
	}
	
	@Override
	public String toString() {
		
		return  "Account [number=" + number + ", balance=" + balance + "]";
	}
}
