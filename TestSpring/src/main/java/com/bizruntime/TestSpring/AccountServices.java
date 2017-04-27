package com.bizruntime.TestSpring;

import java.sql.SQLException;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
public class AccountServices {

	private AccountDAO accountDAO;

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public void create(Account account) {
		getAccountDAO().insert(account);
	}
	
	@Transactional(propagation = Propagation.REQUIRED , readOnly = false)
	public void transferFund(final Account fromAccount , final Account toAccount ,final Double transferAmount) {
		fromAccount.debit(transferAmount);
		toAccount.credit(transferAmount);
		
		getAccountDAO().update(fromAccount);
		getAccountDAO().update(toAccount);
	}
	
	@Transactional(propagation = Propagation.REQUIRED , rollbackFor = SQLException.class ,readOnly = false)
	public void transferFundException(final Account fromAccount , final Account toAccount ,final Double transferAmount) throws Exception {
		fromAccount.debit(transferAmount);
		toAccount.credit(transferAmount);
		getAccountDAO().update(fromAccount);
		getAccountDAO().update(toAccount);		
		throw new SQLException();
	}
	
	public void createAccount(Account account) {
		getAccountDAO().insert(account);
	}	
	public Account getAccount(String accountNumber) {
		return getAccountDAO().select(accountNumber);
	}
}
