package com.capg.jdbc.jdbc.factory;

import com.capg.jdbc.dao.UserDAO;
import com.capg.jdbc.dao.UserDAOImpl;

public class UserFactory {
	private UserFactory (){
		}
		
	public static UserDAO getInstance() {
		UserDAO dao = new UserDAOImpl();
		return dao;
	}

}

