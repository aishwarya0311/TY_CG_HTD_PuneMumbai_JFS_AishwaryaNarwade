package com.capg.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capg.springcore.annotations.beans.ISuzu;
import com.capg.springcore.annotations.beans.VolksWagon;
import com.capg.springcore.interfaces.Engine;

@Configuration
public class EngineConfig {

	@Bean(name = "Isuzu")
	
	public Engine getISuzu() {
		return new ISuzu();
	}

	@Bean(name = "Volkswagon")
	@Primary
	public Engine getVolksWagon() {
		return new VolksWagon();
	}
}//end of class
