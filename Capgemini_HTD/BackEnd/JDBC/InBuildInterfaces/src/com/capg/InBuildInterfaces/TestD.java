package com.capg.InBuildInterfaces;

import java.util.function.Function;

public class TestD {

	public static void main(String[] args) {
Function<Integer,Integer> f= i->i*i;         //lambda expression

int ans = f.apply(8);
System.out.println("Result is :"+ ans);
	}

}
