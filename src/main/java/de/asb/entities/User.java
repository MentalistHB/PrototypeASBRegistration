package de.asb.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable {
	@Id
	@NotNull
    @Size(min=2, max=30)
	private String username;
	private String password;
	private String nom;
	private String prenom;
	private String poste;
	private Date dateNaiss;
	private Date dateEnreg;
	@ManyToMany
	@JoinTable(name="User_Filiere_SemestreAcademique")
	private List<Filiere> filiere;
	@ManyToMany
	@JoinTable(name="User_Filiere_SemestreAcademique")
	private List<SemestreAcademique> semestreAca;
	@OneToMany
	private List<Paiement> paiement;
	private boolean actif;
	private String photo;
	@ManyToMany
	@JoinTable(name="users_roles")
	private List<Role> roles;
	
	public User() {
		super();
	}
	
	public User(String username, String nom, String prenom, Date dateNaiss, Date dateEnreg, List<Filiere> filiere,
			List<SemestreAcademique> semestreAca, List<Paiement> paiement, boolean actif, String photo,
			List<Role> roles) {
		super();
		this.username = username;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.dateEnreg = dateEnreg;
		this.filiere = filiere;
		this.semestreAca = semestreAca;
		this.paiement = paiement;
		this.actif = actif;
		this.photo = photo;
		this.roles = roles;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public Date getDateEnreg() {
		return dateEnreg;
	}
	public void setDateEnreg(Date dateEnreg) {
		this.dateEnreg = dateEnreg;
	}
	public List<Filiere> getFiliere() {
		return filiere;
	}
	public void setFiliere(List<Filiere> filiere) {
		this.filiere = filiere;
	}
	public List<SemestreAcademique> getSemestreAca() {
		return semestreAca;
	}
	public void setSemestreAca(List<SemestreAcademique> semestreAca) {
		this.semestreAca = semestreAca;
	}
	public List<Paiement> getPaiement() {
		return paiement;
	}
	public void setPaiement(List<Paiement> paiement) {
		this.paiement = paiement;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
