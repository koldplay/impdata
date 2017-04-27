package com.bizruntime.SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDeclarativeTransactions {
	
	private static final String fromAccountNumber = "ACC01";
	private static final String toAccountNumber = "ACC02";
	
	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		AccountService accountService = (AccountService) context.getBean("accountService");
		 
		System.out.println("Creating new accounts " + fromAccountNumber + " and " + toAccountNumber);
		Account fromAccount = new Account(fromAccountNumber,100d);
		Account toAccount = new Account(toAccountNumber,200d);
		accountService.create(fromAccount);
		accountService.create(toAccount);
		printAccountInformation(accountService);
		System.out.println("New accounts created successfully");
		System.out.println("----");
		 
		Double transferAmount = 50d;
		System.out.println("Transferring " + transferAmount + " from account " + fromAccountNumber + " to account " + toAccountNumber);
		accountService.transferFund(fromAccount, toAccount, transferAmount);
		printAccountInformation(accountService);
		System.out.println("The amount " + transferAmount + " was transferred successfully");
		System.out.println("----");
		 
		transferAmount = 10d;
		System.out.println("Transferring " + transferAmount + " from account " + fromAccountNumber + " to account " + toAccountNumber);
		try {
		accountService.transferFundsException(fromAccount, toAccount, transferAmount);
		} catch (Exception e) {
		System.out.println("ERROR IN TRANSACTION. THE AMOUNT "
		+ transferAmount
		+ " COULD NOT BE TRANSFERRED DUE TO EXCEPTION.");
		System.out.println("THE TRANSACTION SHALL BE ROLLED BACK.");
		}
		printAccountInformation(accountService);
		System.out.println("The transfer of funds failed and the account balance remained unchanged");
		 
		System.out.println("************** ENDING PROGRAM **************");
		}
		 
		private static void printAccountInformation(AccountService accountService){
		 
		Account fromAccount = accountService.getAccount(fromAccountNumber);
		Account toAccount = accountService.getAccount(toAccountNumber);
		System.out.println("Balance in account " + fromAccountNumber + " = " + fromAccount.getBalance());
		System.out.println("Balance in account " + toAccountNumber + " = " + toAccount.getBalance());
		}
		}

