package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.BadWordList;



/**
 * Session Bean implementation class BadWordMgm
 */
@Stateless
public class BadWordMgm implements BadWordMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public BadWordMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addBadWordList(BadWordList word) {
		// TODO Auto-generated method stub
		em.persist(word);
	}

	@Override
	public void deleteBadWordList(BadWordList word) {
		// TODO Auto-generated method stub
		em.remove(em.find(BadWordList.class, word.getID()));
	}

	@Override
	public BadWordList findBadWordList(int ID) {
		// TODO Auto-generated method stub
		return em.find(BadWordList.class, ID);
		
	}

	@Override
	public void updateBadWordList(BadWordList word) {
		// TODO Auto-generated method stub
		em.merge(word);
	}

	@Override
	public List<BadWordList> findAllBadWordList() {
		// TODO Auto-generated method stub
		
		return (List<BadWordList>) em.createNamedQuery("badwordTest").getResultList();
	}

}
