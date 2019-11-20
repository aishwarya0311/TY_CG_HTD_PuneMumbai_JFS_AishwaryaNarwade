package com.capg.maps.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class StudentMapTest {

	public static void main(String[] args) {

	
	Student s1= new Student (1, " Sunny",74.55);
	Student s2= new Student(2, " Priya",72.55);
	Student s3= new Student(3, " Divya",70);
	Student s4= new Student(4, " Raju",68.55);
	Student s5= new Student(5, " Dimple",55.55);
	Student s6= new Student(6, " Ramesh",90.22);
	Student s7= new Student(7, " Supriya",88.55);
	Student s8= new Student(8, " Dolly",45.5);
	Student s9= new Student(9, "Kavita",56.55);
	
	ArrayList<Student> al1 = new ArrayList<Student>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	
	
	ArrayList<Student> al2 = new ArrayList<Student>();
	al2.add(s4);
	al2.add(s5);
	al2.add(s6);
	
	ArrayList<Student> al3 = new ArrayList<Student>();
	al3.add(s7);
	al3.add(s8);
	al3.add(s9);
	
	LinkedHashMap <String, ArrayList<Student>> hm = new	LinkedHashMap<String , ArrayList <Student>> ();
	
	hm.put("First" , al1);
	hm.put("Second ", al2);
	hm.put("Third",al3);
	
	ArrayList <Student> al= hm.get("Third");
	Iterator <Student> it= al.iterator ();
	while(it.hasNext()) {
		Student s= it.next();
		System.out.println("Name is  :"+s.name);
		System.out.println("Id is :"+s.id);
		System.out.println("Percentage is :"+s.percentage);
		System.out.println("***********************************************************");
	}
		
	}

}
