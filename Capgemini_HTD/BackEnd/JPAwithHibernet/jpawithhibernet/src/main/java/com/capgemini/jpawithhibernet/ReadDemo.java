package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.jpawithhibernate.dto.Movie;

public class ReadDemo {
	
	public static void main(String[] args) {
	
		EntityManagerFactory entitymanagerfactory = Persistence. createEntityManagerFactory("test");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		Movie data = entitymanager.find(Movie.class, 2);
		System.out.println("Id is----->" +data.getId());
		System.out.println("Name is -----> "+ data.getName());
		System.out.println("Rating is ----> " +data.getRating());
					
	}  //end of main method

} //end of class
