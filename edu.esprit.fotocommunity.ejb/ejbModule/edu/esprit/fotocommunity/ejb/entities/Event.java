package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity
@NamedQuery(name="ListOfEvents", query="select a from Event a")
@Table(name="tab_events")
public class Event implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String Xpos;
	 public String getXpos() {
		return Xpos;
	}
	public void setXpos(String xpos) {
		Xpos = xpos;
	}
	private String Ypos;
	
	public String getYpos() {
		return Ypos;
	}
	public void setYpos(String ypos) {
		Ypos = ypos;
	}
	private String PLACE;
	private Date DATE;
	//private String STATUT;
	private String TOPIC;
	private Integer NbSpeakers;
	private Integer NbPlaces;
	@ManyToOne
	private Professional organizer;
	public Professional getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Professional organizer) {
		this.organizer = organizer;
	}
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	public String getPLACE() {
		return this.PLACE;
	}

	public void setPLACE(String PLACE) {
		this.PLACE = PLACE;
	}   
	  @Temporal(TemporalType.TIME)
	public Date getDate() {
		return DATE;
	}
	public void setDate(Date date) {
		this.DATE = date;
	}
	public String getTOPIC() {
		return this.TOPIC;
	}

	public void setTOPIC(String TOPIC) {
		this.TOPIC = TOPIC;
	}   
	public Integer getNbSpeakers() {
		return this.NbSpeakers;
	}

	public void setNbSpeakers(Integer NbSpeakers) {
		this.NbSpeakers = NbSpeakers;
	}   
	public Integer getNbPlaces() {
		return this.NbPlaces;
	}

	public void setNbPlaces(Integer NbPlaces) {
		this.NbPlaces = NbPlaces;
	}
	
   
}
