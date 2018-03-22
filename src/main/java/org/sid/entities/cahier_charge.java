package org.sid.entities;

import java.io.Serializable;

public class cahier_charge implements Serializable{

	
	private Long id_CahierCharge;

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
