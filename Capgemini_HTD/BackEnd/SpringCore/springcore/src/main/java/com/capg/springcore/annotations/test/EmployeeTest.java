package com.capg.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capg.springcore.annotations.beans.DepartmentBean;
import com.capg.springcore.annotations.beans.EmployeeBean;
import com.capg.springcore.annotations.config.DepartmentConfig;
import com.capg.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println("EmpId is : " + employeeBean.getEmpId());
		System.out.println("EmpName is  : " + employeeBean.getName());
		System.out.println("Department Info -------------");
		System.out.println("Dept Id = " + employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept Name = " + employeeBean.getDeptBean().getDeptName());
		
		//for closing the container to get the destroy the bean object
		((AbstractApplicationContext)context).close();
		//((AbstractApplicationContext)context).registerShutdownHook();
	}

}//end of class
