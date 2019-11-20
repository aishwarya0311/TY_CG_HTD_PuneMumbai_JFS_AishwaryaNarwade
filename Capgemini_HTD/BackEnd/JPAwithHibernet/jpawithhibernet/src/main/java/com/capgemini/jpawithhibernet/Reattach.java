
package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capg.jpawithhibernate.dto.Movie;

public class Reattach {

	public static void main(String[] args) {

		Movie movies= new Movie();
		EntityTransaction transaction=null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie data = entityManager.find(Movie.class,1);
			System.out.println(movies.getId());
			System.out.println(entityManager.contains(data));
			entityManager.detach(data);
			System.out.println(entityManager.contains(data));
			Movie data1 = entityManager.merge(data);                    //merge method is used to re-attach the detach object
			data1.setName("Taare Zameen Par");
			transaction.commit();                                      //it reflects into the database
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();	
	}//end of main

}//end of class
