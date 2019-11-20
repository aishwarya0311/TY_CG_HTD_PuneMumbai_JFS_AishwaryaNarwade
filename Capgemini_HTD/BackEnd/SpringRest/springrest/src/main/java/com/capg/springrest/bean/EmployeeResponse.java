package com.capg.springrest.bean;

import java.util.List;

public class EmployeeResponse {

	private int statuscode;
	private String message;
	private String description;
	private EmployeeInfoBean employeeInfoBean;
	public List<EmployeeInfoBean> employeesList;
	
	
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EmployeeInfoBean getEmployeeInfoBean() {
		return employeeInfoBean;
	}
	public void setEmployeeInfoBean(EmployeeInfoBean employeeInfoBean) {
		this.employeeInfoBean = employeeInfoBean;
	}
	public List<EmployeeInfoBean> getEmployeesList() {
		return employeesList;
	}
	public void setEmployeesList(List<EmployeeInfoBean> employeesList) {
		this.employeesList = employeesList;
	}
	
	
}
