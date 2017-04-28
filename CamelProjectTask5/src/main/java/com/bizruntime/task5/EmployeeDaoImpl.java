package com.bizruntime.task5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class EmployeeDaoImpl implements EmployeeDAO {

	private final static Logger LOGGER = Logger.getLogger(EmployeeDaoImpl.class);
	
	private DBUtil dbUtil;
	public void setDbUtil(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	public MyResponse addEmployee(Exchange exchange) throws SQLException {
		Employee employee = exchange.getIn().getBody(Employee.class);
		LOGGER.info("Details of employee");
		LOGGER.info(employee.getEmpid());
		LOGGER.info(employee.getEmpname());
		LOGGER.info(employee.getSalary());
		
		Connection connection = dbUtil.getDataBaseConection();
		String queryget = "SELECT * FROM koldplay.employee where empid = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(queryget);
		LOGGER.info(employee.getEmpid());
		preparedStatement.setString(1, employee.getEmpid());
		ResultSet set = preparedStatement.executeQuery();
		boolean value= set.next();
		
		if (value == false) {
			String query = "insert into employee values (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, employee.getEmpid());
			statement.setString(2, employee.getEmpname());
			statement.setString(3, employee.getSalary());
			statement.executeUpdate();
			LOGGER.info("Data is added to data base");
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_TEXT, "Employee created");
		}
		else{
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_TEXT, "Employee already  exist");
			return new MyResponse(false, "Employee already  exist", 200 );
		}
		
		return new MyResponse(true,"data is inserted",200);
	}
	
	public MyResponse deleteEmployee(Exchange exchange) throws SQLException {
		Employee employee = exchange.getIn().getBody(Employee.class);
		LOGGER.info("This is to be going deleted :"+employee.getEmpid());
		
		String query = "delete from employee where empid = ?";
		Connection connection = dbUtil.getDataBaseConection();
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, employee.getEmpid());
		statement.executeUpdate();
		LOGGER.info("Data is deleted to data base");
		exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 204);
		exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_TEXT, "Employee already  deleted");
		return new MyResponse(true, "data is deleted", 200);
	}
	
	public MyResponse updateEmployee(Exchange exchange) throws SQLException {
		Employee employee = exchange.getIn().getBody(Employee.class);
		Connection connection = dbUtil.getDataBaseConection();		
		String queryget = "SELECT * FROM koldplay.employee where empid = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(queryget);
		LOGGER.info(employee.getEmpid());
		preparedStatement.setString(1, employee.getEmpid());
		ResultSet set = preparedStatement.executeQuery();
		boolean value= set.next();
		
		if (value == false) {
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 404);
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_TEXT, "Employee Not Found");
			return new MyResponse(false, "Employee not found", 404 );
		}
		else{			
			String query = "update employee set empname = ?, salary = ? where empid = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, employee.getEmpname());
			statement.setString(2, employee.getSalary());
			statement.setString(3, employee.getEmpid());
			statement.executeUpdate();
			LOGGER.info("Data is updated to data base");
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_TEXT, "Employee updated");
		}
		

		return new MyResponse(true,	"data is done",200);	 

	}
	
	public void getEmployee() throws SQLException {
		String query = "select *  from employee";
		Connection connection = dbUtil.getDataBaseConection();
		LOGGER.info(connection);
		PreparedStatement statement = connection.prepareStatement(query);
		ResultSet set = statement.executeQuery();

		while (set.next()) {
			LOGGER.info("All The Employees");
			LOGGER.info(set.getString(1)+" , "+set.getString(2)+" , "+set.getString(3));
		}
	}
	
	public MyResponse badrequest(Exchange exchange) {
		exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE , 400);
		exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_TEXT, "Bad request");
		LOGGER.info(exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE));
		LOGGER.info(exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_TEXT));
		return new MyResponse(false, "Bad Request", 400);
	}
}
