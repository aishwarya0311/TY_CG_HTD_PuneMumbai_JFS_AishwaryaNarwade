package com.capg.springcore.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.springcore.interfaces.Engine;

public class Car {
	
	private int modelNum;
	private String modelName;
	@Autowired
	private Engine engine;
	
	//getters and setters
	
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}//end of class
