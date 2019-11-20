package com.capgemini.exceptionhandle.railway;

public class Test {

	public static void main(String[] args) {
System.out.println("main started");

Paytm p = new Paytm();
try {
p.book();
}
catch (ArithmeticException a)
{
	System.out.println("Exception at main method caught");
}


System.out.println("main ended");
	}
}
