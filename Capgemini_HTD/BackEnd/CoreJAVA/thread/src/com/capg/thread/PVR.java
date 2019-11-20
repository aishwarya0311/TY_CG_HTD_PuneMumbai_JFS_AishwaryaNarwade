package com.capg.thread;

public class PVR {

	
	 synchronized void confirm() {   //synchronized makes thread thread safe 
		for(int i=0; i<5;i++) {
			System.out.println(i);
		}
		try {
			wait();
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
 
	synchronized void leaveMe() {
		System.out.println("notify all");
	
	}
}
