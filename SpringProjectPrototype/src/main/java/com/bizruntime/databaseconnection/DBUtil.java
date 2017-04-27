package com.bizruntime.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {

	private Connection connection;
	private String driverClassName ;
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
	
	public void getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName(driverClassName);
		connection = DriverManager.getConnection(url,username,password);
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	public void conDestroy() throws Exception {
		connection.close();
		System.out.println("Connection closed");
	}
	
}
