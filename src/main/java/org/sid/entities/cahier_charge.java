package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class cahier_charge implements Serializable{

	@Id
	@GeneratedValue
	private Long id_CahierCharge;
	
	@ManyToOne
	@JoinColumn(name="id_prestataire")
	private prestataires prestataires;
	
	@OneToOne
	@JoinColumn(name = "id_appelOffre")
	private AppelsOffres appelsOffres;
	   
	   

	public cahier_charge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cahier_charge(Long id_CahierCharge) {
		super();
		this.id_CahierCharge = id_CahierCharge;
	}

	public Long getId_CahierCharge() {
		return id_CahierCharge;
	}

	public void setId_CahierCharge(Long id_CahierCharge) {
		this.id_CahierCharge = id_CahierCharge;
	}
	
	
}
