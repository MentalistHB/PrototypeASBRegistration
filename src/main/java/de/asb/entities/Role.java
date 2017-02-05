package de.asb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	@Id
	private String nom;
	private String descriotion;
	public Role() {
		super();
	}
	public Role(String nom, String descriotion) {
		super();
		this.nom = nom;
		this.descriotion = descriotion;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescriotion() {
		return descriotion;
	}
	public void setDescriotion(String descriotion) {
		this.descriotion = descriotion;
	}
	
	
}
