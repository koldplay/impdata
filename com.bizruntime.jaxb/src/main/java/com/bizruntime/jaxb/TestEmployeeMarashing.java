package com.bizruntime.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TestEmployeeMarashing {
	static Employees employees = new Employees();
	static{
		employees.setEmployees(new ArrayList<Employee>());
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Rohit");
		employee.setLastname("Gupta");
		employee.setIncome(30000);
		
		employees.getEmployees().add(employee);
	}
	
	
	public static void main(String[] args) throws JAXBException {
		marshingExample();
		System.out.println("==================================");
		unMarshingExample();
	}


	private static void unMarshingExample() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employees.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employees employees = (Employees) unmarshaller.unmarshal(new File("D:/Task/employees.xml"));
		for (Employee emp : employees.getEmployees()) {
			System.out.println(emp.getId());
			System.out.println(emp.getFirstName());
		}
		
	}


	private static void marshingExample() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employees.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		
		marshaller.marshal(employees, System.out);
		marshaller.marshal(employees, new File("D:/Task/employees.xml"));
	}
	
}
