package com.capgemini.exceptionhandle.railway;

public class Amount {
	void check1(int val) throws InvalidLimitException{
		if(val>40000) {
			
			throw new InvalidLimitException();
			
		}
	}

	public void check(int val) {
		
	}

}
