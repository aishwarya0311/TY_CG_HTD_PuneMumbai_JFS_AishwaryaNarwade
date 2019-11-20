package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capg.onetomany.PencilBox;


public class TestPencil {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= null;
		EntityTransaction transaction= null;
		EntityManager entityManager= null;
		
		
		PencilBox pencilbox = new PencilBox();
		PencilBox.setBoxid(1);
		PencilBox.setColour("black");

		PencilBox pb= new PencilBox();
		pb.setBoxid(1);
		pb.setColour("red");
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();    //created object of entity manager
			 transaction = entityManager.getTransaction();              //
			transaction.begin();

			System.out.println("Record saved.....");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			 transaction.rollback();
		}	
entityManager.close();
	}

}
