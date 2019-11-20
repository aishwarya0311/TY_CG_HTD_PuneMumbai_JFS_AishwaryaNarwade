package com.capg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.beans.Pet;

public class AnimalTest {
	public static void main(String[]arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PetConfig.xml");
		Pet myPet = context.getBean("pet",Pet.class);
		myPet.getAnimal().eat();
		myPet.getAnimal().speak();
		myPet.getAnimal().walk();
	}

}
