package com.capg.springcore.annotations.beans;

import com.capg.springcore.interfaces.Engine;

public class VolksWagon  implements Engine{

	@Override
	public int getCC() {
		return 1500;
	}

	@Override
	public String getType() {
		return "VW 4-stroke petrol";
	}
	

}
