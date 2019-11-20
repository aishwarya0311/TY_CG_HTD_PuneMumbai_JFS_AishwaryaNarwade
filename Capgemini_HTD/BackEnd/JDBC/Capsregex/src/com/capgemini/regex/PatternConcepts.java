package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternConcepts {
	static Pattern pattern;    // pattern and matcher can take only string input 
	static Matcher matcher;
	public static void main(String[] args) {
		pattern = Pattern.compile("\\d");  // \\d is used to match single digit 0-9 here d means digit
		matcher = pattern.matcher("5"); // if we want to print 2 digit number we need to give \\d+
		System.out.println("patten\\d: "+ matcher.matches());
		
		pattern = Pattern.compile("\\d+");  // \\d+ is used to match multiple digit 0-9 here d means digit
		matcher = pattern.matcher("145678956465451"); // if we want to print 2 digit number we need to give \\d+
		System.out.println("patten\\d+: "+ matcher.matches());
		
		pattern = Pattern.compile("\\D");  // \\D is used to match the single  chracter only
		matcher  = pattern.matcher("A");
		System.out.println("patter  \\D:" + matcher.matches());
		
		pattern = Pattern.compile("\\W");  // \\w is used to match the single  chracter only
		matcher  = pattern.matcher("AGSCGNVSGYJHY");
		System.out.println("patter  \\w:" + matcher.matches());
		
		
		pattern = Pattern.compile("\\w");  // \\w is used to match the single  chracter only
		matcher  = pattern.matcher("1215555");
		System.out.println("patter  \\w:" + matcher.matches());
		
		
		pattern = Pattern.compile("\\w+");  // \\w+ is used to match the multiple  chracter only
		matcher  = pattern.matcher("dsdvxbfhgfjmg");
		System.out.println("patter  \\w+:" + matcher.matches());
		
	}

}
