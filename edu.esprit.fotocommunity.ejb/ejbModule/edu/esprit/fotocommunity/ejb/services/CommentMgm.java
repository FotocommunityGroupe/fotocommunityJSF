package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.fotocommunity.ejb.entities.Comment;

/**
 * Session Bean implementation class CommentMgm
 */
@Stateless
public class CommentMgm implements CommentMgmRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public CommentMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addComment(Comment c) {
		// TODO Auto-generated method stub
		em.persist(c);
		
	}

	@Override
	public void deleteComment(Comment c) {
		// TODO Auto-generated method stub
		em.remove(em.find(Comment.class, c.getID()));
	}

	@Override
	public Comment findComment(int IdComment) {
		// TODO Auto-generated method stub
		return em.find(Comment.class, IdComment);
	}

	@Override
	public List<Comment> findAllComment() {
		// TODO Auto-generated method stub
		return (List<Comment>)em.createNamedQuery("ListOfComments").getResultList();
	}

}
