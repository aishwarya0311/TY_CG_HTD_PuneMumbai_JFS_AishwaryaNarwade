package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subject;

public class Read {

	public static void main(String[] args) {
		
			
				EntityManagerFactory entitymanagerfactory = Persistence. createEntityManagerFactory("demo");
				EntityManager entitymanager = entitymanagerfactory.createEntityManager();
				
				Subject data = entitymanager.find(Subject.class, 5);
				System.out.println("Id is----->" +data.getId());
				System.out.println("Name is -----> "+ data.getName());
				System.out.println("Difficulty is ----> " +data.getDifficult());
							
			}  //end of main method

		} //end of class


