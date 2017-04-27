package com.bizruntime.propertiesinject;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPool {
	
	private String drivername , url,username,password;

	public void setDrivername(String drivername) {
		this.drivername = drivername;
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
	
	public void getConnection() {
		try {
			System.out.println("dtat");
			Class.forName(drivername);
			Connection connection = DriverManager.getConnection(url , username,password);
			System.out.println(connection);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
