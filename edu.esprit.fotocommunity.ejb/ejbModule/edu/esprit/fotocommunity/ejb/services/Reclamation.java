package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Comment;
import edu.esprit.fotocommunity.ejb.entities.Event;
import edu.esprit.fotocommunity.ejb.entities.Photo;

/**
 * Session Bean implementation class Reclamation
 */
@Stateless
public class Reclamation implements ReclamationRemote {

    /**
     * Default constructor. 
     */
	
	
	@PersistenceContext
	EntityManager em;

    public Reclamation() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addComplaint(
			edu.esprit.fotocommunity.ejb.entities.Reclamation rec) {

		em.persist(rec);
		
		
	}

	@Override
	public void deleteComplaint(
			edu.esprit.fotocommunity.ejb.entities.Reclamation rec) {
		em.remove(em.find(Event.class, rec.getIdReclamation()));	
		
	}



	@Override
	public List<edu.esprit.fotocommunity.ejb.entities.Reclamation> findAllReclamation() {
		return (List<edu.esprit.fotocommunity.ejb.entities.Reclamation>)em.createNamedQuery("ListOfComplaints").getResultList();
	}

	@Override
	public edu.esprit.fotocommunity.ejb.entities.Reclamation findReclamation(
			int IdReclamation) {
		// TODO Auto-generated method stub
		return null;
	}

}


