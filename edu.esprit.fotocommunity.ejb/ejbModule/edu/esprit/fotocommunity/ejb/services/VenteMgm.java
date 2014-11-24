package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.fotocommunity.ejb.entities.Vente;

/**
 * Session Bean implementation class VenteMgm
 */
@Stateless
public class VenteMgm implements VenteMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public VenteMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addVente(Vente v) {
	
		em.persist(v);
	}

	@Override
	public void deleteVente(Vente v) {
		// TODO Auto-generated method stub
		em.remove(em.find(Vente.class, v.getID()));
	}

	@Override
	public Vente findVente(int id) {
		// TODO Auto-generated method stub
		return em.find(Vente.class, id);
	}

	@Override
	public List<Vente> findAll() {
		// TODO Auto-generated method stub
		return (List<Vente>)em.createNamedQuery("listVente").getResultList();
	}
	@Override
	public List<Object[]> StatisticVente() {
		Query q = em.createQuery("select n.ID ,n from Vente n group by photo_ID");
		return q.getResultList();
	}
}
