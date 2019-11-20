package com.capg.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capg.springcore.annotations.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {
	
	// Different Departments
	@Bean(name = "dev")                    //giving bean name for 
	public DepartmentBean getDevlopmentDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(200);
		bean.setDeptName("Software Devloper");
		return bean;

	} // end of getdev()

	@Bean(name = "testing")
	// @Primary //for giving prefernce to particular dept we give @Primary so that
	// it will execute first
	public DepartmentBean getTestingDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(300);
		bean.setDeptName("Sr.Tester");
		return bean;

	} // end of gettesting()

	@Bean(name = "hr")
	public DepartmentBean getHrDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(400);
		bean.setDeptName("HR");
		return bean;
	}// end of hr()

}// end of class
