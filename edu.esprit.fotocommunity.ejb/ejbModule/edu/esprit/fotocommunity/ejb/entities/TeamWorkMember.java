package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TeamWorkMember
 *
 */
@Entity(name="tab_team_work_members")

public class TeamWorkMember implements Serializable {

	   
	@Id
	private Integer ID;
	private String NAME;
	private String EMAIL;
	private Integer NbPhotos;
	private String WorkType;
	private Integer AGE;
	private String SEXE;
	private static final long serialVersionUID = 1L;

	public TeamWorkMember() {
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
	public String getWorkType() {
		return this.WorkType;
	}

	public void setWorkType(String WorkType) {
		this.WorkType = WorkType;
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
   
}
