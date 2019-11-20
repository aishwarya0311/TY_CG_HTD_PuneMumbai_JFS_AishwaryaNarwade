package com.capgemini.exceptionhandle.railway;

public class BookMyShow {

	public static void main(String[] args) {
		System.out.println("main started");
PVR p= new PVR();
try {
	p.confirm ();
}
catch(ArithmeticException d) {
	System.out.println("Exception caught at main in BMS");
}
System.out.println("main ended");
	}

}
