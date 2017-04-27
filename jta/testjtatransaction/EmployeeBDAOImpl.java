package com.bizruntime.jta.testjtatransaction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

@Service
public class EmployeeBDAOImpl extends JdbcDaoSupport {
	
	@PersistenceContext(unitName="PersistenceUnitB")
	private EntityManager entityManager;
	
	public void persistEmployee(EmployeeB employeeB) {
		
		entityManager.persist(employeeB);
	}
 }
