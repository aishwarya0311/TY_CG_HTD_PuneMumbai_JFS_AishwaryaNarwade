package com.capgemini.exceptionhandle.railway;

public class PVR {
	void confirm ()
	{
		System.out.println("confirm started");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException s)
		{
			System.out.println("Exception caught at confirm in pvr");
			throw s;
		}
		finally
		{
			System.out.println("confirm ended");
		}
	}
	}
