package com.capg.assessment.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import com.capg.assessment.bean.UserBeanAccount;

public class UserDaoImplementation implements UserDao {
	FileReader reader = null;;
	Properties prop = null;
	UserBeanAccount user;
	Connection conn = null;
	UserBeanInbox mail;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2= null;
	
	public void UserDAOImplementation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
				reader = new FileReader("db.properties");
				prop = new Properties(); 
				prop.load(reader); 
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	@Override
	public  UserBeanAccount login(String user_name, String password) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query"))){
			int user_id = 0;
			pstmt1.setString(1, email);
			pstmt2.setString(2, password);
			
			try(ResultSet rs= pstmt1.executeQuery()){
				if(rs.next()) {
					user = new UserBeanAccount();
					user.setUser_id(rs.getInt(1));
					user.setUser_name(rs.getString(2));
					user.setPassword(rs.getString(3));
					user.setEmail(rs.getString(4));
					}
				return user;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public UserBeanAccount register(String user_name, String password, String email) {
		return user;
		
	}
	
	@Override
	public UserBeanInbox compose(String email, String message) {
		return mail;
		
	}

	@Override
	public <UserBeanInbox> List<UserBeanInbox> getAllInfo() {
		List<UserBeanInbox> userlist= new List<UserBeanInbox>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
		           Statement stmt= conn.createStatement();
			 ResultSet rs=stmt.executeQuery(prop.getProperty("query")))
				{
					while(rs.next())
				{ 
				user.setUser_id(rs.getInt(1));
				user.setUser_name(rs.getString(2));
				user.setEmail(rs.getString(3));
				userlist.All(user);
			} 
		}
		catch ( Exception e) {
			e.printStackTrace();}
return userlist;
		
	}
	
}
