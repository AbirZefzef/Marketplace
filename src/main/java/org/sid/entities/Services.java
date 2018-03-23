package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.OneToMany;

public class Services implements Serializable{

	private Long id_service;
	
	private String nom;

	@OneToMany(mappedBy="Appels_offres")
	List<Appels_offres> appels_offres;
	
	
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(Long id_service, String nom) {
		super();
		this.id_service = id_service;
		this.nom = nom;
	}

	public Long getId_service() {
		return id_service;
	}

	public void setId_service(Long id_service) {
		this.id_service = id_service;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
