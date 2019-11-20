package com.capg.assessment.controller;

import java.util.Scanner;

import com.capg.assessment.bean.UserBeanAccount;
import com.capg.assessment.dao.UserDao;
import com.capg.assessment.factory.UserFactory;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("GMAIL.COM");
		System.out.println("Press 1 to login....");
		System.out.println("Press 2 to register...");
		Scanner scr= new Scanner (System.in);
		int i= scr.nextInt();
		UserDao dao= UserFactory.getInstance();
		String user_name = null;
		String password = null;
		if(i==1) {
			System.out.println("Enter email id..");
			scr.nextLine();
			System.out.println("Enter password....");
			scr.nextLine();
			UserBeanAccount login=dao.login(user_name, password);
			
			System.out.println("Press A to Compose....");
			System.out.println("Press B to Show inbox");
		}
	}
}