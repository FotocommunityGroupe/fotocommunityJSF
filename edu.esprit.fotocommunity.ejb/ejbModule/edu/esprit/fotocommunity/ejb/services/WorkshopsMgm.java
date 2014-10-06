package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Workshop;

/**
 * Session Bean implementation class WorkshopsMgm
 */
@Stateless
public class WorkshopsMgm implements WorkshopsMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public WorkshopsMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addWorkshop(Workshop w) {
		// TODO Auto-generated method stub
		em.persist(w);
		
	}

	@Override
	public void deleteWorkshop(Workshop w) {
		// TODO Auto-generated method stub
		em.remove(em.find(Workshop.class, w.getID()));
	}

	@Override
	public Workshop findWorkshop(int IdWorkshop) {
		// TODO Auto-generated method stub
		return em.find(Workshop.class, IdWorkshop);
	}

	@Override
	public List<Workshop> findAllWorkshops() {
		// TODO Auto-generated method stub
		return (List<Workshop>)em.createNamedQuery("ListOfWorkshop").getResultList();
	}

}
