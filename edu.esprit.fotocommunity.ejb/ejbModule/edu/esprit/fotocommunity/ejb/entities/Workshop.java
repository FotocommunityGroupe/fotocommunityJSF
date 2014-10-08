package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

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
	private Date date;
	
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
	@Temporal(TemporalType.TIME)   
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
