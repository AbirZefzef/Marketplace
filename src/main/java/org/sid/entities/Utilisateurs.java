package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateurs implements Serializable{
	@Id
	@GeneratedValue
	private Long idUtilisateur;

	public Utilisateurs(String nom, String prenom, String mail, String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.photo = photo;
	}

	public Utilisateurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nom;

	private String prenom;

	private String mail;

	private String photo;

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
