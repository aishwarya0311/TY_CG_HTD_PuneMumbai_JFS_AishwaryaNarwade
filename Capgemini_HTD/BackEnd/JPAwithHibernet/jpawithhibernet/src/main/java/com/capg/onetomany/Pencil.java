package com.capg.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="pencil")
public class Pencil {
@Id
@Column
	
	private int pid;
	private String name;
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "boxid", nullable= false)
	
	private PencilBox getPencilBox() {
		return getPencilBox();
	}
	public void setPencilBox(PencilBox pencilBox) {
	
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
