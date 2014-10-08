package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;

@Remote
public interface ReclamationRemote {
	
	
	
	
	public void addComplaint(Reclamation rec);
	public void deleteComplaint(Reclamation rec);
	public List<Reclamation> findAllReclamation();
	public Reclamation findReclamation(int IdReclamation);


}
