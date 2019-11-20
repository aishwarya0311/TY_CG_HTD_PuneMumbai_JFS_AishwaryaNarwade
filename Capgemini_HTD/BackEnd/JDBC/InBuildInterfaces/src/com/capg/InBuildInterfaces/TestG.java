package com.capg.InBuildInterfaces;

import java.util.function.Consumer;

public class TestG {

	public static void main(String[] args) {

		Consumer <StudentPredicate> c = (s)-> {
			System.out.println("Name is "+s.name);
			System.out.println("Id is :"+s.id);
		};
	}

}
