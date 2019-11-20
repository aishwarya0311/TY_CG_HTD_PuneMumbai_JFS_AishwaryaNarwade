package com.capg.jdbc.dao;

import java.util.List;
import java.util.Scanner;
import com.capg.jdbc.bean.UserBean;
import com.capg.jdbc.jdbc.factory.UserFactory;

public class GetInfo {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter the id and password...");
		
	   // UserBean user = dao.userLogin(sc.nextInt(),sc.next());  //scanner input lines
//UserBean user = dao.getInfo(sc.next());
		List<UserBean> userlist =dao.getAllInfo();
		if (userlist!= null) {
			System.out.println(userlist);
		}
		else {
			System.out.println("Something went wrong......");
		}
		sc.close();
	}

}
