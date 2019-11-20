package com.capg.jdbc.dao;

import java.util.List;

import com.capg.jdbc.bean.UserBean;

public interface UserDAO {
	
	public UserBean getInfo(int userid);
	public UserBean userLogin(int userid,String password);
	public List<UserBean> getAllInfo();
	

}
