package com.capg.assessment.controller;

import java.util.Scanner;

import com.capg.assessment.bean.UserBeanAccount;
import com.capg.assessment.dao.UserDao;
import com.capg.assessment.factory.UserFactory;

public class GetAllInfo {
	Scanner scr = new Scanner(System.in);
	UserDao dao = UserFactory.getInstance();
    UserBeanAccount user1 = dao.login(scr.next(),scr.next()){ //scanner input lines
//UserBeanAccount user = dao.login(scr.next());
	if (email != email){
		System.out.println();
	}
	else {
		System.out.println("try again !!!");
	}
	
}
}

	

