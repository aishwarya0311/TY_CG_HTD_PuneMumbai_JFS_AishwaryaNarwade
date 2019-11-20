package com.capgemini.exceptionhandle.railway;

public class IRCTC {
	void confirm()
	{
		System.out.println("confirm started");
		
		try {
		
		System.out.println(10/0);
		}
		catch(ArithmeticException b) {
			System.out.println("Exception caught at irctc");
		}
		System.out.println("confiirm ended");
	}
	}
