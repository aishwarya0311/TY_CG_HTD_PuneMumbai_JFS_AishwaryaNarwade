package com.capg.assessment.dao;

import java.util.List;

import com.capg.assessment.bean.UserBeanAccount;

public interface UserDao {
	public UserBeanAccount register();
	public UserBeanInbox compose();
	public <UserBeanInbox> List <UserBeanInbox> getAllInfo();
	UserBeanAccount login(String user_name, String password);

	
	

}
