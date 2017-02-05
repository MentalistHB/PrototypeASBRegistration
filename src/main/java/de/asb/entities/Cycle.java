package de.asb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cycle implements Serializable {

	@Id
	private String intitule;
	private String description;
	public Cycle() {
		super();
	}
	public Cycle(String intitule, String description) {
		super();
		this.intitule = intitule;
		this.description = description;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
