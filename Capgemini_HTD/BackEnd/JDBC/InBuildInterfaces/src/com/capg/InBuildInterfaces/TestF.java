package com.capg.InBuildInterfaces;

import java.util.function.Supplier;

public class TestF {

	public static void main(String[] args) {

		Supplier <StudentPredicate> a = () -> new StudentPredicate ();
		StudentPredicate s= a.get();
		StudentPredicate p =a.get();
		
		System.out.println(s);
		System.out.println(p);
	}

}
