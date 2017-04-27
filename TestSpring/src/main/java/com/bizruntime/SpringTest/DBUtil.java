package com.bizruntime.SpringTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class DBUtil {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void initialize() throws SQLException {
		DataSource dataSource = getDataSource();
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		statement.executeUpdate("CREATE TABLE ACCOUNT (ACCOUNT_NUMBER VARCHAR(50), BALANCE DECIMAL(10,2))");
		statement.close();
		connection.close();
		
	}
}
