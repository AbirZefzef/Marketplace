package org.sid.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Message implements Serializable{

	@Id
	@GeneratedValue
    private Long id_Message;
    
    private String texte;
    private Date Date_message;


    
    public Message() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Message(Long id_Message, String texte, Date Date_message) {
        super();
        this.id_Message = id_Message;
        this.texte = texte;
        this.Date_message=Date_message;
    }

    public Long getId_Message() {
        return id_Message;
    }

    public void setId_Message(Long id_Message) {
        this.id_Message = id_Message;
    }

    public String gettexte() {
        return texte;
    }

    public void settexte(String texte) {
        this.texte = texte;
    }
    
    public Date getDate_message() {
        return Date_message;
    }

    public void setDate_message(Date Date_message) {
        this.Date_message = Date_message;
    }
    
}