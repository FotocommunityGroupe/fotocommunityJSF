package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TeamWorkMember
 *
 */
@Entity(name="tab_team_work_members")
@DiscriminatorValue(value="Amator")

public class Amator implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String NAME;
	private String EMAIL;
	private Integer NbPhotos;
	private String username;
	private String password;
	private Date dateNaiss;
	private String SEXE;
	@OneToMany(mappedBy = "amateur" )
	private List<Photo> photos=new ArrayList<Photo>();
	@OneToMany(mappedBy = "amateur" )
	private List<Reclamation> reclam=new ArrayList<Reclamation>();
	private static final long serialVersionUID = 1L;

	public Amator() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
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
	public Integer getNbPhotos() {
		return this.NbPhotos;
	}

	public void setNbPhotos(Integer NbPhotos) {
		this.NbPhotos = NbPhotos;
	}   
	
	@Temporal(TemporalType.DATE)
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getSEXE() {
		return this.SEXE;
	}

	public void setSEXE(String SEXE) {
		this.SEXE = SEXE;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}   
   
}
