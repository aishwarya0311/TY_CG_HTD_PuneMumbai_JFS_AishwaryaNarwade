package com.capgemini.jpawithhibernet;	 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class DeleteDemo {

	public static void main(String[] args) {

		Movie movies= new Movie();
		movies.setId(5);
		movies.setName("ROBOT");
		movies.setRating("v.good");
		EntityTransaction transaction=null;
		EntityManager entityManager=null;


		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie data = entityManager.find(Movie.class,4);
			entityManager.remove(data);

			System.out.println("Record deleted.....");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
