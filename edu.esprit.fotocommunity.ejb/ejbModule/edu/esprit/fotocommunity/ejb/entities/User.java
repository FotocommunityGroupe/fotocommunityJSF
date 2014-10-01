package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity(name="tab_users")

public class User implements Serializable {

	   
	@Id
	private Integer ID_USER;
	// un utilisateur peut acheter plusieurs photos et une photo peut etre achetée par un ou plusieurs users
	private String NAME;
	private String EMAIL;
	private String USER_NAME;
	private Integer AGE;
	private String SEXE;
	private String CARD_NUMBER;
	private Integer NB_PURCHACED_PHOTOS;
	private String TYPE_ACCOUNT;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public Integer getID_USER() {
		return this.ID_USER;
	}

	public void setID_USER(Integer ID_USER) {
		this.ID_USER = ID_USER;
	}   
	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}   
	public String getEMAIL() {
		return this.EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}   
	public String getUSER_NAME() {
		return this.USER_NAME;
	}

	public void setUSER_NAME(String USER_NAME) {
		this.USER_NAME = USER_NAME;
	}   
	public Integer getAGE() {
		return this.AGE;
	}

	public void setAGE(Integer AGE) {
		this.AGE = AGE;
	}   
	public String getSEXE() {
		return this.SEXE;
	}

	public void setSEXE(String SEXE) {
		this.SEXE = SEXE;
	}   
	public String getCARD_NUMBER() {
		return this.CARD_NUMBER;
	}

	public void setCARD_NUMBER(String CARD_NUMBER) {
		this.CARD_NUMBER = CARD_NUMBER;
	}   
	public Integer getNB_PURCHACED_PHOTOS() {
		return this.NB_PURCHACED_PHOTOS;
	}

	public void setNB_PURCHACED_PHOTOS(Integer NB_PURCHACED_PHOTOS) {
		this.NB_PURCHACED_PHOTOS = NB_PURCHACED_PHOTOS;
	}   
	public String getTYPE_ACCOUNT() {
		return this.TYPE_ACCOUNT;
	}

	public void setTYPE_ACCOUNT(String TYPE_ACCOUNT) {
		this.TYPE_ACCOUNT = TYPE_ACCOUNT;
	}
   
}
