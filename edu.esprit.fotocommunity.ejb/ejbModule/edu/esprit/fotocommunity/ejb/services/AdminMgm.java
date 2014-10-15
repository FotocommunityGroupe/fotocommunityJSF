package edu.esprit.fotocommunity.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.SuperAdmin;

/**
 * Session Bean implementation class AdminMgm
 */
@Stateless
public class AdminMgm implements AdminMgmRemote {

    /**
     * Default constructor. 
     */
	
	
	@PersistenceContext
	EntityManager em ; 
	
    public AdminMgm() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addAdminManager(AdminManager A) {
		
		em.persist(A);
		
		
		
	}

	@Override
	public AdminManager findAdmin(int iDManager) {
		return em.find(AdminManager.class, iDManager);

	}

	@Override
	public List<AdminManager> findAllAdmins() {
		return (List<AdminManager>)em.createQuery("test3").getResultList();

	}

	@Override
	public AdminManager connexion(String login, String pwd) {
		AdminManager admin = new AdminManager();
		admin=null;

		try {
			Query query = em
					.createQuery("select u from AdminManager u where u.username =:username and u.password =:password");
			System.out.println("em");
			
			query.setParameter("username", login).setParameter("password", pwd);
			admin = (AdminManager) query.getSingleResult();
			System.out.println(admin.getID());
			System.out.println("test2");
			
			
			
			System.out.println("test3");
			
		} catch (NoResultException e) {
		}
		if (admin==null)
			System.out.println("login ou mot de pase incorrecte");
		else 
			{if(admin instanceof SuperAdmin)
				System.out.println("AdminManager");
				else 
					System.out.println("ena superadmin");}

		return admin;
	}

}
