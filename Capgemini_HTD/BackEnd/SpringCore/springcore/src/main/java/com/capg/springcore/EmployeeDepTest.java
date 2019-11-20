package com.capg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.beans.EmployeeBean;

public class EmployeeDepTest {

	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		EmployeeBean employeeBean = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Employee Id : " + employeeBean.getEmpId());
		System.out.println("Employee Name :" + employeeBean.getName());
		System.out.println("Dept Id : " + employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept Name :" + employeeBean.getDeptBean().getDeptName());	
	}//end of main

}//end of class
