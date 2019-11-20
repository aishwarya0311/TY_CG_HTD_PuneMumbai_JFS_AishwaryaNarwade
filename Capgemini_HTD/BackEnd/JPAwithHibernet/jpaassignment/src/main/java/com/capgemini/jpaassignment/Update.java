package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subject;


public class Update {

	public static void main(String[] args) {

		Subject subject= new Subject();
		subject.setId(6);
		subject.setName("Geography");
		subject.setDifficult("avg");
		EntityTransaction transaction=null;
		EntityManager entityManager=null;


		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Subject data = entityManager.find(Subject.class, 6);
			data.setName("Geography");
			System.out.println("Record update.....");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}	
		
	}

}
