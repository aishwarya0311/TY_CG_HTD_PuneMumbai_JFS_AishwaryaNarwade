package com.capgemini.jpaassignment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="subject")

public class Subject {
	@Id
	@Column
private int id;
	@Column
private String name;
	@Column
private String difficult;
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
public String getDifficult() {
	return difficult;
}
public void setDifficult(String difficult) {
	this.difficult = difficult;
}

}
