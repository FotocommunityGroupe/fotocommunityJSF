package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Comment;
import edu.esprit.fotocommunity.ejb.entities.Event;
import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;

/**
 * Session Bean implementation class Reclamation
 */
@Stateless 
// asmaa ca cause pas de probleme fel jtable w business delegate ? 
// to nchofo
public class ReclamationMgm implements ReclamationRemote {

    /**
     * Default constructor. 
     */
	
	
	@PersistenceContext
	EntityManager em;

    public ReclamationMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addComplaint(
			Reclamation rec) {

		em.persist(rec);
		
		
	}// barra testi behii okoood hounni 

	@Override
	public void deleteComplaint(
			Reclamation rec) {
		
				em.remove(em.find(Reclamation.class, rec.getIdReclamation()));	
		
	}



	@Override
	public List<Reclamation> findAllReclamation() {
		
	
		return (List<Reclamation>)em.createNamedQuery("reclamations").getResultList();
	}
	
	@Override
	public Reclamation  findReclamation(
			int IdReclamation) {
 
		return em.find(Reclamation.class, IdReclamation);
	}
	


}


