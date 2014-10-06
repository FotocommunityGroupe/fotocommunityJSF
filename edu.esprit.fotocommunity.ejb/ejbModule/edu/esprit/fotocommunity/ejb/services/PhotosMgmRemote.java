package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Photo;

@Remote
public interface PhotosMgmRemote {
	public void addPhoto(Photo pic);
	public void deletePhoto(Photo pic);
	public Photo findPhoto(int IdPhoto);
	public void updatePhot(Photo pic);
	public List<Photo> findAllPhoto();

}
