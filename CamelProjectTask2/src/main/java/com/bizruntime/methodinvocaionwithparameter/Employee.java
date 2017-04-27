package com.bizruntime.methodinvocaionwithparameter;

public class Employee {
	
	private Integer EID;
	private String EmpName;
	public Integer getEID() {
		return EID;
	}
	public void setEID(Integer eID) {
		EID = eID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Employee(Integer EID, String EmpName) {
		super();
		this.EID = EID;
		this.EmpName = EmpName;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [EID=" + EID + ", EmpName=" + EmpName + "]";
	}
	
	
	
}
