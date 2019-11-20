package com.capg.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	
	@GetMapping("/cookiePage")
	public String displayCookiePage() {
		return "cookiePage";
	}//end of display CookiePage()

	@GetMapping("/createcookie")
	public String createcookie(HttpServletResponse resp, ModelMap modelMap) {
		Cookie mycookie = new Cookie ("name", "Aishwarya Narwade");
		resp.addCookie(mycookie);
		
		modelMap.addAttribute("msg" , "Cookie created successfully..");
		return "cookiePage";
	}//end of create cookie
	
	public String readCookie(@CookieValue(name="name")String name, ModelMap modelMap) {
		modelMap.addAttribute("msg","Cookie value is" +name);
		return "cookiePage";
	}//end of read cookie
}//end of class
