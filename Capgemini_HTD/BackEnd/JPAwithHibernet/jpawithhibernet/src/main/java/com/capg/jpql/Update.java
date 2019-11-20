package com.capg.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {

		EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("test");
		EntityManager entitymanager= entitymanagerfactory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		
		String jpql = "Update Movie set name = 'P.K' where id=3";
		transaction.begin();
		Query query = entitymanager.createQuery(jpql);
		int result = query.executeUpdate();
		System.out.println("Result ------>" +result);
		
		entitymanager.close();
		
	
		
	}

}
