package com.capg.springrest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
@JsonPropertyOrder({"employeeId","name","designation"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("employee")
@XmlRootElement(name="emp-info")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean {
	
	// for bean class private variables are required
	
	@JsonProperty("employeeId")
	@XmlElement(name="emp-id")
	@Id
	@Column(name = "emp_id")
	private int empId;
	
	@JsonProperty("name")
	@XmlElement(name="emp-name")
	@Column(name = "emp_name")
	private String name;
	
	@XmlElement(name="emp-age")
	@Column
	private int age;
	
	@XmlElement(name="salary")
	@Column
	private double salary;
	
	@XmlElement(name="designation")
	@Column
	private String designation;
	
	@XmlElement(name="gender")
	@Column
	private char gender;
	
	@XmlElement(name="mobile")
	@Column
	private long mobile;
	
	//@JsonIgnore             //to avoid the json object to map the particular field
	//@XmlTransient
	@Column
	private String password;

	// getter setter method
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}// end of getter setter method

}// end of class
