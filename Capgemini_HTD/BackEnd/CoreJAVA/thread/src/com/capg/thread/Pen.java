package com.capg.thread;

public class Pen extends   Thread {
      @Override
public void run() {                        //for thread to run we need to override the run method 
	
    	  for(int i=0; i<5; i++) {
    		  System.out.println(i);
    	  }
}
}
