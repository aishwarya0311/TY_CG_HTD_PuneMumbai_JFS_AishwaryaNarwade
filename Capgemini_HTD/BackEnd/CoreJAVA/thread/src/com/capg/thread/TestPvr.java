package com.capg.thread;

public class TestPvr {

	public static void main(String[] args) {

		PVR a = new PVR ();  //created object
		
		Paytm t1 = new Paytm(a);
		
		Paytm t2 = new Paytm(a);
		t1.start();
		t2.start();
		
	
		a.leaveMe();
				}
	}


