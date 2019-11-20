package com.capgemini.exceptionhandle.railway;
import java.util.Scanner;
public class TestG {
 public static void main(String[] args)
 {
	 try(Scanner scr= new Scanner(System.in))
			 { System.out.println("Enter age");
	 int age= scr.nextInt();
	 
	 System.out.println("Age is"+ age);
 }
}
}
