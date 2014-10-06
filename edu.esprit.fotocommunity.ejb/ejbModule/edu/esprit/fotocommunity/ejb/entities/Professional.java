package edu.esprit.fotocommunity.ejb.entities;

import edu.esprit.fotocommunity.ejb.entities.Amator;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Professional
 *
 */
@Entity

public class Professional extends Amator implements Serializable {

	
	private Integer NbEvents;
	private Integer NbWorkshops;
	private String RIB;
	@OneToMany(mappedBy ="leader")
	private List<Workshop> listWorkshop=new ArrayList<Workshop>();
	@OneToMany(mappedBy ="organizer")
	private List<Event> listEvent=new ArrayList<Event>();
	private static final long serialVersionUID = 1L;

	public Professional() {
		super();
		NbWorkshops=listWorkshop.size();
		NbEvents=listEvent.size();
	}   
 
	public String getRIB() {
		return this.RIB;
	}

	public void setRIB(String RIB) {
		this.RIB = RIB;
	}
	public Integer getNbEvents() {
		return listEvent.size();
	}
	public void setNbEvents(Integer nbEvents) {
		NbEvents = nbEvents;
	}
	public Integer getNbWorshops() {
		
		return listWorkshop.size();
	}
	public void setNbWorshops(Integer nbWorshops) {
		this.NbWorkshops = nbWorshops;
	}
   
}
