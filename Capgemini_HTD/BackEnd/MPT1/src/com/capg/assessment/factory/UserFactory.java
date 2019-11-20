package com.capg.assessment.factory;

import com.capg.assessment.dao.UserDao;
import com.capg.assessment.dao.UserDaoImplementation;

public class UserFactory {

	private UserFactory() {
		
	}
			
		public static UserDao getInstance() {
			UserDao dao = new UserDaoImplementation();
			return dao;
		}

	}

