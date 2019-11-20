package com.capgemini.exceptionhandle.railway;

public class Paytm {
void book() {
	System.out.println("booking started");
	
IRCTC i = new IRCTC();
try {
i.confirm();
}
catch(ArithmeticException k) {
	System.out.println("Exception handling at Paytm caught");
}
System.out.println("Booking ended");
}
}

