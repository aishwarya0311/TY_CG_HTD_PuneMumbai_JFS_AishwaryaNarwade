package com.capg.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class UpdateUsingDyanamicQury {

			public static void main(String[] args) {

				EntityManagerFactory entitymanagerfactory =Persistence.createEntityManagerFactory("test");
				EntityManager entitymanager= entitymanagerfactory.createEntityManager();
				EntityTransaction transaction = entitymanager.getTransaction();
				
				String jpql = "Update Movie set name =:ABCD2 where id =:mid";
				transaction.begin();
				Query query = entitymanager.createQuery(jpql);
				query.setParameter( "ABCD2","Golmaal");
				query.setParameter("mid", 3);
				int result = query.executeUpdate();
				transaction.commit();
				System.out.println("Result ------>" +result);
				entitymanager.close();
					
			}
}
