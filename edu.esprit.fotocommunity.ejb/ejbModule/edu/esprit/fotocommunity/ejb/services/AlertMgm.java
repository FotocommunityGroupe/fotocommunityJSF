package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Alert;
import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;

/**
 * Session Bean implementation class AlertMgm
 */
@Stateless
public class AlertMgm implements AlertMgmRemote {

    /**
     * Default constructor. 
     */
	
	
	@PersistenceContext
	EntityManager em;

    public AlertMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addAlert(Alert al) {
		
		em.persist(al);
		
		
	}

	@Override
	public void deleteAlert(Alert al) {
		em.remove(em.find(Alert.class, al.getIdAlert()));
	}

	@Override
	public List<Alert> findAllAlert() {
		return (List<Alert>)em.createNamedQuery("alerts").getResultList();

	}

	@Override
	public Alert findAlert(int IdAlert) {
		return em.find(Alert.class, IdAlert);
	}

}
