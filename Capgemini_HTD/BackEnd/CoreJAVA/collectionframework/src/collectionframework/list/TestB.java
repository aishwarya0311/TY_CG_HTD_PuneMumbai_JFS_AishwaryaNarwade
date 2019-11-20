package collectionframework.list;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {

		ArrayList<Student> al= new ArrayList<Student>();
		Student s1= new  Student (1,"Aishwarya",85);
		Student s2= new Student (2,"Divya",85.99);
		Student s3= new Student (3,"priya",80);
		Student s4= new Student (4,"Saksham",74.2);
		Student s5= new Student (5,"Sheila",85);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		for (int i=0;i<5;i++) {
			Student s = al.get(i);
			System.out.println("Name is : " +s.name);
			System.out.println("ID is : " +s.id);
			System.out.println("Percentage is : "+s.percentage);
			System.out.println("----------------------------------------------------------");
			
		}
	}

}
