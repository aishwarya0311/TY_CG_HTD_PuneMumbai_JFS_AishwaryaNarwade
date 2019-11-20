package com.capg.springcore.beans;

import com.capg.springcore.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Bamboo..");

	}//End of eat

	@Override
	public void speak() {
		System.out.println("Panda Squeaks..");

	}//end of speak

	@Override
	public void walk() {
System.out.println("Panda is walking..");
	}

}
