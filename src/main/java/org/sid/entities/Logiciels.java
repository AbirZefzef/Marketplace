package org.sid.entities;

import java.io.Serializable;

public class Logiciels implements Serializable{

	private Long id_logiciels;
	
	private String nom;

	
	public Logiciels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Logiciels(Long id_logiciels, String nom) {
		super();
		this.id_logiciels = id_logiciels;
		this.nom = nom;
	}

	public Long getId_logiciels() {
		return id_logiciels;
	}

	public void setId_logiciels(Long id_logiciels) {
		this.id_logiciels = id_logiciels;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
