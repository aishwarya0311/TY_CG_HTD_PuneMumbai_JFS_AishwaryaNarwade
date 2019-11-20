package com.capg.thread;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main started.....");
		Pen p = new Pen();           //pen object created with p ref variable
        p.start();		
		Pen t =  new Pen ();
		t.start();
		
		System.out.println("Main ended.....");
	}

}
