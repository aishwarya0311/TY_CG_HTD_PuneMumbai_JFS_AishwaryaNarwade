package com.capg.springcore.annotations.beans;

import com.capg.springcore.interfaces.Engine;

public class ISuzu implements Engine {

	@Override
	public int getCC() {
		return 1700;
	}

	@Override
	public String getType() {
		return "4-Stroke Petrol";
	}
	

}
