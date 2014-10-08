package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Workshop
 *
 */
@Entity(name="tab_workshops")

public class Workshop implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String SUBJECT;
	private String PLACE;
	private String DATE;
	private String HOUR;
	@ManyToOne
	private Professional leader;
	private String DESCRIPTION;
	private static final long serialVersionUID = 1L;

	public Workshop() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getSUBJECT() {
		return this.SUBJECT;
	}

	public void setSUBJECT(String SUBJECT) {
		this.SUBJECT = SUBJECT;
	}   
	public String getPLACE() {
		return this.PLACE;
	}

	public void setPLACE(String PLACE) {
		this.PLACE = PLACE;
	}   
	public String getDATE() {
		return this.DATE;
	}

	public void setDATE(String DATE) {
		this.DATE = DATE;
	}   
	public String getHOUR() {
		return this.HOUR;
	}

	public void setHOUR(String HOUR) {
		this.HOUR = HOUR;
	}   
	public Professional getLEADER() {
		return this.leader;
	}

	public void setLEADER(Professional LEADER) {
		this.leader = LEADER;
	}   
	public String getDESCRIPTION() {
		return this.DESCRIPTION;
	}

	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}
   
}
