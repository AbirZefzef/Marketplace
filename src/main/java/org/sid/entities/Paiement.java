package org.sid.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paiement implements Serializable{

	@Id
	@GeneratedValue
    private Long id_Paiement;
    
    private String Type_carte;
    private Date date_paiement;


    
    public Paiement() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Paiement(Long id_Paiement, String Type_carte, Date date_paiement) {
        super();
        this.id_Paiement = id_Paiement;
        this.Type_carte = Type_carte;
        this.date_paiement=date_paiement;
    }

    public Long getId_Paiement() {
        return id_Paiement;
    }

    public void setId_Paiement(Long id_Paiement) {
        this.id_Paiement = id_Paiement;
    }

    public String getType_carte() {
        return Type_carte;
    }

    public void setType_carte(String Type_carte) {
        this.Type_carte = Type_carte;
    }
    
    public Date getdate_paiement() {
        return date_paiement;
    }

    public void setdate_Paiement(Date date_paiement) {
        this.date_paiement = date_paiement;
    }
    
}