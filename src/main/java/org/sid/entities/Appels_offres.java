package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

public class Appels_offres implements Serializable{
	
	private Long id_prestataire;
	private String nom;
	private String description;
	private String Raison_Social;
	private Long effectif;
	private String fonction;
	private Date date_depot;
	private Date date_fin;
	
	
	public Appels_offres() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Appels_offres(Long id_prestataire, String nom, String description, String raison_Social, Long effectif,
			String fonction, Date date_depot, Date date_fin) {
		super();
		this.id_prestataire = id_prestataire;
		this.nom = nom;
		this.description = description;
		Raison_Social = raison_Social;
		this.effectif = effectif;
		this.fonction = fonction;
		this.date_depot = date_depot;
		this.date_fin = date_fin;
	}


	public Long getId_prestataire() {
		return id_prestataire;
	}
	public void setId_prestataire(Long id_prestataire) {
		this.id_prestataire = id_prestataire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRaison_Social() {
		return Raison_Social;
	}
	public void setRaison_Social(String raison_Social) {
		Raison_Social = raison_Social;
	}
	public Long getEffectif() {
		return effectif;
	}
	public void setEffectif(Long effectif) {
		this.effectif = effectif;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public Date getDate_depot() {
		return date_depot;
	}
	public void setDate_depot(Date date_depot) {
		this.date_depot = date_depot;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	
	
	
}
