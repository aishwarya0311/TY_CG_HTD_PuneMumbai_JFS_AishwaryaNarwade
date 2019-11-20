package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subject;

public class Insert {
	public static void main(String [] args) {
		
		Subject subject = new Subject();
		subject.setId(7);
		subject.setName("History");
		subject.setDifficult("avg");
		
		EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("demo");
		EntityManager entitymanager= entitymanagerfactory.createEntityManager();
		EntityTransaction transaction= entitymanager.getTransaction();
		transaction.begin();
		entitymanager.persist(subject);
		System.out.println("Record saved.....");
		 transaction.commit();
		
		
	}  //end of main method

}  //end of class
