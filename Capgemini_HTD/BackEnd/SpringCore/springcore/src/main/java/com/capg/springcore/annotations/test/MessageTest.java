package com.capg.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.springcore.annotations.beans.MessageBean;
import com.capg.springcore.annotations.config.MessageConfig;

public class MessageTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext (MessageConfig.class);  //initializing container
		MessageBean messageBean = context.getBean(MessageBean.class);
		System.out.println("Message 1 : " + messageBean.getMessage());
		
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		System.out.println("Message 2 : " + messageBean2.getMessage());
		
		messageBean2.setMessage("Its New Message for bean2");
		System.out.println("Message 1 : " + messageBean.getMessage());
		System.out.println("Message 2 : " + messageBean2.getMessage());
		
	}//end of main()

}//end of class
