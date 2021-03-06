package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class AppelsOffres implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id_appelOffre;
	
	private String titre;
	
	private String description;
	
	private String Raison_Social;
	
	private Long effectif;
	
	private String fonction;
	
	private Date date_depot;
	
	private Date date_fin;
	
	@ManyToOne
	@JoinColumn(name="id_infrastrecture")
	private Infrastrecture infrastrecture;
	
	@ManyToOne
	@JoinColumn(name="id_logiciels")
	private Logiciels logiciel;

	@ManyToOne
	@JoinColumn(name="id_service")
	private Services services;
	
	@ManyToOne
	@JoinColumn(name="id_prestataire")
	private prestataires prestataires;
	
	@OneToOne(mappedBy = "appelsOffres")
	private cahier_charge cahier_charge;
	
	public AppelsOffres() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AppelsOffres(Long id_prestataire, String nom, String description, String raison_Social, Long effectif,
			String fonction, Date date_depot, Date date_fin) {
		super();
		this.id_appelOffre = id_prestataire;
		this.titre=nom;
		this.description = description;
		Raison_Social = raison_Social;
		this.effectif = effectif;
		this.fonction = fonction;
		this.date_depot = date_depot;
		this.date_fin = date_fin;
	}


	public Long getId_appelOffre() {
		return id_appelOffre;
	}
	public void setId_appelOffre(Long id_prestataire) {
		this.id_appelOffre = id_prestataire;
	}
	
	public String getTitre() {
		return titre;
	}


	public void setTitre(String nom) {
		this.titre = nom;
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
