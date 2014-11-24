package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.DemandePwd;
import edu.esprit.fotocommunity.ejb.entities.Event;

/**
 * Session Bean implementation class DemandePwd
 */
@Stateless
public class DmdPwd implements DmdPwdRemote {

    /**
     * Default constructor. 
     */
	
	
	@PersistenceContext
	EntityManager em;
	
    public DmdPwd() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addDemande(DemandePwd demande) {
		em.persist(demande);
		
	}

	

	@Override
	public List<DemandePwd> findAllDemande() {
		// TODO Auto-generated method stub
		return (List<DemandePwd>)em.createNamedQuery("findDemande").getResultList();
	}

	@Override
	public DemandePwd findDemande(int idDemande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDemande(DemandePwd demande) {
		em.merge(demande);
		
	}

	@Override
	public void deleteDemande(DemandePwd Demande) {
		em.remove(em.find(DmdPwd.class, Demande.getIdDemande()));
		
	}

}
