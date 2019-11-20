package com.capgemini.jpaassignment;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subject;


public class Reference {

		public static void main(String[] args) {
		
			EntityManagerFactory entitymanagerfactory = Persistence. createEntityManagerFactory("demo");
			EntityManager entitymanager = entitymanagerfactory.createEntityManager();
			
			//Movie data = entitymanager.find(Movie.class, 2);
			Subject getData= entitymanager.getReference(Subject.class,2);    
			System.out.println("Id is----->" +getData.getId());
			System.out.println("Name is -----> "+ getData.getName());
			System.out.println("Difficulty is ----> " +getData.getDifficult());
						
		}  //end of main method

	} //end of class

