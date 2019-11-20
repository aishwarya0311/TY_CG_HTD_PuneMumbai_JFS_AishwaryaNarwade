package com.capg.jdbcregexintegrate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataVerification {
	
	Pattern pat = null;
	Matcher mat= null;
	
	public boolean idVer(String userid) {
 pat = Pattern.compile("\\d+");
 mat = pat.matcher(userid);                    

 if(mat.matches()) {

		return true;

	}else {
		return false;
		
	}

	}
	
	

	public boolean nameVer(String username) {
		pat=Pattern.compile("\\w+\\s\\w+");
		mat=pat.matcher(username);
		if(mat.matches())
		{
			return true;
		}
		else {
			return false;
		}
	}


	public boolean passVer(String password) {
		pat=Pattern.compile("\\w+");
				mat=pat.matcher(password);
				if(mat.matches())
				{
					return true;
				}else {
					return false;
				}
	}

	public boolean emailVer(String email) {
		pat=Pattern.compile("\\w+\\W\\w+\\.\\w+");
		mat=pat.matcher(email);
		if(mat.matches()) {
			return true;
		}
		else {
			
		}
		return false;
	}

}
