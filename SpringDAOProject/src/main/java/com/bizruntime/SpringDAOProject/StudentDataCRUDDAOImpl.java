package com.bizruntime.SpringDAOProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

public class StudentDataCRUDDAOImpl implements DataReaderDAO {

	private static final Logger LOGGER = Logger.getLogger(StudentDataCRUDDAOImpl.class);

	private DBUtil dbUtil;

	public void setDbUtil(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}
	
	public void getStudentData() throws SQLException{
		String query = "select * from koldplay.studentdata ";
		Connection connection = dbUtil.getDataBaseConection();
		PreparedStatement statement = connection.prepareStatement(query);
		LOGGER.info(statement);
		ResultSet sets = statement.executeQuery();
		while (sets.next()) {
			LOGGER.info(sets.getString(1));
		}
	}
	
	@Transactional(isolation = Isolation.SERIALIZABLE ,rollbackFor = Exception.class)
	public void setDataFromSource(int rollno, String fname, String lname, String email, String address) throws SQLException{

		String query = "insert into koldplay.studentdata values(?,?,?,?,?)";
		Connection connection = null;
		try {
			connection = dbUtil.getDataBaseConection();
			//connection.setAutoCommit(false);
			PreparedStatement statement = connection.prepareStatement(query);
			LOGGER.info(statement);
			statement.setInt(1, rollno);
			statement.setString(2, fname);
			statement.setString(3, lname);
			statement.setString(4, email);
			statement.setString(5, address);
			//connection.commit();
			statement.executeUpdate();
		} catch (SQLException e) {
			//connection.rollback();
			LOGGER.error(e.getMessage());
			//e.printStackTrace();
		}

	}

	public void deleteData(int rollno) throws SQLException {
		String query = "delete from koldplay.studentdata where rollno = ?";
		Connection connection = dbUtil.getDataBaseConection();
		PreparedStatement statement = connection.prepareStatement(query);
		LOGGER.info(statement);
		statement.setInt(1, rollno);
		statement.executeUpdate();
		connection.close();
	}

	public void updateData(String fname, String lname, String email, String address, int rollno) throws SQLException {
		String query = "update koldplay.studentdata set fname= ? , lname = ?,email =? , address =? where rollno = ? ";
		Connection connection = dbUtil.getDataBaseConection();
		PreparedStatement statement = connection.prepareStatement(query);
		LOGGER.info(statement);
		statement.setString(1, fname);
		statement.setString(2, lname);
		statement.setString(3, email);
		statement.setString(4, address);
		statement.setInt(5, rollno);
		statement.executeUpdate();
	}
}
