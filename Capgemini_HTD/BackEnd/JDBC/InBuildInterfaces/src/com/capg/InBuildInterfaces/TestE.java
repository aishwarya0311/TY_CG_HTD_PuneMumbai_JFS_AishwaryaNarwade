package com.capg.InBuildInterfaces;

import java.util.function.Function;

public class TestE {

	public static void main(String[] args) {

		Function <Integer,StudentPredicate> f= i-> {
			StudentPredicate s= new StudentPredicate();
			s.id=i;
			return s;
		
	};
	StudentPredicate s = f.apply(10);
	System.out.println("Name is :"+s.name);
	System.out.println("ID is :"+s.id);
	
	System.out.println("Percentage is :"+s.percentage);
	
	}

}
