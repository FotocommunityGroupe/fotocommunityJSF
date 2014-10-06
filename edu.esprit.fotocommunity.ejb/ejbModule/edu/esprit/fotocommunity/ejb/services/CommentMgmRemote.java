package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Comment;

@Remote
public interface CommentMgmRemote {
	public void addComment(Comment c);
	public void deleteComment(Comment c);
	public Comment findComment(int IdComment);
	public List<Comment> findAllComment();
	

}
