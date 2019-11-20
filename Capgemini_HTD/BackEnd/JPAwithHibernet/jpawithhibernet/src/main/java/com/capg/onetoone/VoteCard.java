package com.capg.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "VoteCard")

public class VoteCard {
	@Id
	@Column
	private int voter_id;
	
	@Column
	private String address;
	@OneToOne(mappedBy = "VoteCard")      //for bidirectional we use mapped by 
	
	private Person p ;
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public int getVoter_id() {
		return voter_id;
	}
	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
