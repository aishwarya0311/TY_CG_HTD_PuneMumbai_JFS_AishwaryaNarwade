package com.capg.springcore.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
	private int empId;
	private String name;
	
	@Autowired(required= false)
	@Qualifier("hr")                  //@qualifier comes along with @autowired used instead of primary
	private DepartmentBean deptBean;  //dependent object

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
	
	//bean life-cycle methods
	
	@PostConstruct
	public  void init( ) {
		System.out.println("Its Init phase...");
	}//end of init
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Phase...");
	}

}//end of class
