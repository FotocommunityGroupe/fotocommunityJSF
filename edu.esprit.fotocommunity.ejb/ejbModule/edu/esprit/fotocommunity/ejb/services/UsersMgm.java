package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;


/**
 * Session Bean implementation class UsersMgm
 */
@Stateless
public class UsersMgm implements UsersMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
	
    public UsersMgm() {
        // TODO Auto-generated constructor stub
    }




	@Override
	public BasicUser findUser(int idUser) {
		// TODO Auto-generated method stub
		return em.find(BasicUser.class, idUser);
	}

	@Override
	public List<BasicUser> findAllUsers() {
		// TODO Auto-generated method stub
		return (List<BasicUser>) em.createNamedQuery("findAllUsers").getResultList();
	}

	@Override
	public void addBasiUser(BasicUser U) {
		// TODO Auto-generated method stub
		em.persist(U);
		
		
	}

	@Override
	public void addPremiumUser(PremiumUser U) {
		// TODO Auto-generated method stub
		em.persist(U);
		
	}

	@Override
	public void addWorldUser(WolrdUser U) {
		// TODO Auto-generated method stub
		em.persist(U);
	}




	@Override
	public void deleteBasiUser(BasicUser U) {
		// TODO Auto-generated method stub
		em.remove(em.find(BasicUser.class, U.getID_USER()));
	}




	@Override
	public void deletePremiumUser(PremiumUser U) {
		// TODO Auto-generated method stub
		em.remove(em.find(PremiumUser.class, U));
		
	}




	@Override
	public void deleteWorldUser(WolrdUser U) {
		// TODO Auto-generated method stub
		em.remove(em.find(WolrdUser.class, U));
		
	}




	@Override
	public void updateBasicUser(BasicUser U) {
		// TODO Auto-generated method stub
		em.merge(U);
		
	}




	@Override
	public void updatePremiumUser(PremiumUser U) {
		// TODO Auto-generated method stub
		em.merge(U);
	}




	@Override
	public void updateWorldUser(WolrdUser U) {
		// TODO Auto-generated method stub
		em.merge(U);
	}

}
