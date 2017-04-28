package com.bizruntime.task5;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

public class DBUtil {

	private static final Logger LOGGER = Logger.getLogger(DBUtil.class);
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getDataBaseConection() throws SQLException {
		LOGGER.info("connection start");
		return dataSource.getConnection();
	}
}
