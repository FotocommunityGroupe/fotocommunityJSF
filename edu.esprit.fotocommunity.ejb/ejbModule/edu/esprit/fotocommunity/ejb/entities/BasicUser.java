package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity(name="tab_users")

public class BasicUser implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_USER;
	// un utilisateur peut acheter plusieurs photos et une photo peut etre achetée par un ou plusieurs users
	private String NAME;
	private String EMAIL;
	private String USER_NAME;
	private String password;
	private Date DateDeNaissance;
	private String SEXE;
	@OneToMany(mappedBy = "user")
	private List<Comment> comments=new ArrayList<Comment>();
	@OneToMany(mappedBy ="User")
	private List<Reclamation> reclamations=new ArrayList<Reclamation>();
	private static final long serialVersionUID = 1L;

	public BasicUser() {
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
	
	@Temporal(TemporalType.DATE)
	public Date getDateDeNaissance() {
		return DateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		DateDeNaissance = dateDeNaissance;
	}
	public String getSEXE() {
		return this.SEXE;
	}

	public void setSEXE(String SEXE) {
		this.SEXE = SEXE;
	}    
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   
}
