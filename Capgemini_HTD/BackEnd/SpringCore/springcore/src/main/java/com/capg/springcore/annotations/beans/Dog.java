package com.capg.springcore.annotations.beans;

import com.capg.springcore.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("eating Pedigree");

	}//end of eat()

	@Override
	public void speak() {
System.out.println("Bow Bow");
	}

	@Override
	public void walk() {
		System.out.println("Dog is running..");

	}//end of walk()

}//end of class
