package de.asb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Semestre implements Serializable {

	@Id
	private int semestre;
	private String intitule;
}
