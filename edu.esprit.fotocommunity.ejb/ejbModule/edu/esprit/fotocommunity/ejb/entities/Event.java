package edu.esprit.fotocommunity.ejb.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity(name="tab_events")

public class Event implements Serializable {

	   
	@Id
	private Integer ID;
	private String PLACE;
	private String HOUR;
	private String TOPIC;
	private Integer NbSpeakers;
	private Integer NbPlaces;
	@ManyToOne
	private Professional organizer;
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
	public String getHOUR() {
		return this.HOUR;
	}

	public void setHOUR(String HOUR) {
		this.HOUR = HOUR;
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
