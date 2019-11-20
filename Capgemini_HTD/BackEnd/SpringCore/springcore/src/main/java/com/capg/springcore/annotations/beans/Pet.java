package com.capg.springcore.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.springcore.interfaces.Animal;

public class Pet {
private String name;
@Autowired
private Animal animal;


//getters and setters

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Animal getAnimal() {
	return animal;
}
public void setAnimal(Animal animal) {
	this.animal = animal;
}


}//end of class
