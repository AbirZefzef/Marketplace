package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Services implements Serializable{

	@Id
	@GeneratedValue
	private Long id_service;
	
	private String nom;

	@OneToMany(mappedBy="services")
	List<AppelsOffres> appelsOffres;
	
	
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
