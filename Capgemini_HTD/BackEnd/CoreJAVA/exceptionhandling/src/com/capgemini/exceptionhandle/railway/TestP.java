package com.capgemini.exceptionhandle.railway;

public class TestP {
	public static void main(String[] args) {
		Validator v= new Validator();
		try {
			v.verify(44);     //validating the age for exception//
			System.out.println("Welcome to pub");
		}
		catch(InvalidAgeException in)
		{
			System.err.println(in.getMessage());  //err is used for printing the mesage in red color
			
		}
	}

}
