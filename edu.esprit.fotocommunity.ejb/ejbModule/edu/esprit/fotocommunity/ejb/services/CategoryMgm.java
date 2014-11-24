package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Category;

/**
 * Session Bean implementation class CategoryMgm
 */
@Stateless
public class CategoryMgm implements CategoryMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public CategoryMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addCat(Category c) {

     em.persist(c);
		
	}

	@Override
	public void updateCat(Category c) {
		em.merge(c);
		
	}

	@Override
	public void deleteCat(Category c) {
		em.remove(em.find(Category.class, c.getID()));
		
	}

	@Override
	public Category find(int id) {
		
		return em.find(Category.class, id);
	}

	@Override
	public List<Category> findall() {
		// TODO Auto-generated method stub
		return (List<Category>)em.createNamedQuery("listofcategories").getResultList();
	}

}
