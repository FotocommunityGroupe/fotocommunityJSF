package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;

@Remote
public interface AdminMgmRemote {
	public void addAdminManager(AdminManager A );
	public void updateAdminManager(AdminManager A );
	public AdminManager findAdmin(int iDManager);
	public List<AdminManager> findAllAdmins();
	public AdminManager connexion(String login, String pwd) ;


}
