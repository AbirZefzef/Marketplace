package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.OneToMany;

public class Infrastrecture implements Serializable{
	
	

	private Long id_infrastrecture;

	private String nom;
	
	@OneToMany(mappedBy="Appels_offres")
	List<Appels_offres> appels_offres;
	
	public Infrastrecture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Infrastrecture(Long id_infrastrecture, String nom) {
		super();
		this.id_infrastrecture = id_infrastrecture;
		this.nom = nom;
	}



	public Long getId_infrastrecture() {
		return id_infrastrecture;
	}

	public void setId_infrastrecture(Long id_infrastrecture) {
		this.id_infrastrecture = id_infrastrecture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
