package com.capg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.beans.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		EmployeeBean employeeBean = (EmployeeBean) context.getBean("employee1");   //down-casting the employee object
		EmployeeBean employeeBean2 = (EmployeeBean) context.getBean("employee2");

		
		System.out.println("Employee Id is : "+ employeeBean.getEmpId());
		System.out.println("Employee name is : "+ employeeBean.getName());
		System.out.println("Employee Id is : "+ employeeBean2.getEmpId());
		System.out.println("Employee name is : "+ employeeBean2.getName());
		

	}//end of main

}//end of class
