package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts2 {

	public static void main(String[] args) {
 
		
		// small d is for  matching integers
		Pattern	pat = Pattern.compile("\\d");    //for single digit input pattern will create pattern
		  Matcher mat = pat.matcher("8");       //matcher will take input that needs to be matched
		  System.out.println(" For pattern\\d: "+ mat.matches());
		//here for\\d only single value can be given
		  
		 
		  Pattern pat1 = Pattern.compile("\\d+");    //for multiple digit [+] input pattern will create pattern 
		  Matcher mat1 = pat1.matcher("847855312156");       //matcher will take input that needs to be matched
		  System.out.println(" For pattern\\d+ : " +mat1.matches());
		  
		  Pattern pat2= Pattern.compile("\\d{10}");  //specify length of the number 
		  Matcher mat2= pat2.matcher("12345678545121233");  // here length is greater than 10 hence it will false
		  System.out.println("For pattern \\d{} : "+mat2.matches());
		  
		  Pattern pat3= Pattern.compile("\\d{1}");  //specify length of the number 
		  Matcher mat3= pat3.matcher(" ");  // here empty string is consider as single space
		  System.out.println("For pattern \\d{1} : "+mat3.matches());
		  
		  Pattern pat4= Pattern.compile("\\d{1,9}");   //here {1,9} means its minimum and max range
		  Matcher mat4=pat4.matcher("1234");
		  System.out.println("For pattern \\d  : "+mat4.matches());
		  
		  // Capital D is for  matching characters
		  Pattern pat5= Pattern.compile("\\D");  //specify character
		  Matcher mat5= pat5.matcher("12345678545121233");  // here string input gives false and number of digits
		  System.out.println("For pattern \\D : "+mat5.matches());
		  
		  Pattern pat6= Pattern.compile("\\D");  //specify character 
		  Matcher mat6= pat6.matcher("G  ");  // here single character and space gives true output
		  System.out.println("For pattern \\D : "+mat6.matches());
		  
		  
		 //  s is used to match space & to match multiple spaces use s+
		  
		  Pattern pat7= Pattern.compile("\\s");  //here space is input
		  Matcher mat7= pat7.matcher(" ");  // here single space is given
		  System.out.println("For pattern \\s: "+mat7.matches());
		  
		  Pattern pat8= Pattern.compile("\\s+");  //specify multiple spaces
		  Matcher mat8= pat8.matcher("        ");  // here multiple spaces is given as input
		  System.out.println("For pattern \\s+ : "+mat8.matches());
		  
		  Pattern pat9= Pattern.compile("\\S");  // cannot specify space and character 
		  Matcher mat9= pat9.matcher("a");  // here only character can be given
		  System.out.println("For pattern \\S: "+mat9.matches());
		  
		  Pattern pat10= Pattern.compile("\\W");  //here W
		  Matcher mat10= pat10.matcher("2");  // here W takes only special char 
		  System.out.println("For pattern \\W: "+mat10.matches());
		  
		  
		  Pattern pat11= Pattern.compile("\\W+");  //here W
		  Matcher mat11= pat11.matcher("@@&");  // here W takes only multiple special char 
		  System.out.println("For pattern \\W: "+mat11.matches());
		  
		  Pattern pat12= Pattern.compile("\\w");  //here W
		  Matcher mat12= pat12.matcher("d");  // here W takes only special char 
		  System.out.println("For pattern \\W: "+mat12.matches());
		  
		  Pattern pat13= Pattern.compile("\\w+");  //here W
		  Matcher mat13= pat13.matcher("2");  // here W takes only special char 
		  System.out.println("For pattern \\w+: "+mat10.matches());
		  
	}

}
