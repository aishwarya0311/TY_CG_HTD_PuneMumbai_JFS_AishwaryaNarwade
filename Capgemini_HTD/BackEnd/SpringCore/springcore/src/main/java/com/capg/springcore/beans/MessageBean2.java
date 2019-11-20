package com.capg.springcore.beans;

public class MessageBean2 {
	
	private String message ;

	public MessageBean2() {
		System.out.println("constructor");
	}
	
	//getters and setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void test() {   // just a method for initialization
		System.out.println("Its Initialization phase...");
	}
	public void destroy() {      //just a method for destroying object
		System.out.println("Its Destroy phase...");
	}
	
}//end of class 
