package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Photo;

/**
 * Session Bean implementation class PhotosMgm
 */
@Stateless
public class PhotosMgm implements PhotosMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public PhotosMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addPhoto(Photo pic) {
		// TODO Auto-generated method stub
		em.persist(pic);
		
	}

	@Override
	public void deletePhoto(Photo pic) {
		// TODO Auto-generated method stub
		em.remove(em.find(Photo.class, pic.getID()));
		
	}

	@Override
	public Photo findPhoto(int IdPhoto) {
		// TODO Auto-generated method stub
		
		return em.find(Photo.class, IdPhoto);
	}

	@Override
	public void updatePhot(Photo pic) {
		// TODO Auto-generated method stub
		em.merge(pic);
		
	}

	@Override
	public List<Photo> findAllPhoto() {
		// TODO Auto-generated method stub
		return (List<Photo>) em.createNamedQuery("ListOfPhotos").getResultList();
	}

}
