package com.capg.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.annotations.beans.Sports;

public class SportsTest {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("sportsConfig.xml");
Sports sports = context.getBean("sports", Sports.class);
System.out.println("Sports Name : " + sports.getName());
System.out.println("Total Players : " + sports.getTotalplayers());
System.out.println("Team Info : " +sports.getTeamInfo());

	}//end of main()

}//end of class
