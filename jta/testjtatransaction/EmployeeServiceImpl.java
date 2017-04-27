package com.bizruntime.jta.testjtatransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeADAOImpl employeeADAO;
	@Autowired
	private EmployeeBDAOImpl employeeBDAO;
	
	public void persistEmployee(EmployeeA employeeA, EmployeeB employeeB) throws Exception {
		
		System.out.println("Persist A");
		employeeADAO.persistEmployee(employeeA);
		System.out.println("Persist A OK - persist B");
		employeeBDAO.persistEmployee(employeeB);
		System.out.println("Persiste B");
	}

}
