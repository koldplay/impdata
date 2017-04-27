package com.bizruntime.SpringDeclarativeTransactionManagementxml;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public void create(String name, Integer age, Integer marks, Integer year) {
		try {
			
			String query = "insert into studenttab (name, age) values (?, ?)";
			jdbcTemplate.update(query , name, age);
			
			String query1 = "select max(id) from studenttab";
			int sid = jdbcTemplate.queryForObject(query1, new Object[]{year}, Integer.class);
			
			String query2 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
			jdbcTemplate.update(query2,sid , marks, year);
			
			throw new RuntimeException("simulate Error condition");
			
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			e.printStackTrace();
		}		
	}

	public List<StudentMarks> listStudents() {
		String query = "select * from studenttab, Marks where studenttab.id = Marks.sid";
		List<StudentMarks> list = jdbcTemplate.query(query, new StudentMarksMapper());
		
		return list;
	}

}
