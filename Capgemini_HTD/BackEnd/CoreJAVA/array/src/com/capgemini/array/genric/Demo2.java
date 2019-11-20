package com.capgemini.array.genric;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
Scanner scr= new Scanner(System.in);
System.out.println("Enter the name");
String name= scr.nextLine();

System.out.println("Enter the age");
int age = scr.nextInt();


System.out.println("Enter the height");
double height = scr.nextDouble();

System.out.println("Name is"+name);
System.out.println("Age is"+age);
System.out.println("Height is"+height);
scr.close();
	}

}
