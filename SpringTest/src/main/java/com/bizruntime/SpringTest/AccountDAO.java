package com.bizruntime.SpringTest;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDAO extends JdbcDaoSupport {
	
	public void insert(Account account) {
		String query = "INSERT INTO ACCOUNT (ACCOUNT_NUMBER, BALANCE) VALUES(?,?)";
		String accountNumber = account.getNumber();
		Double amount = account.getBalance();
		
		getJdbcTemplate().update(query , new Object[]{accountNumber , amount});
	}
	
	public void update(Account account) {
		String query = "UPDATE ACCOUNT SET BALANCE = ? where ACCOUNT_NUMBER = ?;";
		Double amount = account.getBalance();
		String number = account.getNumber();
		
		getJdbcTemplate().update(query ,amount,number);
	}
	
	public Account select(String accountNumber) {
		
		String query = "SELECT * FROM ACCOUNT WHERE ACCOUNT_NUMBER = ?;";
		List<Account> accounts = getJdbcTemplate().query(query,new Object[]{accountNumber}, new AccountRowMapper());
		
		return accounts.get(0);
	}
	
	
}
