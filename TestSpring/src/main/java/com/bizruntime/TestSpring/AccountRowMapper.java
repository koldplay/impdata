package com.bizruntime.TestSpring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class AccountRowMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet result, int rowNumber) throws SQLException {
		Account account = new Account();
		account.setNumber(result.getString(1));
		account.setBalance(result.getDouble(2));
		return account;
	}



}
