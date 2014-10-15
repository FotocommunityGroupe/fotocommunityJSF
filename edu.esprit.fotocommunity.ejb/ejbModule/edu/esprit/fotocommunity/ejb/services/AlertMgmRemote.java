package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Alert;
import edu.esprit.fotocommunity.ejb.entities.Reclamation;

@Remote
public interface AlertMgmRemote {
	
	
	public void addAlert(Alert al);
	public void deleteAlert(Alert al);
	public List<Alert> findAllAlert();

	public Alert findAlert(int IdAlert);

	

}
