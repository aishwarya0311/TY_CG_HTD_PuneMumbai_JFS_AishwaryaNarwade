package com.capg.springcore.beans;

public class EmployeeBean {

	private int empId;
	private String name;
	private DepartmentBean deptBean;
	
	//All arguments constructor for constructor autowiring
	public EmployeeBean(int empId, String name, DepartmentBean deptBean) {
		this.empId = empId;
		this.name = name;
		this.deptBean = deptBean;
	}

	// getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

}// end of class
