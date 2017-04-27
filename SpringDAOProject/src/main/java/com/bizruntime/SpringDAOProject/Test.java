package com.bizruntime.SpringDAOProject;

import java.sql.SQLException;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static final Logger LOGGER = Logger.getLogger(Test.class);
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");		
		StudentDataCRUDDAOImpl impl = (StudentDataCRUDDAOImpl) context.getBean("dao");
		Student student = (Student) context.getBean("student");
		
		Scanner scanner = new Scanner(System.in);
		LOGGER.info("Please select 1 for putting database");
		LOGGER.info("2 for deleting record");
		LOGGER.info("3 for updating record");
		LOGGER.info("4 for getting records");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			LOGGER.debug("inserting Data is about to begin");
			impl.setDataFromSource(student.getRollno(),student.getFname(),student.getLname(),student.getEmail(),student.getAddress());
			LOGGER.debug("inserting data is ended");
			break;
		case 2:
			LOGGER.debug("deleting data is about to begin");
			impl.deleteData(student.getRollno());		
			LOGGER.debug("deleting data is ended");
			break;
		case 3:
			LOGGER.debug("updating data is about to begin");
			impl.updateData(student.getFname(),student.getLname(),student.getEmail(),student.getAddress(),student.getRollno());
			LOGGER.debug("updating data is ended");
			break;
		case 4:
			LOGGER.debug("getting data is about to begin");
			impl.getStudentData();
			LOGGER.debug("getting data is ended");
			break;
		default:
			LOGGER.info("You Have Selected Wrong Choice");
			break;
		}				
		scanner.close();

		
	}
}	

