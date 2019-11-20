package com.capg.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="boxid")
public class PencilBox {
	@Id
	@Column
	
	private static  int boxid;
	@Column
	private static  String colour;
	
	@OneToMany(mappedBy="PencilBox")
	 private List<Pencil> pencil; 
	
	public List<Pencil> getPencil() {
		return pencil;
	}
	
	public void setPencil(List<Pencil> pencil) {
		this.pencil=pencil;
	}
	public int getBoxid() {
		return boxid;
	}
	public static void setBoxid(int boxid) {
	PencilBox.boxid = boxid;
	}
	public String getColour() {
		return colour;
	}
	public static void setColour(String colour) {
		PencilBox.colour = colour;
	}
	
	

}
