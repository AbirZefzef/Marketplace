package org.sid.entities;

import java.io.Serializable;

public class Administrateurs implements Serializable{
	
	
	public Administrateurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateurs(String login, String mtp) {
		super();
		this.login = login;
		this.mtp = mtp;
	}

	private String login;
	
	private String mtp;

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
