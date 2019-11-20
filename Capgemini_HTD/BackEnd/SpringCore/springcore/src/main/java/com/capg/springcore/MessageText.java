package com.capg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.beans.MessageBean;

public class MessageText {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// ((AbstractApplicationContext)context).registerShutdownHook(); //for destroying the object after the main() execution 
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");

		System.out.println(messageBean.getMessage());
		((AbstractApplicationContext) context).close();  // explicitly closing the object onthe spot

	}// end of main()

}// end of class
