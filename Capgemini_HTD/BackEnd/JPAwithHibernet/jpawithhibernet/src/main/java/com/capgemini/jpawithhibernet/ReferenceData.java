
package com.capgemini.jpawithhibernet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class ReferenceData {
		
		public static void main(String[] args) {
		
			EntityManagerFactory entitymanagerfactory = Persistence. createEntityManagerFactory("test");
			EntityManager entitymanager = entitymanagerfactory.createEntityManager();
			
			//Movie data = entitymanager.find(Movie.class, 2);
			Movie getData= entitymanager.getReference(Movie.class,2);    
			System.out.println("Id is----->" +getData.getId());
			System.out.println("Name is -----> "+ getData.getName());
			System.out.println("Rating is ----> " +getData.getRating());
						
		}  //end of main method

	} //end of class
