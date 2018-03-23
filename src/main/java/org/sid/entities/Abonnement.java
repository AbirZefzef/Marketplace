package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Abonnement implements Serializable{
	
	
	@Id
	@GeneratedValue
	private Long id_abonnement;
	
	private String nom;
	
	private Long prix;
	
	private Date debut_abonnement;
	
	private Date fin_abonnement;
	
	@OneToMany(mappedBy="abonnement")
	List<prestataires> prestataires;
	
	

	public Abonnement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Abonnement(Long id_abonnement, String nom, Long prix, Date debut_abonnement, Date fin_abonnement) {
		super();
		this.id_abonnement = id_abonnement;
		this.nom = nom;
		this.prix = prix;
		this.debut_abonnement = debut_abonnement;
		this.fin_abonnement = fin_abonnement;
	}

	public Date getDebut_abonnement() {
		return debut_abonnement;
	}

	public void setDebut_abonnement(Date debut_abonnement) {
		this.debut_abonnement = debut_abonnement;
	}

	public Date getFin_abonnement() {
		return fin_abonnement;
	}

	public void setFin_abonnement(Date fin_abonnement) {
		this.fin_abonnement = fin_abonnement;
	}

	public Long getId_abonnement() {
		return id_abonnement;
	}

	public void setId_abonnement(Long id_abonnement) {
		this.id_abonnement = id_abonnement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getPrix() {
		return prix;
	}

	public void setPrix(Long prix) {
		this.prix = prix;
	}
	
	

}
