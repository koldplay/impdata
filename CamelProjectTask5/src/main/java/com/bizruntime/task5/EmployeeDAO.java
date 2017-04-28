package com.bizruntime.task5;

import java.sql.SQLException;

import org.apache.camel.Exchange;

public interface EmployeeDAO {
	
	public MyResponse addEmployee(Exchange exchange) throws SQLException;
	public MyResponse deleteEmployee(Exchange exchange) throws SQLException;
	public MyResponse updateEmployee(Exchange exchange) throws SQLException;
	public void getEmployee() throws SQLException;
	public MyResponse badrequest(Exchange exchange);
}
