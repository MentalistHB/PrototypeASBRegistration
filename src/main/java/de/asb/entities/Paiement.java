package de.asb.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paiement implements Serializable {

	@Id
	private Date datePaiement;
	private double montant;
	private String beleg;
	public Paiement() {
		super();
	}
	public Paiement(Date datePaiement, double montant, String beleg) {
		super();
		this.datePaiement = datePaiement;
		this.montant = montant;
		this.beleg = beleg;
	}
	public Date getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getBeleg() {
		return beleg;
	}
	public void setBeleg(String beleg) {
		this.beleg = beleg;
	}
	
}
