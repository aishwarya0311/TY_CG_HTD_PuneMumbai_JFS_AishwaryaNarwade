package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.onetoone.Person;
import com.capg.onetoone.VoteCard;


public class TestOnetoOne {

	public static void main(String[] args) {
		Person person= new Person();
		person.setPid(1);
		person.setName("Divya");

		VoteCard vc= new VoteCard();
		vc.setVoter_id(1234);
		vc.setAddress("Srinagar");
	//	person.setVotercard(vc);
		

		EntityManagerFactory entityManagerFactory= null;
		EntityManager entityManager= null;
		EntityTransaction transaction= null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();    //created object of entity manager
			transaction = entityManager.getTransaction();              //
			transaction.begin();
			//entityManager.persist(person);
			
			VoteCard cardDetail= entityManager.find(VoteCard.class, 1);
			cardDetail.getAddress();
			cardDetail.getP().getName();
			cardDetail.getVoter_id();
			System.out.println("Record saved.....");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();

	}

}
