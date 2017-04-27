package com.bizruntime.TestSpring;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDAO extends JdbcDaoSupport {
	
	public void insert(Account account) {
		String query = "insert into account(ACCOUNT_NUMBER ,BALANCE) values ( ? , ?)";
		getJdbcTemplate().update(query , new Object[]{account.getNumber() , account.getBalance()});
	}
	
	public void update(Account account) {
		String  query = "update account set BALANCE = ? where ACCOUNT_NUMBER = ? ";		
		getJdbcTemplate().update(query , new Object[]{account.getBalance() , account.getNumber()});
	}
	
	public Account select(String accountNumber) {
		String query = "select * from account where ACCOUNT_NUMBER = ?";
		List<Account> account = getJdbcTemplate().query(query,new Object[]{accountNumber}, new AccountRowMapper());
		return account.get(0);
	}
	
	
}
