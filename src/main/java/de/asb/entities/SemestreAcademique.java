package de.asb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SemestreAcademique implements Serializable {

	@Id
	private String idSemestreAca;
	@ManyToMany
	private List<Cycle> cycle;
	@ManyToMany
	private List<Semestre> semestre;
	
	public SemestreAcademique() {
		super();
	}

	public SemestreAcademique(String idSemestreAca, List<Cycle> cycle, List<Semestre> semestre) {
		super();
		this.idSemestreAca = idSemestreAca;
		this.cycle = cycle;
		this.semestre = semestre;
	}

	public String getIdSemestreAca() {
		return idSemestreAca;
	}

	public void setIdSemestreAca(String idSemestreAca) {
		this.idSemestreAca = idSemestreAca;
	}

	public List<Cycle> getCycle() {
		return cycle;
	}

	public void setCycle(List<Cycle> cycle) {
		this.cycle = cycle;
	}

	public List<Semestre> getSemestre() {
		return semestre;
	}

	public void setSemestre(List<Semestre> semestre) {
		this.semestre = semestre;
	}
	
	
	
}
