package org.sid.entities;

import java.io.Serializable;

public class prestataires implements Serializable{
	
	

	private Long id_prestataire;
	
	private String nom;
	
	private String prenom;
	
	private String Email;
	
	private Long num_tel;
	
	private String num_societe;
	
	private String mtp_pres;

	
	public prestataires() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public prestataires(Long id_utilisateur, String nom, String prenom, String email, Long num_tel, String num_societe,
			String mtp_pres) {
		super();
		this.id_prestataire = id_utilisateur;
		this.nom = nom;
		this.prenom = prenom;
		Email = email;
		this.num_tel = num_tel;
		this.num_societe = num_societe;
		this.mtp_pres = mtp_pres;
	}

	
	public Long getId_prestataire() {
		return id_prestataire;
	}

	
	public void setId_prestataire(Long id_utilisateur) {
		this.id_prestataire = id_utilisateur;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(Long num_tel) {
		this.num_tel = num_tel;
	}

	public String getNum_societe() {
		return num_societe;
	}

	public void setNum_societe(String num_societe) {
		this.num_societe = num_societe;
	}

	public String getMtp_pres() {
		return mtp_pres;
	}

	public void setMtp_pres(String mtp_pres) {
		this.mtp_pres = mtp_pres;
	}
	
	
	

}
