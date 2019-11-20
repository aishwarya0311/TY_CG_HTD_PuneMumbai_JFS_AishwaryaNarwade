package com.capg.springmvc.service;

import java.util.List;

import com.capg.springmvc.bean.EmployeeInfoBean;

public interface EmployeeService {

	public EmployeeInfoBean getEmployee(int empId);

	public EmployeeInfoBean authenticate(int empId, String pwd);

	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);

	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);

	public boolean deleteEmployee(int empId);

	public List<EmployeeInfoBean> getAllEmployees();

}// end of service
