package com.capg.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.beans.EmployeeBean;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");  //instantiate the container
		EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class); // down- casting, returns object

		System.out.println("Enter Employee Id : ");
		int empId = scr.nextInt();
		scr.nextLine();
		System.out.println("Enter Employee name : ");
		String name = scr.nextLine();

		emp1.setEmpId(empId);
		emp1.setName(name);
		
		System.out.println("Emp-1 Id = " + emp1.getEmpId());
		System.out.println("Emp-1 Name = " + emp1.getName());

		// for second employee

		EmployeeBean emp2 = context.getBean("employee", EmployeeBean.class); // down- casting

		System.out.println("Enter Employee Id : ");
		int empId2 = scr.nextInt();
		scr.nextLine();
		System.out.println("Enter Employee name : ");
		String name2 = scr.nextLine();

		emp2.setEmpId(empId2);
		emp2.setName(name2);
		
		System.out.println("Emp-1 Id = " + emp1.getEmpId());
		System.out.println("Emp-1 Name = " + emp1.getName());
		System.out.println("Emp-2 Id = " + emp2.getEmpId());
		System.out.println("Emp-2 Name = " + emp2.getName());


	}// end of class

}// end of class
