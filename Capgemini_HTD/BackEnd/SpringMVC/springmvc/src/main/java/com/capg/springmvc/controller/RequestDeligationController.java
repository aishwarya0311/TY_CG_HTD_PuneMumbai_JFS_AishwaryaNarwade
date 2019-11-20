package com.capg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligationController {

	@GetMapping("/redirect")
	public String redirectRequest() {
		return "redirect:http://www.google.com";  //to redirect give redirect and : 
	}

	@GetMapping("/forward")                                                               
	public String forwardRequest() {
		return "forward:/loginForm";
		
	}
	@GetMapping("/include")
	public String includeRequest() {
		return "include :http://www.facebook.com";
	}
}
