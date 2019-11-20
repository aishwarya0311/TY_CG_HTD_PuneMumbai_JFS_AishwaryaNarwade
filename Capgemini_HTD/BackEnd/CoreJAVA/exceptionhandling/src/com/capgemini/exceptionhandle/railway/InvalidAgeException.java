package com.capgemini.exceptionhandle.railway;

public class InvalidAgeException  extends RuntimeException {
	private String message= "Invalid age to proceed";
	
	public InvalidAgeException() {
		
	}
	
	@Override                // for custom unchecked exception we need to override 
	public String getMessage() {
		return message;
	}
	
	

}
