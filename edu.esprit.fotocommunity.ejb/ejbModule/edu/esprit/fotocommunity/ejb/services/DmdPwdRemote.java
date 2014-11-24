package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.DemandePwd;



@Remote
public interface DmdPwdRemote {
	
	

	public void addDemande(DemandePwd demande);
	public void deleteDemande(DemandePwd Demande );
	public void updateDemande(DemandePwd demande );
	
	public List<DemandePwd> findAllDemande();
	public DemandePwd findDemande(int idDemande);

}
