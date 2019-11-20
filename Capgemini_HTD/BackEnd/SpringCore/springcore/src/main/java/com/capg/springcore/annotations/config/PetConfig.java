package com.capg.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capg.springcore.annotations.beans.Pet;
@Import(AnimalConfig.class)
@Configuration
public class PetConfig {
	@Bean
	public Pet getPet() {
		Pet myPet = new Pet();
		myPet.setName("Name is : Pandu");
		return myPet;
		
	}//end of getPet()

}//end of class
