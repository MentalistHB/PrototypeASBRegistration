package de.asb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Filiere implements Serializable {

	@Id
	private String intitule;
	private String description;
	
	public Filiere() {
		super();
	}
	
	public Filiere(String intitule, String description) {
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
