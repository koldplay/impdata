package com.bizruntime.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DBUtil {

	private static final Logger LOGGER = Logger.getLogger(DBUtil.class);
	private Connection connection;
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct
	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driverClassName);
		connection = DriverManager.getConnection(url,username,password);
		LOGGER.info("Connection Created");
		LOGGER.debug(driverClassName);
		LOGGER.debug(url);
		LOGGER.debug(username);
		LOGGER.debug(password);
	}
	@PreDestroy
	public void destroyConnection() throws SQLException {
		connection.close();
		LOGGER.info("Connection Closed");
	}
	
}
