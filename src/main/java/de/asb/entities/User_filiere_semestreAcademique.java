package de.asb.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User_filiere_semestreAcademique implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private Date dateEnreg;
	@ManyToOne
	private User user;
	@ManyToOne
	private SemestreAcademique semestreAca;
	@ManyToOne
	private Filiere filiere;
	
	public User_filiere_semestreAcademique() {
		super();
	}
	
	public User_filiere_semestreAcademique(Date dateEnreg, User user, SemestreAcademique semestreAca, Filiere filiere) {
		super();
		this.dateEnreg = dateEnreg;
		this.user = user;
		this.semestreAca = semestreAca;
		this.filiere = filiere;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public SemestreAcademique getSemestreAca() {
		return semestreAca;
	}
	public void setSemestreAca(SemestreAcademique semestreAca) {
		this.semestreAca = semestreAca;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

}
