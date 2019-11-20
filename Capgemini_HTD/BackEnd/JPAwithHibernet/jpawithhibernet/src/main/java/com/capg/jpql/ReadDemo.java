package com.capg.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.jpawithhibernate.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entitymanagerfactory= Persistence.createEntityManagerFactory("test");
		EntityManager entitymanager= entitymanagerfactory.createEntityManager();
		String jpql="from Movie";
		Query query = entitymanager.createQuery(jpql);
		List <Movie> data = query.getResultList();
		for (Movie movie : data) {
			System.out.println(movie.getId());
			
		}
		entitymanager.close();
		
	}

}
