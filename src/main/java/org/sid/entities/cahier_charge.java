package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class cahier_charge implements Serializable{

	
	private Long id_CahierCharge;
	
	@OneToMany(mappedBy="Appels_offres")
	List<cahier_charge> cahier_charges;
	
	    @OneToOne
	    @JoinColumn(name = "id_appelOffre", nullable = false)
	    private Appels_offres appels_offres;
	   
	   

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
