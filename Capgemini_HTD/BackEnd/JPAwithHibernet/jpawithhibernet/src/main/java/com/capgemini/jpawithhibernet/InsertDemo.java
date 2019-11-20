package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class InsertDemo {

	public static void main(String[] args) {

		Movie movies= new Movie();
		movies.setId(6);
		movies.setName("Hungama");
		movies.setRating("good");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();    //created objet of entity manager
		EntityTransaction transaction = entityManager.getTransaction();              //
		transaction.begin();
		entityManager.persist(movies);
		System.out.println("Record saved.....");
		 transaction.commit();
		
	}

}

