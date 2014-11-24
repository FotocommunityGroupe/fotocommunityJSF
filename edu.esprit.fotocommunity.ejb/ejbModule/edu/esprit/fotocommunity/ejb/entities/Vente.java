package edu.esprit.fotocommunity.ejb.entities;

import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;

import java.io.Serializable;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vente
 *
 */
@Entity
@NamedQuery(name="listVente",query="select a from Vente a")
@Table(name="tab_vente")
public class Vente implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	@ManyToOne
	private Photo photo;
	@ManyToOne
	private PremiumUser premiumUser;
	
	public PremiumUser getPremiumUser() {
		return premiumUser;
	}
	public void setPremiumUser(PremiumUser premiumUser) {
		this.premiumUser = premiumUser;
	}

	private static final long serialVersionUID = 1L;

	public Vente() {
		super();
	}   
	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}   
	

	
	public Photo getPhoto() {
		return this.photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}   
	
   
}
