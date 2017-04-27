package com.bizruntime.jta.testjtatransaction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

@Service
public class EmployeeADAOImpl extends JdbcDaoSupport {
	
	@PersistenceContext(unitName = "PersistenceUnitA")
	private EntityManager entityManager;
	
	public void persistEmployee(EmployeeA employeeA) {
		
		entityManager.persist(employeeA);
	}
	
}
