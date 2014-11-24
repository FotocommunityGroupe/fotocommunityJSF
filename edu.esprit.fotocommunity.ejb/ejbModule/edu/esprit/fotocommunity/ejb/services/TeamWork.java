package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Amator;

/**
 * Session Bean implementation class TeamWork
 */
@Stateless
public class TeamWork implements TeamWorkRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public TeamWork() {
       
    }

	@Override
	public void addMember(Amator a) {
		em.persist(a);
		
	}

	@Override
	public void deleteMember(Amator a) {
		em.remove(em.find(Amator.class, a.getID()));
		
	}

	@Override
	public void updateMember(Amator a) {
		em.merge(a);
		
	}

	@Override
	public Amator findById(int id) {
		return em.find(Amator.class, id);
	}

	@Override
	public List<Amator> findall() {
		
		return (List<Amator>)em.createNamedQuery("findAmators").getResultList();
	}

}
