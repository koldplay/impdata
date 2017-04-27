package com.bizruntime.jta.testjtatransaction;

public interface EmployeeService {
	
	void persistEmployee(EmployeeA employeeA ,EmployeeB employeeB ) throws Exception;
}
