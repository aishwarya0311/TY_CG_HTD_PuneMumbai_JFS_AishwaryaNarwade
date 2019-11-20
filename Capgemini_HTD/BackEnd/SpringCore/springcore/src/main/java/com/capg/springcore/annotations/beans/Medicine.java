package com.capg.springcore.annotations.beans;

//import java.util.List;
import java.util.Set;

public class Medicine {
	private String name;
	private String type;
	private double price;
	// private List<String> drugs;
	private Set<String> drugset;

  	// getters and setters    it can have duplicate values
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<String> getDrugset() {
		return drugset;
	}

	public void setDrugset(Set<String> drugset) {
		this.drugset = drugset;
	}

	/*
	 * public List<String> getDrugs() { return drugs; }
	 * 
	 * public void setDrugs(List<String> drugs) { this.drugs = drugs; }
	 */

}//end of class
