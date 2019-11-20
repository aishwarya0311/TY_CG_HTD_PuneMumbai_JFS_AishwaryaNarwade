package com.capgemini.jpawithhibernet;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.manytomany.Course;
import com.capg.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {

		
		ArrayList<Course> list =  new ArrayList<Course> ();
		Course c = new Course();
		c.setCid(1);
		c.setCname("Java");
		list.add(c);
		
		Course c1= new Course();
		c1.setCid(2);
		c1.setCname("Hibernate");
		list.add(c1);
		
		Student s = new Student ();
		s.setSid(1);
		s.setSname("Aishwarya");
		s.setCourse(list);
		
		
		EntityManager entitymanager= null;
		EntityTransaction transaction = null;
		EntityManagerFactory entitymanagerfactory= null;
		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Demo");
			entitymanager = entitymanagerfactory.createEntityManager();    //created object of entity manager
			transaction = entitymanager.getTransaction();             
			transaction.begin();
			entitymanager.persist(s);
			System.out.println("Record saved.....");
			transaction.commit();
			
	}catch (Exception e) {
		transaction.rollback();
		e.printStackTrace();
	}
	entitymanager.close();

	}
	}



