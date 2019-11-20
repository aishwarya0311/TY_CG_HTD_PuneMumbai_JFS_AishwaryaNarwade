package com.capg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.beans.MessageBean2;

public class MessageTest2 {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml"); //initialization of container


MessageBean2 messageBean2 = context.getBean("messageBean2", MessageBean2.class);  //printing the message
System.out.println("Message : " + messageBean2.getMessage());

MessageBean2 bean2 = context.getBean("messageBean2", MessageBean2.class);  //printing the message
System.out.println("Message : " + bean2.getMessage());

((AbstractApplicationContext)context).close();  //explicitly closing the object
		
	}//end of main()

}//end of class
