package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.BadWordList;

@Remote
public interface BadWordMgmRemote {

	public void addBadWordList(BadWordList word);
	public void deleteBadWordList(BadWordList word);
	public BadWordList findBadWordList(int ID);
	public void updateBadWordList(BadWordList word);
	public List<BadWordList> findAllBadWordList();
}
