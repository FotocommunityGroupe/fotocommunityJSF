package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.Workshop;

@Remote
public interface WorkshopsMgmRemote {

	public void addWorkshop(Workshop w);
	public void deleteWorkshop(Workshop w);
	public Workshop findWorkshop(int IdWorkshop);
	public List<Workshop> findAllWorkshops();
}
