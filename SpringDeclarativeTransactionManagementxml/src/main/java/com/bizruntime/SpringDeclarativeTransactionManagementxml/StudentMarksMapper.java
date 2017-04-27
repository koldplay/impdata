package com.bizruntime.SpringDeclarativeTransactionManagementxml;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks> {

	public StudentMarks mapRow(ResultSet result, int rowNum) throws SQLException {
		StudentMarks marks = new StudentMarks();
		marks.setId(result.getInt(1));
		marks.setName(result.getString(2));
		marks.setAge(result.getInt(3));
		marks.setSid(result.getInt(4));
		marks.setMarks(result.getInt(5));
		marks.setYear(result.getInt(6));
		return marks;
	}
	
	
}
