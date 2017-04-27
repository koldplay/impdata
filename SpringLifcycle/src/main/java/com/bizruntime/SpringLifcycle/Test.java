package com.bizruntime.SpringLifcycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean , DisposableBean{
	
	private String driver , url , username,password;
	private Connection connection ;
	
	public void setDriver(String driver) {
		this.driver = driver;
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
	
	public void afterPropertiesSet() throws Exception {
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("connnection opend");
	}
	public void destroy() throws Exception {
		connection.close();
		System.out.println("Connection closed");
	}
	
	public void save(int id , String name , String email , String address) throws SQLException {
		PreparedStatement pre = connection.prepareStatement("insert into studentdata value(?,?,?,?)");
		pre.setInt(1, id);
		pre.setString(2, name);
		pre.setString(3, email);
		pre.setString(4, address);
		pre.executeUpdate();
		
		System.out.println("insertion success");
	}
	
}