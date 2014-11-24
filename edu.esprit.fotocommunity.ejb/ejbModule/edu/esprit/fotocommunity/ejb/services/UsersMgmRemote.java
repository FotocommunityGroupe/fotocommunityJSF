package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;

@Remote
public interface UsersMgmRemote {
	public void addBasiUser(BasicUser U );
	public void addPremiumUser(PremiumUser U );
	public void addWorldUser(WolrdUser U );
	public void deleteBasiUser(BasicUser U );
	public void deletePremiumUser(PremiumUser U );
	public void deleteWorldUser(WolrdUser U );
	public BasicUser findUser(int idUser);
	public List<BasicUser> findAllUsers();
	public List<PremiumUser> findAllUsers1();
	public List<WolrdUser> findAllUsers2();
	public void updateBasicUser(BasicUser U);
	public void updatePremiumUser(PremiumUser U);
	public void updateWorldUser(WolrdUser U);
	public void updateStatutUser(int idBasicUser);
	public List<BasicUser> search(String user);

}
