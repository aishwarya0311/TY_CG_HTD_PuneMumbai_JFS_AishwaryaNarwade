package com.capg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.beans.Mobile;

public class MobileTest {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
Mobile mobile = context.getBean("mobile", Mobile.class);

System.out.println("BrandName : " + mobile.getBrandName() );
System.out.println("ModelName :  " + mobile.getModelName());
System.out.println("Price : " + mobile.getPrice());
System.out.println("Display size : " + mobile.getMobiledisplay().getDisplaysize());
System.out.println("Resolution : " + mobile.getMobiledisplay().getResolution());
	}

} //end of class
