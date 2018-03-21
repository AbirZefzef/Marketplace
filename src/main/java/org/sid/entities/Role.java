package org.sid.entities;

import java.io.Serializable;

public class Role implements Serializable{
	
	


	private Long id_role;
	
	private String nom_role;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Role(Long id_role, String nom_role) {
		super();
		this.id_role = id_role;
		this.nom_role = nom_role;
	}
	
	public Long getId_role() {
		return id_role;
	}

	public void setId_role(Long id_role) {
		this.id_role = id_role;
	}

	public String getNom_role() {
		return nom_role;
	}

	public void setNom_role(String nom_role) {
		this.nom_role = nom_role;
	}
	
	

}
