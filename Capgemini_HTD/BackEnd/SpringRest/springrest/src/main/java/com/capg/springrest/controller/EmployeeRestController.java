package com.capg.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springrest.bean.EmployeeInfoBean;
import com.capg.springrest.bean.EmployeeResponse;
import com.capg.springrest.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins ="*", allowedHeaders="*")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;

	@GetMapping(path="/getEmployee",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	// @ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		
		if(employeeInfoBean !=null) {
			response.setStatuscode(210);
			response.setMessage("Success");
			response.setDescription("Employee Record found..");
		}else {
			response.setStatuscode(901);
			response.setMessage("Failed");
			response.setDescription("Employee ID " + empId + "Not Found !!");
		}
		return response;
	}// end of getEmployee()
	
	
	

	@PutMapping(path="/addEmployee",consumes= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
			produces = MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);
		
		EmployeeResponse response = new EmployeeResponse();
		if (isAdded)
		{response.setStatuscode(201);
		response.setMessage("success");
		response.setDescription("Employee added succesfully");
		}else {
			response.setStatuscode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to add");
		}
		return response;
			}// end of add employee
		
	
	@DeleteMapping(path="/deleteEmployee",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse deleteEmployee(int empId) {
		boolean isDeleted = service.deleteEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if (isDeleted)
		{response.setStatuscode(101);
		response.setMessage("success");
		response.setDescription("Employee deleted succesfully");
		}else {
			response.setStatuscode(301);
			response.setMessage("Failed");
			response.setDescription("Unable to delete ");
		}
		return response;
		
	}//end of delete employee()
	
	@PostMapping(path="/updateEmployee",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse updateEmployee (@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if (isUpdated)
		{response.setStatuscode(601);
		response.setMessage("success");
		response.setDescription("Employee deleted succesfully");
		}else {
			response.setStatuscode(501);
			response.setMessage("Failed");
			response.setDescription("Unable to update ");
		}
		return response;
	}//end of update employee()
	
	@GetMapping(path="/getAll",produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getAllEmployees(){
		List <EmployeeInfoBean> employeeList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		
		if(employeeList != null && !employeeList.isEmpty()) {
			response.setStatuscode(111);
			response.setMessage("Success");
			response.setDescription("Employee list found");
		}else {
			response.setStatuscode(501);
			response.setMessage("Failed");
			response.setDescription("Unable to fetch employee record !! ");
		}
		return response;
	}//end of get all employee
}// end of class
