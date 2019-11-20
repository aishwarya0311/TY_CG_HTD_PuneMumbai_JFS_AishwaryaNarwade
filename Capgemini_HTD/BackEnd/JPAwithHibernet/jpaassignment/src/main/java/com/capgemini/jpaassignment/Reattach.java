package com.capgemini.jpaassignment;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subject;

public class Reattach {

	public static void main(String[] args) {

		Subject movies= new Subject();
		EntityTransaction transaction=null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Subject data = entityManager.find(Subject.class,4);
			System.out.println(movies.getId());
			System.out.println(entityManager.contains(data));
			entityManager.detach(data);
			System.out.println(entityManager.contains(data));
			Subject data1 = entityManager.merge(data);                    //merge method is used to re-attach the detach object
			data1.setName("Economics");
			transaction.commit();                                      //it reflects into the database
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();	
	}//end of main

}//end of class

