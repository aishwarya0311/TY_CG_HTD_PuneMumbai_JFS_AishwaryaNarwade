package com.capg.functionalInterface;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {

	Predicate<Integer>	 p = (i)-> {   //Predicate functional interface which takes object & return boolean
			if(i%2==0) {
				return false;
			}
			else {
				return true;
			}
		};
		boolean a = p.test(5);
		System.out.println("Result is : " +a);
	}// end of main

}// end of class
