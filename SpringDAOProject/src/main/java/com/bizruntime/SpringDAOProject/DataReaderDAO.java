package com.bizruntime.SpringDAOProject;

import java.sql.SQLException;

public interface DataReaderDAO {
	
	public void getStudentData() throws SQLException;
	public void setDataFromSource(int rollno,String fname,String lname,String email,String address) throws SQLException;
	public void deleteData(int rollno) throws SQLException;
	public void updateData(String fname, String lname, String email, String address, int rollno) throws SQLException;
}
