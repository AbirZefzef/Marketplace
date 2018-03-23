package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Administrateurs implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id_admin;

	private String login;
	
	private String mtp;
	
	
	
	
	public Administrateurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateurs(Long id_admin, String login, String mtp) {
		super();
		this.id_admin = id_admin;
		this.login = login;
		this.mtp = mtp;
	}

	public Long getId_admin() {
		return id_admin;
	}

	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMtp() {
		return mtp;
	}

	public void setMtp(String mtp) {
		this.mtp = mtp;
	}
	
	
	

}
