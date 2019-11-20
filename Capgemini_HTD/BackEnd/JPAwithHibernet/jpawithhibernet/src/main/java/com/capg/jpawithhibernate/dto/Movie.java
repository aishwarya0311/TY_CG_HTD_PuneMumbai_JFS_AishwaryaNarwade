package com.capg.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                                //mapping the class  
@Table (name= "movie")                 //mapping the table name with class

public class Movie {
	@Id                                //id is primary key 
	@Column                          //mapping the id column with id variable
	@GeneratedValue(strategy= GenerationType.AUTO)  //generate primary key automatically no need to give setter getter method
	private int id;
	
	@Column                          //if the variable name is not same as column name we can explicitly map them by @column(name="name")
	private String name;
	
	@Column                           //mapping the rating column name  with rating variable              
	private String rating;
	
	//getter setter methods of all variables
	
	public int getId() {    
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

}
