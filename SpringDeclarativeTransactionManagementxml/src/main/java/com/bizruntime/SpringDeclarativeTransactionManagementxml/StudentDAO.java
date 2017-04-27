package com.bizruntime.SpringDeclarativeTransactionManagementxml;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	
	public void setDataSource(DataSource datasource);
	
	public void create(String name , Integer age , Integer marks , Integer year);
	
	public List<StudentMarks> listStudents();
}
