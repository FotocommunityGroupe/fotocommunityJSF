package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;


import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Event;

/**
 * Session Bean implementation class EventsMgm
 */
@Stateless
public class EventsMgm implements EventsMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public EventsMgm() {
        // TODO Auto-generated constructor stub
    	
    }

	@Override
	public void addEvent(Event e) {
		// TODO Auto-generated method stub
		em.persist(e);
		
	}

	@Override
	public void deleteEvent(Event e) {
		// TODO Auto-generated method stub
	em.remove(em.find(Event.class, e.getID()));	
	}

	@Override
	public Event findEvent(int IdEvent) {
		// TODO Auto-generated method stub
		return em.find(Event.class, IdEvent);
	}

	@Override
	public List<Event> findAllEvent() {
		// TODO Auto-generated method stub
		return (List<Event>)em.createNamedQuery("ListOfEvents").getResultList();
	}

}
