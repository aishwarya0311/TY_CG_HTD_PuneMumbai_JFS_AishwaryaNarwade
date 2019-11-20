package com.capg.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capg.springmvc.bean.EmployeeInfoBean;
import com.capg.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/empLoginForm")
	public String displayLoginForm() {
		return "empLogin";

	}
//end of displayLoginform()

	@PostMapping("/empLogin")
	public String empLogin(int empId, String password, ModelMap modelMap) {
		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);
		if (employeeInfoBean != null) {
			return "empHomePage";
		} else {
			// Invalid credentials
			modelMap.addAttribute("msg", "Invalid Credentials");
			return "empLoginForm";
		}

	}// end of empLogin()

	@GetMapping("/addEmployee")

	public String displayAddEmpForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "Please Login first!!!");
			return "empLoginForm";

		} else {
			return "addEmployee";
		}

	}// end of displayaddform()
	
	@PostMapping("/addEmployee")
		public String addEmployee(EmployeeInfoBean employeeInfoBean , HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg","Please Login First");
			return "empLogin";
		}
		else {
			//valid session 
			if(service.addEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee added successfully");
			} else {
				modelMap.addAttribute("msg","Unable to addemployee");
			}
		}return "addEmployee";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		
		modelMap.addAttribute("msg", "Logged out successfully");
		return"empLoginFor";
	}//end of logout
	
	@GetMapping("/updateEmployeeForm")
	public String displayUpdateEmpForm(HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			//Invalid session 
			modelMap.addAttribute("msg", "Please Login first");
			return "empLoginForm";
		}else {
			return "updateEmployeeForm";
		}
	}//end of updateEmployeeForm
	
	@PostMapping ("/updateEmployee")
	public String updateEmployee (EmployeeInfoBean employeeInfoBean, HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			//invalid session
			modelMap.addAttribute("msg","Please Login First");
			return "empLoginForm";
		}
		else {
			//valid session 
			if(service.updateEmployee(employeeInfoBean)) {
				modelMap.addAttribute("msg", "Employee details updated successfully");
			} else {
				modelMap.addAttribute("msg","Unable to update employee");
			}
		}return "addEmployee";
		}
	

}// end of class
