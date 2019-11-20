package com.capg.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean {

	private String message; // data member

	// getter & setter

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {  //initialization of object
System.out.println("Its Initialization Phase..");
	}
	@Override
	public void destroy() throws Exception {     //destroy method for object
System.out.println("Its Destroy Phase..");		
	}

}
