package com.capg.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMVCController {

	@InitBinder
	// for date
	public void initBinder(WebDataBinder binder) { // binding the web paraameters
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}// end of init binder

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView displayHelloUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/views/helloUser.jsp");
		return modelAndView;
	}// end of displayHelloUser()

	@RequestMapping(path = "/loginForm", method = RequestMethod.GET)
	public ModelAndView displayLoginForm() {
		ModelAndView modelAndView = new ModelAndView();
		// modelAndView.setViewName("/WEB-INF/views/loginForm.jsp");
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}// end of displayLoginForm

	// 1st method to login and display username &password
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, ModelAndView modelAndView) {
		String empIdVal = req.getParameter("empId");
		String password = req.getParameter("password");

		req.setAttribute("empId", empIdVal);
		req.setAttribute("pwd", password);
		// modelAndView.setViewName("/WEB-INF/views/userDetails.jsp");
		return modelAndView;

	}// end of login

	// 2nd method to login and display username &password
	@RequestMapping(path = "/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("empId") int empId, @RequestParam("password") String password,
			ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);

		// return "/WEB-INF/views/userDetails.jsp";// if viewResolver is not configured
		return ("userDetails");

	}// end of login2

	// 3rd method to login and display username &password
	@PostMapping("/login3")
	public String login3(int empId, String password, ModelMap modelMap) {

		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);
		return "userDetails";
	}// end of login3

	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);

		return "userDetails";
	}

}// end of controller
