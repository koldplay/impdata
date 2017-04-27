package com.bizruntime.SpringDAOProject;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBUtil {

	private static final Logger LOGGER = Logger.getLogger(DBUtil.class);
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getDataBaseConection() throws SQLException {
		return dataSource.getConnection();
	}
}
