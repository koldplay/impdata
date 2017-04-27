package com.bizruntime.SpringTest;

public class AccountService {

	private AccountDAO accountDAO;

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	public AccountService() {
		// TODO Auto-generated constructor stub
	}
	
	public void create(Account account) {
		getAccountDAO().insert(account);
	}
	
	public void transferFund(final Account fromAccount,final Account toAccount, final Double transferAmount) {
		fromAccount.debit(transferAmount);
		toAccount.credit(transferAmount);
		getAccountDAO().update(fromAccount);
		getAccountDAO().update(toAccount);
	}
	
	public void transferFundsException(final Account fromAccount,
			final Account toAccount, final Double transferAmount) throws Exception {
			fromAccount.debit(transferAmount);
			toAccount.credit(transferAmount);
			getAccountDAO().update(fromAccount);
			getAccountDAO().update(toAccount);
			// Simulate an exception that occurs during funds transfer
			throw new Exception();
	}
	
	public void createAccount(Account account) {
		getAccountDAO().insert(account);
	}
	public Account getAccount(String accountNumber) {
		return getAccountDAO().select(accountNumber);
	}
}
