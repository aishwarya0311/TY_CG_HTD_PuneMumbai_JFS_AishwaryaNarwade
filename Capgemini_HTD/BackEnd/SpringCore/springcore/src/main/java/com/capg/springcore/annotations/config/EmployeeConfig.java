package com.capg.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capg.springcore.annotations.beans.DepartmentBean;
import com.capg.springcore.annotations.beans.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(101);
		employeeBean.setName("Aishwarya");
		return employeeBean;

	}// end of getEmployeeBean()

}// end of class
